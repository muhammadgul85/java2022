package practice.misc;

import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("enter value for x: ");
		Scanner scan = new Scanner (System.in);
		int x = scan.nextInt();
		
		System.out.println("Enter value of y: ");
		int y = scan.nextInt();
		
		
		try
		{
			System.out.println(x/y);
		}
		catch(ArithmeticException ee)
		{
			System.out.println("Arithmetic Excetion Message: " + ee.getMessage());
			System.out.println("Do no enter zero, try again");
		}
		
		catch(RuntimeException ae)
		{
			System.out.println("RunTime Exception Message: " + ae.getMessage());
			System.out.println("Run Program Again");
		}
		
		catch (Exception de)
		{
			System.out.println("Exception de Message:" + de.getMessage());
			System.out.println("Run Program Again");
		}
		
		finally
		{
			System.out.println("This is finally block");
		}
		System.out.println("Program Ended");

	}

}
