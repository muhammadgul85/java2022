package W3Schools;


class CarM 
{
	int modelYear;
	String modelName;


public CarM(int year, String name)
{
	this.modelName = name;
	this.modelYear = year;
	
}
}


 class Class1
{
	public void fullThrothle ()
	{
		System.out.println("The car is going as fast as it can");
	}
	
	public void speed(int maxSpeed)
	{
		System.out.println("Max speed is: " + maxSpeed + " mph per hour");
	}
}
 class Alpha3 
 {
	 int mm;
	 Alpha3 ()
	 {
		 mm=5;
		 
	 }
 }
 
 class Const 
 {
	 int x;
	 public Const (int y)
	 {
		  x =y;
	 }
 }


public class ClassEx
{
	int x ;
	int y =20;
	final int z =10;
	
	String name = "Ali Khan";
	 String fname = "John";
	 String lname = "Doe";
	 int age = 24;
	 double salary = 60000;
	 
	 
	 
	 public ClassEx(String name, int age, double salary )
	 {
		 System.out.println(name);
	 }
	
	public ClassEx() {
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		
		Const con = new Const(5);
		System.out.println(con.x);
		
		CarM cm = new CarM(2019, "Toyota");
		System.out.println(cm.modelYear + " " + cm.modelName);
		
		
		Alpha3 a3 = new Alpha3();
		System.out.println("con var: " + a3.mm);
		Class1 myCar = new Class1();
		myCar.fullThrothle();
		myCar.speed(80);
		ClassEx myObj = new ClassEx();
		ClassEx myObj2 = new ClassEx("Ali", 23, 60000);
		myObj.x = 40;
		System.out.println(myObj.x);
		myObj.y=25;
		System.out.println(myObj.y);
		
		//myObj.z=23;
		System.out.println(myObj.z);
		System.out.println("Age: " + myObj.age);
		System.out.println(myObj.fname);
		System.out.println(myObj.lname);
		
		
		
		System.out.println("**********************");
		
		
		
		
		
	}
}

