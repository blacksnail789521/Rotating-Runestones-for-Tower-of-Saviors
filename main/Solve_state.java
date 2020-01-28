//Solve_state.java
import java.util.*;

public class Solve_state
{
	private Solution[] solution;
	private int max_length;;
	private int p;
	
	step_callback: step_callback,
	finish_callback: finish_callback

	public Solution()
	{
		board = new Board();
		init_cursor = new RC();
		cursor = new RC();
		path = new Path[0];
		is_done = false;
		score = 0;
		matches = new Match[0];
	}
	
	
	
	public Solution(Board b, RC i_rc, RC rc, Path[] p, boolean is_d, double s, Match[] m)
	{
		board = new Board(b);
		init_cursor = new RC(i_rc);
		cursor = new RC(rc);
		path = new Path[p.length];
		for (int i = 0; i < p.length; i++)
		{
			path[i] = p[i];
		}
		is_done = is_d;
		score = s;
		matches = new Match[m.length];
		for (int i = 0; i < m.length; i++)
		{
			matches[i] = m[i];
		}
	}
	
	public void set_Board_Solution(Board b)
	{
		board = new Board(b);
	}
	
	public Match[] get_matches_Solution()
	{
		return matches;
	}
	
	public boolean equals_matches(Match[] a, Match[] b)
	{
		boolean result = true;
		if (a.length != b.length)
			return false;
		else
		{
			for (int i = 0; i < a.length; i++)
			{
				if (!a[i].equals_Match(a[i], b[i]))
					result = false;
			}
		}
		
		return result;
	}
	
	public double compute_score(Match[] m, Weight w)
	{
		double score = 0;
		
		for (int i = 0; i < m.length; i++)
		{
			double multi_orb_bonus = (m[i].get_count() - 3) * 0.25 + 1;
			double base_weight = w.get_single_Weight(m[i].get_type(), m[i].get_count() < 5 ? 0 : 1);
			score += multi_orb_bonus * base_weight;
		}
		
		double combo_bonus = (m.length - 1) * 0.25 + 1;
		
		return score * combo_bonus;
	}
	
	public void find_matches(Board b)
	{
		Board match_board = new Board();

		// 1. filter all 3+ consecutives.
		//horizontals
		for (int i = 0; i < 5; i++)
		{
			int prev_1_orb = 0;
			int prev_2_orb = 0;
			for (int j = 0; j < 6; j++)
			{
				int cur_orb = b.get_single_Board(i, j);
				if (prev_1_orb == prev_2_orb && prev_2_orb == cur_orb && cur_orb != 0)
				{
					match_board.set_single_Board(i, j, cur_orb);
					match_board.set_single_Board(i, j - 1, cur_orb);
					match_board.set_single_Board(i, j - 2, cur_orb);
				}
				prev_1_orb = prev_2_orb;
				prev_2_orb = cur_orb;
			}
		}
		//verticals
		for (int j = 0; j < 6; j++)
		{
			int prev_1_orb = 0;
			int prev_2_orb = 0;
			for (int i = 0; i < 5; i++)
			{
				int cur_orb = b.get_single_Board(i, j);
				if (prev_1_orb == prev_2_orb && prev_2_orb == cur_orb && cur_orb != 0)
				{
					match_board.set_single_Board(i, j, cur_orb);
					match_board.set_single_Board(i - 1, j, cur_orb);
					match_board.set_single_Board(i - 2, j, cur_orb);
				}
				prev_1_orb = prev_2_orb;
				prev_2_orb = cur_orb;
			}
		}

		Board scratch_board = new Board(match_board);

		// 2. enumerate the matches by flood-fill.
		ArrayList<Match> matches_tmp = new ArrayList<Match>();
		for (int i = 0; i < 5; ++ i)
		{
			for (int j = 0; j < 6; ++ j)
			{	
				int cur_orb = scratch_board.get_single_Board(i, j);
				if (cur_orb == 0) { continue; }
				ArrayList<RC> stack = new ArrayList<RC>();
				RC rc = new RC(i, j);
				stack.add(rc);
				int count = 0;
				while (stack.size() > 0)
				{	
					RC n = new RC(stack.get(stack.size() - 1));
					stack.remove(stack.size() - 1);
					if (scratch_board.get_single_Board(n.get_r(), n.get_c()) != cur_orb) { continue; }
					count++;
					scratch_board.set_single_Board(n.get_r(), n.get_c(), 0);
					if (n.get_r() > 0)
					{
						RC rc_tmp = new RC(n.get_r() - 1, n.get_c());
						stack.add(rc_tmp);
					}
					if (n.get_r() < 4)
					{
						RC rc_tmp = new RC(n.get_r() + 1, n.get_c());
						stack.add(rc_tmp);
					}
					if (n.get_c() > 0)
					{
						RC rc_tmp = new RC(n.get_r(), n.get_c() - 1);
						stack.add(rc_tmp);
					}
					if (n.get_c() < 5)
					{
						RC rc_tmp = new RC(n.get_r(), n.get_c() + 1);
						stack.add(rc_tmp);
					}
				}
				
				Match match = new Match(cur_orb, count);
				matches_tmp.add(match);
			}
		}
		matches = new Match[matches_tmp.size()];
		matches = matches_tmp.toArray(matches);
		board = new Board(match_board);
		//Solution result = new Solution(match_board, matches_array);
		//return result;
	}
	
	public void in_place_remove_matches(Board b, Board match_board)
	{
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 6; j++)
			{
				if (match_board.get_single_Board(i, j) != 0)
					b.set_single_Board(i, j, 0);
			}
		}
	}
	
	public void in_place_drop_empty_spaces(Board b)
	{
		for (int j = 0; j < 6; j++)
		{
			int dest_i = 4;
			for (int src_i = 4; src_i >= 0; src_i--)
			{
				if (b.get_single_Board(src_i, j) != 0)
				{
					b.set_single_Board(dest_i, j, b.get_single_Board(src_i, j));
					dest_i--;
				}
			}
			for (; dest_i >= 0; dest_i--)
			{
				b.set_single_Board(dest_i, j, 0);
			}
		}
	}
	
	public void in_place_swap_orb(Board b, RC rc, int dir)
	{
		RC old_rc = new RC(rc);
		rc.in_place_move_rc(dir);
		int orig_type = b.get_single_Board(old_rc.get_r(), old_rc.get_c());
		b.set_single_Board(old_rc.get_r(), old_rc.get_c(), b.get_single_Board(rc.get_r(), rc.get_c()));
		b.set_single_Board(rc.get_r(), rc.get_c(), orig_type);
		
		
		//return {board: board, rc: rc};
	}
	
	/* public void in_place_evaluate_solution(Solution solution, weights)
	{
		var current_board = copy_board(solution.board);
		var all_matches = [];
		while (true) {
			var matches = find_matches(current_board);
			if (matches.matches.length == 0) {
				break;
			}
			in_place_remove_matches(current_board, matches.board);
			in_place_drop_empty_spaces(current_board);
			all_matches = all_matches.concat(matches.matches);
		}
		solution.weight = compute_weight(all_matches, weights);
		solution.matches = all_matches;
		return current_board;
	} */

	
	

}