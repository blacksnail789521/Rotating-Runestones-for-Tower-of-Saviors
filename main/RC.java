//RC.java

public class RC
{
	private int row;
	private int col;
	
	public RC()
	{
		row = 0;
		col = 0;
	}

	public RC(int row, int col)
	{
		this.row = row;
		this.col = col;
	}
	
	public RC(RC rc)
	{
		row = rc.row;
		col = rc.col;
	}
	
	public RC get_RC(int row, int col)
	{
		RC result = new RC(row, col);
		
		return result;
	}
	
	public int get_r()
	{
		return row;
	}
	
	public int get_c()
	{
		return col;
	}
	
	public boolean equals_RC(RC a, RC b)
	{
		return (a.row == b.row && a.col == b.col);
	}
	
	public boolean can_move_orb(int dir)
	{
		switch (dir) 
		{
			case 0: return            col < 5;
			case 1: return row < 4 && col < 5;
			case 2: return row < 4;
			case 3: return row < 4 && col > 0;
			case 4: return            col > 0;
			case 5: return row > 0 && col > 0;
			case 6: return row > 0;
			case 7: return row > 0 && col < 5;
		}
		return false;
	}
	
	public void in_place_move_rc(int dir)
	{
		switch (dir)
		{
			case 0:           col += 1; break;
			case 1: row += 1; col += 1; break;
			case 2: row += 1;           break;
			case 3: row += 1; col -= 1; break;
			case 4:           col -= 1; break;
			case 5: row -= 1; col -= 1; break;
			case 6: row -= 1;           break;
			case 7: row -= 1; col += 1; break;
		}
	}
	
	public void show_RC()
	{
		System.out.println("( " + row + ", " + col + " )");
	}
}