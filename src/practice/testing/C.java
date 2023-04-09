package practice.testing;




public class C {
	//instance var
	int y;
	//static variable
	static int z =10;
	
	static final int myNum1=21;
	
	
	
	public static void main(String[] args) {
		int x=0;
		System.out.println("x is: " +x);//local variable
		C c = new C();//Calling instance var, create object
		System.out.println("y value is: "+c.y);
		System.out.println("z value:"+z);
		System.out.println(4 * 4);
		int myNum = 14;
		myNum=20;
		System.out.println("myNum: " +myNum);
		
		System.out.println(myNum1);
		
		int myNum2 = 5;
		float myFloat = 5.55f;
		char myChar = 'c';
		boolean myBoolean = true;
		String myTest = "Hello";
		long myLong = 344444L;
		double mydouble = 34.44d;
		
		
		System.out.println(myNum2);
		System.out.println(myFloat);
		System.out.println(myChar);
		System.out.println(myBoolean);
		System.out.println(myTest);
		System.out.println(myLong);
		System.out.println(mydouble);
		
	}

}
