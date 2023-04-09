package com.exception.reyaz;

import java.util.Scanner;

public class ExceptionHeirarchy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter value for x: ");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		
		System.out.println("Enter value of y: ");
		
		int y = scan.nextInt();
		
		try
		{
			int z = x/y;
			System.out.println("Quotient is: "+z);
			
		}
		
		
		//HeirArchy Order
		catch(ArithmeticException ee)//
		{
			System.out.println("Arithmetic Exception " +ee.getMessage());
			System.out.println("Do not enter zero, Run Prog Again: ");
		}
		
		
		catch(RuntimeException ae)//
		{
			System.out.println("RuntimeException:! " +ae.getMessage());
			System.out.println("Do not enter zero, Run Prog Again: ");
		}
		catch(Exception ce)//
		{
			System.out.println("Exception:! " +ce.getMessage());
			System.out.println("Do not enter zero, Run Prog Again: ");
		}
		
		finally //What is difference between final, finally, finalise
		{
			//To Execute some mandatory code we use finally
			System.out.println("This is finally block");
		}
		System.out.println("Program Ended");
		
	}
	}


