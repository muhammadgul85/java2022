package practice.misc;

public class StaticVar {
	
	static int z = 9;
	
	int j =10;
	
	public static void main(String[] args) {
		System.out.println(z);//Static var
		
		//Instance Var
		StaticVar sv = new StaticVar ();
		
		System.out.println(sv.j);
		
		//local can be called within method
		int b =44;
		System.out.println(b);
	}

}
