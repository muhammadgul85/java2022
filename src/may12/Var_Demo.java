package may12;


public class Var_Demo {
	//instance variable(Accessible within Class)
	int y; // Default is 0 as it will be initialised by Class Loader
	
	public static void main(String[] args) {
		
		//Local Variable// Programmer has to initialise
		//Accessible only within Method
		int x = 10;
		Var_Demo obj = new Var_Demo ();
		
		System.out.println(obj.y);
		System.out.println(x);	
	}
}
