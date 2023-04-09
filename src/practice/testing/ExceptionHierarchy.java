package practice.testing;

import java.util.Scanner;

public class ExceptionHierarchy {
	
	public static void main(String[] args) {
		
		System.out.println("Enter value for x:");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		
		System.out.println("Enter value for y");
		int y = scan.nextInt();
		
		try
		{
			int z = x/y;
			System.out.println("Quotient is: " +z);
		}
		catch(Exception e)
		{
			System.out.println("Do not enter zero, Run prog again");
		}
		finally
		{
			System.out.println("This is finally block");
		}
		
		System.out.println("Prog end ");
		
		
		
		
	}

}
