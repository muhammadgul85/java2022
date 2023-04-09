package superkeyword.may24;

public class C extends P{
	int x =20;
	
	public  void display ()//if you make this method static you cannot refer to parent class using super keyword
	{
		System.out.println("This is C Class Method");
		System.out.println("C Class x value: "+ this.x);
		
		//value of P var by using super keyword
		//we use super in child class to refer to parent class obj i.e. var or method
		
		System.out.println("Current Class Parent Ref by using super keyword: " + super.x);
		
		//display method of P Class 
		super.display();
		
		// Note you cannot use super keyword inside static method  //public static void display ()
		super.see();
	}

}
