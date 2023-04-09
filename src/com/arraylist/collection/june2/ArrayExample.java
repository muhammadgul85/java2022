package com.arraylist.collection.june2;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {


		//Declare Array and add something later
		int [] a = new int[6];
		//Flower braces, if you 've values in hand, directly initialise 
		
		
		System.out.println("Default Value: " + a[1]);//Default value is zero 
		System.out.println("*****************");
		int [] intarray = {2,3,4,5,6,7};
		//To Print Array with Arrays.toString Method
		System.out.println("PrintArray: " + Arrays.toString(intarray));
		System.out.println("*****************");
		for (int i=0; i<intarray.length; i++)
		{
			System.out.println(intarray[i]);
		}
		System.out.println("*****************");
		a[0]=10;
		a[5]=30;
	//	a[4] = 22.333; Can't add hetrogeneous items to an array.
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
				
		System.out.println("*****************");
		
		//Two Dimensional Array
		int [] [] c = new int [3] [2]; 
		
		//Multi Dimensional Array
		String [][] d= new String [4][2];
		
		//Length, you can find columns 
		
		System.out.println("no of Rows: " + d.length);
		System.out.println("No of Column: "+ d[0].length);
		
		d [0] [0] = "Reyaz333"; // first row first column 
		d [0] [1] = "Reyaz4444";
		
		
		d [1][0] = "Reyaz666";
		d [1][1] = "Reyaz777";
		
		d [2] [0] = "Reyaz888";
		d [2] [1] = "Reyaz999";
		
		d [3][0] = "Reyaz8885";
		d [3][1] = "Reyaz999";
		
		for (int i =0; i< d.length; i++)
		{
			for (int j=0; j<d[i].length; j++)
			{
				System.out.println(d[i] [j] + "\t"); //Rows + Column
			}
			System.out.println();
		}

	}

}
