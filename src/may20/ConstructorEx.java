package may20;
//Constructor is simliar to method, below is overloading of constructor
/*Constructor is used to initialize an object whereas method is used to displays/shows functionality of an object.
 * //constructor name and class name should be same 
//if we are not declaring any constructor in pgm -
//java automatically create a default constructor  - 
//wich is called a blank constructor
//if person declare a construtor , than java not create any default constructor
//constructor name and class name should be same 
/*if we are not creating constructor, java automatically creates constructor, which is called a bland constructor
If we declare a constructor, Java doesn't create default constructor
cons a = new cons (); // here after new we declare constructor
we can pass parameter to constructor, when we declare it 
cons a = new cons (); // here we are creating object 'a' of class and calling constructor which is cons();
If we don't call constructor, the program wouldn't run, hence we can't call object without calling constructor
with changing signature you can use constructor overloading like method overloading with constructor
Constructor Overriding is not possible as we have to use extend keyword, therefore it is not possible, 

String by default is NULL , if you don't declare
int by default is 0, if you don't declare it
*/

/*

Constructors are invoked implicitly whereas methods are invoked explicitly.

Constructor does not return any value where the method may/may not return a value.

In case constructor is not present, a default constructor is provided by java compiler. In the case of a method, no default method is provided.

Constructor should be of the same name as that of class. Method name should not be of the same 
 */
public class ConstructorEx {
	
	int hr, min, sec;
	
	public ConstructorEx () {
		hr=10;
		min=14;
		sec=20;
				
		System.out.println("Default Constructor");
		
	}
	
	public ConstructorEx (int hr) {
		
		this.hr =hr;
		System.out.println("1 Parameter Constructor");
	}
	
	public ConstructorEx(int hr, int min)
	{
		this.hr=hr;
		this.min=min;

		System.out.println("2 Parameter Constructor");
		
	}
	public ConstructorEx(int hr, int min, int sec)
	{
		this.hr=hr;
		this.min=min;
		this.sec=sec;

		System.out.println("3 Parameter Constructor");
	}
	
	public void displayClock ()
	{
		System.out.format("%02d:%02d:%02d:", hr,min,sec);
		System.out.println();
	}
	
	
	
	}


