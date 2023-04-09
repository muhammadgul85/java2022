package practice.misc;

import java.util.Arrays;

public class ArrayEx {
	public static void main(String[] args) {
		
		int [] a=new int [6];
		a[0] =1;
		a[1] = 2;
		a [2] =3;
		a[3] = 4;
		a[4] = 5;
		a[5] = 5;
		//System.out.println(a[1]);
		//System.out.println(Arrays.toString(a));
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i] + ",");
		}
		System.out.println();
		//Two Dimensional Array
				int [] [] c = new int [3] [2]; 
				
				//Multi Dimensional Array
				String [][] d= new String [4][2];
				
				System.out.println("no of rows: " + c.length);
				System.out.println("no of columns: "+ c[0].length);
	}

}
