package W3Schools;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysEx {
	public static void main(String[] args) {
		
		
		String [] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		System.out.println(Arrays.toString(cars));
		
		int [] p = {1,3,4,5,6,7};
		System.out.println(Arrays.toString(p));
		
		//https://www.java67.com/2014/03/how-to-print-array-in-java-example-tutorial.html#:~:text=In%20order%20to%20print%20an,pass%20int%20array%20to%20System.
		String[][] phones = {{"Apple", "iPhone"}, {"Samsung", "Galaxy"}, {"Sony", "Xperia"}};

		System.out.println(Arrays.deepToString(phones));
		
		System.out.println("Length: " + phones.length);
		System.out.println("Length of phones: " +Array.getLength(phones));
		
		phones[1][0] = "Toshiba";
		System.out.println("After changing element");
		
		System.out.println(Arrays.deepToString(phones));
		String [][] d = new String [4][3];
		System.out.println("Rows: " + d.length);
		System.out.println("Columns: " + d[0].length);
		d[0][0]= "Reyaz333";
		d[0][1]= "Reyaz331";
		d[0][2]= "Reyaz331";
		
		d [1][0] ="Reyaz555";
		d [1][1] ="Reyaz551";
		d[1][2]= "Reyaz331";
		
		d [2][0] ="Reyaz666";
		d [2][1] ="Reyaz661";
		d[2][2]= "Reyaz331";
		
		d [3][0] ="Reyaz777";
		d [3][1] ="Reyaz771";
		d[3][2]= "Reyaz331";
		System.out.println("*****************");
		
		System.out.println("Rows: " +d.length);
		System.out.println("Column: " + d[0].length);
		for (int i=0; i< d.length; i++)
		{
			for(int j=0; j<d[i].length; j++)
			{
				System.out.println(d[i][j] + "\t");
			}
		}
		
		
		
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		
		for(int i=0; i<myNumbers.length; i++)
		{
			for (int j=0; j<myNumbers[i].length; j++)
			{
				System.out.println(myNumbers[i][j]+ "\t");
			}
			
		}
		
		System.out.println(" ****************** ");
	/*	
		var rowstring  = "";
		int [] []array = { {1, 2, 3, 4}, {5, 6, 7} };
		
		int rows = array.length;
		int columns = array[0].length;
		
		for (int i=0; i<rows; i++)
		{
			for (int j=0; j<columns; j++)
			{
				System.out.println(array[i][j] + "\t");
			}
			rowstring += [i][j]; operator issue
		}
		System.out.println(rowstring);
		*/
		
		
		
		
	}

}
