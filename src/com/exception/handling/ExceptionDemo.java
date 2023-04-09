package com.exception.handling;

import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {
		//Exception means RunTime Error
		
		try
		{
		System.out.println("Enter value for x: ");
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt();
		
		System.out.println("Enter value for y: ");
		int y = sc.nextInt();
		
		int z = x/y;
		System.out.println("Quotient is: " +z);
		System.out.println("End of Program");
		}
		catch (ArithmeticException e)
		{
			System.out.println("Do no enter 0 and retry");
		}
		
		
	}

}
