package may16;

// When we have something common we use static method, this will not be cleaned by the GC, 


public class Static_Methods {
	
	public static void main(String[] args) {
		// You can use without Class and you don't have create object of class
		System.out.println("sum of Natural No " +staticmethod (5));
		System.out.println("sum of Natural No " +staticmethod (10));
		System.out.println("sum of Natural No " +staticmethod (100));
		
		
		//Convention or Best way is to use classname.
		System.out.println("sum of Natural No " +Static_Methods.staticmethod (9));
		System.out.println("sum of Natural No " +Static_Methods.staticmethod (109));
		System.out.println("sum of Natural No " +Static_Methods.staticmethod (1009));
	}	
	public static int  staticmethod (int x)
	{
		int res =0;
		for (int i=1;i<=x; i++)
		{
			res =res+i;
		}
		return res;
	}
}



