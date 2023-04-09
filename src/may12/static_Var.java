package may12;
// Variables is something that can hold or store some value
public class static_Var {
	
	static int z=9; //Static Variable, keyword static
	int j =10;      // Instance Variable
	public static void main(String[] args) {
		
		//Call Static Var
		System.out.println(z); // Static Var
		
		//Call Instance Var
		static_Var sv = new static_Var (); // Non Static Instance Var 
		System.out.println(sv.j);
		
		//Local Var, Can be called within Method only, Programer to initialse it
		
		int b = 44;
		System.out.println(b);
	}

	
	
	
}




