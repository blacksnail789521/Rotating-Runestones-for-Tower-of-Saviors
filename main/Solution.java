//Solution.java
import java.util.*;

public class Solution
{
	private Board board;
	private RC init_cursor;
	private RC cursor;
	private ArrayList<Integer> path;
	private boolean is_done;
	private double score;
	private Match[] matches;
	//private Weights[][] weight;

	public Solution()
	{
		board = new Board();
		init_cursor = new RC();
		cursor = new RC();
		path = new ArrayList<Integer>();
		is_done = false;
		score = 0;
		matches = new Match[0];
	}
	
	public Solution(Board b)
	{
		board = new Board(b);
		init_cursor = new RC();
		cursor = new RC();
		path = new ArrayList<Integer>();
		is_done = false;
		score = 0;
		matches = new Match[0];
	}
	
	public Solution(Board b, RC i_rc)
	{
		board = new Board(b);
		init_cursor = new RC(i_rc);
		cursor = new RC(i_rc);
		path = new ArrayList<Integer>();
		is_done = false;
		score = 0;
		matches = new Match[0];
	}
	
	public Solution(Solution s)
	{
		board = new Board(s.board);
		init_cursor = new RC(s.init_cursor);
		cursor = new RC(s.cursor);
		path = new ArrayList<Integer>();
		for (int i = 0; i < s.path.size(); i++)
		{
			path.add(s.path.get(i));
		}
		is_done = s.is_done;
		score = s.score;
		matches = new Match[s.matches.length];
		for (int i = 0; i < s.matches.length; i++)
		{
			matches[i] = s.matches[i];
		}
	}
	
	public Solution(Board b, RC i_rc, RC rc, ArrayList<Integer> p, boolean is_d, double s, Match[] m)
	{
		board = new Board(b);
		init_cursor = new RC(i_rc);
		cursor = new RC(rc);
		path = new ArrayList<Integer>();
		for (int i = 0; i < p.size(); i++)
		{
			path.add(p.get(i));
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
	
	public Board get_Board_Solution()
	{
		return board;
	}
	
	public ArrayList<Integer> get_path_Solution()
	{
		return path;
	}
	
	public Match[] get_matches_Solution()
	{
		return matches;
	}
	
	public void set_matches_Solution(Match[] m)
	{
		for (int i = 0; i < m.length; i++)
		{
			matches[i] = m[i];
		}
	}
	
	public double get_score_Solution()
	{
		return score;
	}
	
	public void set_score_Solution(double s)
	{
		score = s;
	}
	
	public void show_score_Solution()
	{
		System.out.println("score : " + score);
	}
	
	public RC get_init_cursor_Solution()
	{
		return init_cursor;
	}
	
	public RC get_cursor_Solution()
	{
		return cursor;
	}
	
	public boolean get_is_done_Solution()
	{
		return is_done;
	}
	
	public void set_is_done_Solution(boolean a)
	{
		is_done = a;
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
	
	public void find_matches()
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
				int cur_orb = board.get_single_Board(i, j);
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
				int cur_orb = board.get_single_Board(i, j);
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
	}
	
	
	
	
	
	public void in_place_swap_orb(int dir)
	{
		RC old_rc = new RC(cursor);
		cursor.in_place_move_rc(dir);
		int orig_type = board.get_single_Board(old_rc.get_r(), old_rc.get_c());
		board.set_single_Board(old_rc.get_r(), old_rc.get_c(), board.get_single_Board(cursor.get_r(), cursor.get_c()));
		board.set_single_Board(cursor.get_r(), cursor.get_c(), orig_type);
	}
	
	public Board in_place_evaluate_solution(Weight weight)
	{
		Board original_board = new Board(board);
		Board current_board = new Board(board);
		ArrayList<Match> all_match = new ArrayList<Match>();
		
		while(true)
		{
			board = new Board(current_board);
			find_matches();
			
			if (matches.length == 0)
				break;
			
			current_board.in_place_remove_matches(board);
			current_board.in_place_drop_empty_spaces();
			
			/* for (int i = 0; i < matches.length; i++)
			{
				matches[i].show_Match();
			}
			System.out.println(); */
		
			for (int i = 0; i < matches.length; i++)
				all_match.add(matches[i]);
		}
		Match[] all_match_array = new Match[all_match.size()];
		all_match_array = all_match.toArray(all_match_array);
		
		score = compute_score(all_match_array, weight);
		matches = all_match_array;

		Board result_board = new Board(current_board);
		board = new Board(original_board);
		return result_board;
	}

	public boolean can_move_orb_in_solution(int dir)
	{
		// Don't allow going back directly. It's pointless.
		if (path.size() == 0) return cursor.can_move_orb(dir);
		else if (path.get(path.size() - 1) == (dir + 4) % 8)
			return false;

		return cursor.can_move_orb(dir);
	}
	
	public void in_place_swap_orb_in_solution(int dir)
	{
		RC old_rc = new RC(cursor);
		cursor.in_place_move_rc(dir);
		int orig_type = board.get_single_Board(old_rc.get_r(), old_rc.get_c());
		board.set_single_Board(old_rc.get_r(), old_rc.get_c(), board.get_single_Board(cursor.get_r(), cursor.get_c()));
		board.set_single_Board(cursor.get_r(), cursor.get_c(), orig_type);
		
		path.add(dir);
	}
}