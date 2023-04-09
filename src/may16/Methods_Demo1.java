package may16;

public class Methods_Demo1 {
	
	public void sumOfNaturalNumbers(int x)//Non-static method - it's default - We have to create object of class
	{
		
		int res=0;
		for (int i=1;i<=x;i++)
		{
			res = res+i;
		}
		System.out.println("Sum of "+x+ " Natural No is: " + res);
		
	}
	public static void main(String[] args) {
	
		//Non-static method - We have to create object of class
		Methods_Demo1 obj = new Methods_Demo1 ();
		obj.sumOfNaturalNumbers (5);
		obj.sumOfNaturalNumbers(10);
		obj.sumOfNaturalNumbers(100);		
	}
}
