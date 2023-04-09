package may16;
// Code that is re-usable then create a method and call it whenever you want it.
//If you are using non-static methods you 've to create an object of CLASS
//below we are using loop, the below code looks very huge
// so to make it efficient we will create methods as in Methods_Demo1

public class Methods_Demo {
	public static void main(String[] args) {
		
		int x =5;
		int res1=0;
		
		for(int i=1; i<=x; i++)
		{
			res1 = res1+1;
		}
		
		System.out.println("Sum of " + x + " Natural Number is: " + res1);
		
		
		int y =10;
		int res2 = 0;
		
		for (int i=1;i<=y; i++ )
		{
			res2 = res2+y;
		}
		System.out.println("Sumof " +y + " Natural Number is: "+ res2);
		
		int z =100;
		int res3 = 0;
		
		for (int i=1;i<=z; i++ )
		{
			res3 = res3+i;
		}
		System.out.println("Sumof " +z + " Natural Number is: "+ res3);
		
	}

}
