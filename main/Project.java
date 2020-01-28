//Project.java
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Project
{
		
	
	public static void main(String args[]) 
	{ 
		Scanner input = new Scanner( System.in );
		
		Board global_board = new Board();
		Weight global_weight = new Weight();
		
		ArrayList<Solution> global_solution = new ArrayList<Solution>();
		//Solution global_solution = new Solution();
				
		System.out.println("Welcome to Auto TOS!!");
		
		System.out.println("Enter 1 to get default weight");
		System.out.println("Enter 2 to enter weight");
		System.out.println("Enter a number : ");
		
		int kind_of_weight;
		//kind_of_weight = input.nextInt();
		
		while(true)
		{
			if (/* kind_of_weight == 1 */true)
			{
				Weight w = new Weight();
				double n, m;
				w.set_single_Weight(0, 0, 0);
				w.set_single_Weight(1, 1, 1);
				w.set_single_Weight(2, 1, 1);
				w.set_single_Weight(3, 1, 1);
				w.set_single_Weight(4, 1, 1);
				w.set_single_Weight(5, 1, 1);
				w.set_single_Weight(6, 1, 1);
				
				global_weight.set_Weight(w);
				
				w.show_Weight();
				break;
			}
			
			if (kind_of_weight == 2)
			{
				System.out.println("Enter Weight:");
				Weight w = new Weight();
				double n, m;
				w.set_single_Weight(0, 0, 0);
				System.out.print("Enter Y's normal & mass:");
				n = input.nextDouble();
				m = input.nextDouble();
				w.set_single_Weight(1, n, m);
				System.out.print("Enter P's normal & mass:");
				n = input.nextDouble();
				m = input.nextDouble();
				w.set_single_Weight(2, n, m);
				System.out.print("Enter B's normal & mass:");
				n = input.nextDouble();
				m = input.nextDouble();
				w.set_single_Weight(3, n, m);
				System.out.print("Enter B's normal & mass:");
				n = input.nextDouble();
				m = input.nextDouble();
				w.set_single_Weight(4, n, m);
				System.out.print("Enter G's normal & mass:");
				n = input.nextDouble();
				m = input.nextDouble();
				w.set_single_Weight(5, n, m);
				System.out.print("Enter H's normal & mass:");
				n = input.nextDouble();
				m = input.nextDouble();
				w.set_single_Weight(6, n, m);
				
				global_weight.set_Weight(w);
				
				w.show_Weight();
				
				break;
			}
		}
		
		
		
		
		System.out.println("Enter 1 to randomize board");
		System.out.println("Enter 2 to enter board");
		System.out.print("Enter a number : ");
		
		
		int kind_of_board;
		kind_of_board = input.nextInt();
		
		while(true)
		{
			if (kind_of_board == 1)
			{
				global_board.set_random_Board();
				
				/* global_solution.find_matches();
				for (int i = 0; i < global_solution.get_matches_Solution().length; i++)
				{
					global_solution.get_matches_Solution()[i].show_Match();
				}
				
				
				global_board.in_place_remove_matches(global_solution.get_Board_Solution());
				
				global_board.in_place_drop_empty_spaces();
				global_board.show_Board(); */
				
				break;
			}
			
			if (kind_of_board == 2)
			{
				Board b = new Board();
				String str[][] = new String[5][6];
				for (int i = 0; i < 5; i++)
				{
					for (int j = 0; j < 6; j++)
					{
						str[i][j] = input.next();
					}
				}
				
				for (int i = 0; i < 5; i++)
				{
					for (int j = 0; j < 6; j++)
					{
						b.set_single_Board(i, j, str[i][j]);
					}
				}
				
				global_board.set_Board(b);
				
				break;
			}
		}
		
		System.out.println();
		global_board.show_Board();
		//global_solution.set_Board_Solution(global_board);
		
		
		//System.out.println("~~~~~~~~~~~~~~~~~");
		//Board result_board = new Board(global_solution.in_place_evaluate_solution(global_weight));
		/* for (int i = 0; i < global_solution.get_matches_Solution().length; i++)
		{
			global_solution.get_matches_Solution()[i].show_Match();
		} */
		//result_board.show_Board();
		
		//System.out.println("Score : " + global_solution.get_score_Solution());
		
		
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 6; j++)
			{
				RC i_rc = new RC(i, j);
				Solution global_solution_tmp = new Solution(global_board, i_rc);
				global_solution.add(global_solution_tmp);
			}
		}
		

		
		/* global_solution.get(7).in_place_swap_orb_in_solution(3);
		global_solution.get(7).get_init_cursor_Solution().show_RC();
		global_solution.get(7).get_cursor_Solution().show_RC();
		global_solution.get(7).get_Board_Solution().show_Board(); */
		
		for (int p = 0; p < 16; p++)
		{
			int count = global_solution.size();
			for (int i = 0; i < count; i++)
			{
					
				if (global_solution.get(i).get_is_done_Solution())
					continue;
					
				for (int dir = 0; dir < 8; dir++)
				{
					if (!global_solution.get(i).can_move_orb_in_solution(dir))
						continue;
						
					Solution global_solution_tmp = new Solution(global_solution.get(i));
					global_solution_tmp.in_place_swap_orb_in_solution(dir);
					global_solution_tmp.in_place_evaluate_solution(global_weight);
					global_solution.add(global_solution_tmp);
					

				}
				global_solution.get(i).set_is_done_Solution(true);
			}
			
			for (int i = 1; i < global_solution.size(); i++)
			{
				for (int j = 0; j < i; j++)
				{
					if (global_solution.get(i).get_score_Solution() > global_solution.get(j).get_score_Solution())
					{
						Solution tmp = new Solution(global_solution.get(i));
						global_solution.set(i, global_solution.get(j));
						global_solution.set(j, tmp);
						//global_solution.get(i) = new Solution(global_solution.get(j));
						//global_solution.get(j) = new Solution(tmp);
					}
				}
			}
			
			if (global_solution.size() > 480)
				global_solution.subList(480, global_solution.size()).clear();
		}
		
		//System.out.println(global_solution.get(0).get_matches_Solution().length);
		
		
		
		for (int i = 0; i < global_solution.get(0).get_matches_Solution().length; i++)
		{
			global_solution.get(0).get_matches_Solution()[i].show_Match();
		}
		
		global_solution.get(0).get_init_cursor_Solution().show_RC();
		global_solution.get(0).get_cursor_Solution().show_RC();
		for (int i = 0; i < global_solution.get(0).get_path_Solution().size(); i++)
		{
			System.out.print(global_solution.get(0).get_path_Solution().get(i) + " ");
		}
		System.out.println();
	}
}