package practice.misc;

import java.util.Arrays;

public class ArrayEx3 {
	
	
	public static void main (String[] args)
	{
		
		//Declare array and add something later
		
		int [] a = new int [6];
		int []b = new int[4];
		String []c = new String [5];
		System.out.println("default int value: " + a[1]);
		System.out.println("Default int value: "+ b[1]);
		System.out.println("Default String: "+ c[1]);
		
		int [] intArray = {2,3,4,5,6,7};
		System.out.println("Printing Array: " + Arrays.toString(intArray));
		System.out.println("*******************");
		
		for (int i=0; i<intArray.length; i++)
		{
			System.out.println(intArray[i]);
		}
		
		System.out.println("*****************");
		
		a[0] = 10;
		a[1] =30;
		//1[5] = 22.333; Can't add hetrogeneous items to an array. 
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("*****************");
		//Two Dimensional Array
		int [] [] c1 = new int [3] [2];
		System.out.println("Length of c1: "+c1.length);
		System.out.println("*****************");
		//Multi Dimensional Array
		String [][] d = new String [4][2];
		System.out.println("No of rows: "+d.length);
		System.out.println("No of Columns: "+ d[0].length);
		
		d[0][0]= "Reyaz333";
		d[0][1]= "Reyaz331";
		
		d [1][0] ="Reyaz555";
		d [1][1] ="Reyaz551";
		
		d [2][0] ="Reyaz666";
		d [2][1] ="Reyaz661";
		
		d [3][0] ="Reyaz777";
		d [3][1] ="Reyaz771";
		System.out.println("*****************");
	
		for (int i=0;i<d.length; i++)
		{
			for(int j=0; j<d[i].length; j++)
			{
				System.out.println(d[i][j]+ "\t");				
			}
			System.out.println();
		}

		
		/*	
		
		for (int i=0; i<d.length; i++)
		{
			for(int j=0; j<d[i].length; j++)
			{
				System.out.println(d[i][j]+ "\t");
			}
			System.out.println();
		}
		*/
		
		
		
		
	}

}
