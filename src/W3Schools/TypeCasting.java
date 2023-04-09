package W3Schools;
/*
 * Java Type Casting
Type casting is when you assign a value of one primitive data type to another type.

In Java, there are two types of casting:

Widening Casting (automatically) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double
Widening Casting
Widening casting is done automatically when passing a smaller size type to a larger size type:


Narrowing Casting (manually) - converting a larger type to a smaller size type
double -> float -> long -> int -> char -> short -> byte
 */
public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int myInt = 9;
		double myDouble = myInt;  // Automatic casting: int to double
		System.out.println(myInt);
		System.out.println(myDouble);
		
		int Intcon = 88;
		double newD = Intcon;
		System.out.println(newD);
		
		/*
		 * Narrowing Casting
          Narrowing casting must be done manually by placing the type in parentheses in front of the value:
		 */
		
		double myDouble1 = 9.88d;
		int myInt1 = (int)myDouble1;
		
		
		 System.out.println(myDouble);   // Outputs 9.78
		 System.out.println(myInt);      // Outputs 9
		
		 String myString = "1234";
		 int foo = Integer.parseInt(myString);
		 
		 System.out.println(foo);
		 
		 
		 String myString1 = "1234";
		 //int foo1 = Integer.parseInt(myString);
		 
		 try
		 {
			int foo1 = Integer.parseInt(myString1);
		 }
		 
		 catch(NumberFormatException  e)
		 {
			// foo1 = 0;
			 System.out.println("Issue");
		 }

	}

}
