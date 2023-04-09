package may16;

public class Non_Methods_Demo_return_result {
	
	public int sumOfNaturalNumbers(int x)//Non-static method - it's default - We have to create object of class
	{
		
		int res=0;
		for (int i=1;i<=x;i++)
		{
			res = res+i;
		}
		return res;
		
		
	}
	public static void main(String[] args) {
	
		//Non-static method - We have to create object of class
		Non_Methods_Demo_return_result obj = new Non_Methods_Demo_return_result ();
		System.out.println("Sum of 5 Number is: " + obj.sumOfNaturalNumbers (5));

		System.out.println("Sum of 10 Number is: " + obj.sumOfNaturalNumbers (10));

		System.out.println("Sum of 100 Number is: " + obj.sumOfNaturalNumbers (100));
				
	}
}
