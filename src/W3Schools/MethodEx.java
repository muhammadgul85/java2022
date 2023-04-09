package W3Schools;

public class MethodEx {
	
	public static void myMethod(String fname)
	{
		System.out.println(fname + " Refsnes");
	}
	
	public static void myMethod(String fname, int age)
	{
		System.out.println(fname + " is: " + age);
	}
	
	static int myMethod(int x)
	{
		return 5+x ;
	}
	
	
	static int myMethod(int x, int y)
	{
		return x+y;
	}
	
	
	
	static int myMethod1(int f, int g)
	{
		return f+g;
	}
	
	
	static int plusMethod(int x, int y)
	{
		return x+y;
	}
	static double plusMethod(double x, double y)
	{
		return x+y;
	}
	
	public static void main(String[] args) {
		
		myMethod("Liam");
		myMethod("Jenny");
		myMethod("Anja");
		
		myMethod("Khan", 30);
		myMethod("Ali", 31);
		
		System.out.println(myMethod(4));
		System.out.println("Sum is: " + myMethod(4, 6));
		
		int store = myMethod1(4,9);
		System.out.println(store);
		
		int int1 = plusMethod(5, 4);
		double double1 = plusMethod(4.7, 5.6);
		System.out.println("int: " +int1);
		System.out.println("double: " +double1);
		
		int result = sum(10);
	    System.out.println(result);
		
	}

	public static int sum(int k) {
		
		if(k>0)
		{
			return k+sum(k-1);
		}
		else
		{
			return 0;
		}
	}

}
