package com.practice.selenium;

import java.util.Arrays;

public class ArrayExample1 {
	public static void main(String[] args) {
		
		int [] a = new int[6];
		String [][]d = new String [4][2];
		double [] z = new double [5];
		d [0] [0] = "Reyaz333"; // first row first column 
		d [0] [1] = "Reyaz4444";
		
		
		d [1][0] = "Reyaz666";
		d [1][1] = "Reyaz777";
		
		d [2] [0] = "Reyaz888";
		d [2] [1] = "Reyaz999";
		
		d [3][0] = "Reyaz8885";
		d [3][1] = "Reyaz999";
		System.out.println("Print 1st element of array a : "+ a[0]);
		
		int [] arrayint = {2,3,4,5,6,7};
		System.out.println("Array: " + Arrays.toString(arrayint));
		System.out.println(arrayint.length);
		
		for(int i=0;i<arrayint.length; i++)
		{
			System.out.println(arrayint[i]);
		}
				
		for (int j=0; j<d.length; j++)
		{
			for(int k=0; k<d[j].length; k++)
			{
				System.out.println(d[j][k] +"\t");
			}
			System.out.println();
		}
	}

}
