package may16;

import java.util.Scanner;

public class BMI_Formula {
	
	public static void main(String[] args) {
		BMI_Formula BMI = new BMI_Formula();
		BMI.BMI();
		
	}
	
	public void BMI ()
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your weight in kilograms");
		double weight = sc.nextDouble();
		
		System.out.println("Enter your height in meters");
		double height = sc.nextDouble();
		double BMI = weight/ (height * height) ;
		
		System.out.println("The Body BMI is" + BMI);
		
		
		
	}
	

}
