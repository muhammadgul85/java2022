package may18;
//In our package we have ObjectCreation Class that we are using below
public class PersonDemo {

	public static void main(String[] args) {
		
		
		//Instance Var stored in Heap, allocated with default value if not assigned any value
		// We are using var and method of ObjectCreation Class below
		ObjectCreation p = new ObjectCreation ();
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.phone);
		p.greet();
		
		//"If you want to modify the heap area, you assign values as below"
		System.out.println("*********************");
		
		p.name = "John";
		p.age = 20;
		p.phone = 444094949l;
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.phone);
		p.greet();
		

	}

}
