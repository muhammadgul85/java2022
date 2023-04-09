package may20;

public class C extends P{
	
	int x =20;
	
	//public static void display()
	public  void display()
	{
		System.out.println("This is C Class display method");
		System.out.println("Current Class C  x value: "+ this.x);
		
		System.out.println("Parent Class P var X value is: " + super.x);
		
		System.out.println("Below we use display method of P Class");
		super.dislpay();
		
		// Note you cannot use super keyword inside static method  //public static void display ()
		super.see();
		
		
	}

}
