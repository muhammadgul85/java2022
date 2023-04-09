package iterator.practice;

import java.util.Scanner;

public class SwitchPractice {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		System.out.println("Enter no beteen 1 - 5");
		Scanner scan = new Scanner (System.in);
		int day  = scan.nextInt();
		
		
		switch(day)
		{
		
		case 1:
			System.out.println("Today is Monday");
			break;
		case 2:
			System.out.println("Today is Tuesday");
			break;
		case 3: 
			System.out.println("Today is Wednesday");
			break;
			
		case 4:
			System.out.println("Today is Thursday");
			break;
		case 5:
			System.out.println("Today is Friday");
		}
		
			

	}

}
