//Match.java

public class Match
{
	private int type;
	private int count;
	
	public Match()
	{
		this.type = 0;
		this.count = 0;
	}

	public Match(int type, int count)
	{
		this.type = type;
		this.count = count;
	}
	
	public int get_type()
	{
		return type;
	}
	
	public int get_count()
	{
		return count;
	}
	
	public void show_Match()
	{
		if (type == 1)
			System.out.println("Y * " + count);
		else if (type == 2)
			System.out.println("P * " + count);
		else if (type == 3)
			System.out.println("B * " + count);
		else if (type == 4)
			System.out.println("R * " + count);
		else if (type == 5)
			System.out.println("G * " + count);
		else if (type == 6)
			System.out.println("H * " + count);
	}
	
	public boolean equals_Match(Match a, Match b)
	{
		return (a.type == b.type && a.count == b.count);
	}
}