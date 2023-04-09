package com.exception.reyaz;

import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {
		
		System.out.println("Enter value for x: ");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		
		System.out.println("Enter value of y: ");
		
		int y = scan.nextInt();
		
		try
		{
			int z = x/y;
			
		}
		catch(Exception e)
		{
			System.out.println("Do not enter zero, Run Prog Again: ");
		}
		
		System.out.println("Program Ended");
		
	}

}
/*
Exception means runtime error

Exception in thread "main" java.lang.ArithmeticException: / by zero
	at jun4th.ExceptionDemo.main(ExceptionDemo.java:20)


try catch mechanism

try is a block (Block means flower braces {})

try
{

//risky code ==> which may give exception or runtime error

}
catch(ExceptionClassName someReference)
{

//this block will be executed only if you get exception in try block

//we write code to handle exception by giving some instructions to User

}

finally
{

//to execute some mandatory code 
}

combinations 

try-catch
try-catch-finally
try-finally
try-catch-catch..
try-catch-catch….finally
*/