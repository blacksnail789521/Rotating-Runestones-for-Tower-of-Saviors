//Weights.java

public class Weight
{
	private double[][] weight;

	public Weight()
	{
		weight = new double [7][2];
	}
	
	public Weight(Weight w)
	{
		weight = new double [7][2];
		
		for (int i = 1; i < 7; i++)
		{
			for (int j = 0; j < 2; j++)
			{
				weight[i][j] = w.weight[i][j];
			}
		}
	}
	
	public void set_single_Weight(int type, double normal, double mass)
	{
		weight[type][0] = normal;
		weight[type][1] = mass;
	}
	
	public void set_Weight(Weight w)
	{
		for (int i = 1; i < 7; i++)
		{
			for (int j = 0; j < 2; j++)
			{
				weight[i][j] = w.weight[i][j];
			}
		}
	}
	
	public double get_single_Weight(int i, int j)
	{
		return weight[i][j];
	}
	
	public void show_Weight()
	{
		for (int i = 1; i < 7; i++)
		{
			for (int j = 0; j < 2; j++)
			{
				if (j == 0)
				{
					if (i == 1)
						System.out.print("Y's normal : ");
					if (i == 2)
						System.out.print("P's normal : ");
					if (i == 3)
						System.out.print("B's normal : ");
					if (i == 4)
						System.out.print("R's normal : ");
					if (i == 5)
						System.out.print("G's normal : ");
					if (i == 6)
						System.out.print("H's normal : ");
				}
					
				else if (j == 1)
				{
					if (i == 1)
						System.out.print("Y's mass : ");
					if (i == 2)
						System.out.print("P's mass : ");
					if (i == 3)
						System.out.print("B's mass : ");
					if (i == 4)
						System.out.print("R's mass : ");
					if (i == 5)
						System.out.print("G's mass : ");
					if (i == 6)
						System.out.print("H's mass : ");
				}
				System.out.println(weight[i][j] + "   ");
			}
			System.out.println("");
		}
	}
	
	
}