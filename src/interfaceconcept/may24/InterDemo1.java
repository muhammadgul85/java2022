package interfaceconcept.may24;

public class InterDemo1 {
	public static void main(String[] args) {
		
		System.out.println(MyInter.PI);//as it's static final constant(never change)
		
		MyInter obj = new MyClass();
	//	MyClass obj = new MyClass();//Traditional way
		
		obj.display(20);
		
		
	}

}
