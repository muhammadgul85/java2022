package practice.misc;

public class ArrayEx1 {
	public static void main(String[] args) {
		String [] [] d = new String [4] [2];
		d [0] [0] = "Reyaz333"; // first row first column 
		d [0] [1] = "Reyaz4444";
		
		
		d [1][0] = "Reyaz666";
		d [1][1] = "Reyaz777";
		
		d [2] [0] = "Reyaz888";
		d [2] [1] = "Reyaz999";
		
		d [3][0] = "Reyaz8885";
		d [3][1] = "Reyaz999";
		
		for (int i=0;i < d.length; i++)
		{
			for (int j=0; j<d[i].length; j++)
			{
				System.out.println(d[i][j] + "\t");
			}
			System.out.println();
		}
		
	}

}
