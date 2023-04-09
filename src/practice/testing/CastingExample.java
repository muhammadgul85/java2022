package practice.testing;

public class CastingExample {
	public static void main(String[] args) {
		System.out.println("Widnening Casting ");//Widnening Casting
		int myInt = 9;
		double myDouble = myInt; // Automatic casting: int to double
		
		System.out.println(myInt);
		System.out.println(myDouble);
		
		System.out.println("Narrowing Casting");
		
		double myDouble1 = 9.78d;
		int myInt1 = (int) myDouble1 ;
		System.out.println(myDouble1);
		System.out.println(myInt1);
		System.out.println("Widnening Casting ");//Widnening Casting
		
		int myInt2 = 8;
		double myDouble2 = myInt2;
		System.out.println(myInt2);
		System.out.println(myDouble2);
		
		
		System.out.println("Narrowing Casting");
		double myDouble3 = 8.88d;
		int myInt3 = (int) myDouble3;
		System.out.println(myDouble3);
		System.out.println(myInt3);
		
		String text = "ABCDEFGHIJKLMN";
		System.out.println("length of string: "+ text.length());
		System.out.println(text.toLowerCase());
		System.out.println(text.toUpperCase());
		System.out.println("Locate G in string");
		System.out.println("Locate G in string" +text.indexOf("G"));
		
		
		String text1 = "A  BCD   EFGHI  JK  LMN";
		System.out.println("trim: " + text.trim());
		
		
		
		
	}
	

}
