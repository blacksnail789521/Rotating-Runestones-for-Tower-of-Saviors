//Board.java

public class Board
{
	private int[][] type;
	
	public Board()
	{
		type = new int [5][6];
	}
	
	/* public void set_Board(int row, int col, int t)
	{
		type[row][col] = t;
	} */
	
	public int get_single_Board(int r, int c)
	{
		return type[r][c];
	}
	
	public Board(Board b)
	{
		type = new int [5][6];
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 6; j++)
			{
				type[i][j] = b.type[i][j];
			}
		}
	}
	
	public void set_single_Board(int r, int c, String s)
	{		
		if (s.equals("Y"))
			type[r][c] = 1;
		if (s.equals("P"))
			type[r][c] = 2;
		if (s.equals("B"))
			type[r][c] = 3;
		if (s.equals("R"))
			type[r][c] = 4;
		if (s.equals("G"))
			type[r][c] = 5;
		if (s.equals("H"))
			type[r][c] = 6;
	}
	
	public void set_single_Board(int r, int c, int t)
	{
		type[r][c] = t;
	}
	
	public void set_Board(Board b)
	{
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 6; j++)
			{
				type[i][j] = b.type[i][j];
			}
		}
	}
	
	public void set_random_Board()
	{
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 6; j++)
			{
				type[i][j] = ((int)(Math.random() * 6)) + 1;
			}
		}
	}
	
	public String digit_to_string(int t)
	{
		String result = new String();
		if (t == 1)
			result = "Y";
		else if (t == 2)
			result = "P";
		else if (t == 3)
			result = "B";
		else if (t == 4)
			result = "R";
		else if (t == 5)
			result = "G";
		else if (t == 6)
			result = "H";
			
		return result;
	}
	
	public void show_Board()
	{
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 6; j++)
			{
				if (type[i][j] == 0)
					System.out.print("  ");
				if (type[i][j] == 1)
					System.out.print("Y ");
				if (type[i][j] == 2)
					System.out.print("P ");
				if (type[i][j] == 3)
					System.out.print("B ");
				if (type[i][j] == 4)
					System.out.print("R ");
				if (type[i][j] == 5)
					System.out.print("G ");
				if (type[i][j] == 6)
					System.out.print("H ");
			
				//System.out.print(digit_to_string(type[i][j]) + " ");
			}
			System.out.println("");
		}
	}
	
	public void in_place_remove_matches(Board b)
	{	
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 6; j++)
			{
				if (b.type[i][j] != 0)
				{
					type[i][j] = 0;
				}
			}
		}
	}
	
	public void in_place_drop_empty_spaces()
	{
		for (int j = 0; j < 6; j++)
		{
			int dest_i = 4;
			for (int src_i = 4; src_i >= 0; src_i--)
			{
				if (type[src_i][j] != 0)
				{
					type[dest_i][j] = type[src_i][j];
					dest_i--;
				}
			}
			for (; dest_i >= 0; dest_i--)
			{
				type[dest_i][j] = 0;
			}
		}
	}
}