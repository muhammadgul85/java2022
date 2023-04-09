package practice.misc;

public class InheritDemo1 {
	
	
	public static void main(String[] args) {
		
		//Case 1
		P obj = new P();
		obj.m1();
		System.out.println(obj.x);
		System.out.println("**********************");
		
		//case2
		C obj1 = new C();
		System.out.println(obj1.x);
		obj1.m1();
		
		//Case3
		//C obj2 = new P(); //You can't store a parent class object with Child
								  //If you check Class C, it's Child class as it inherits from P
		
		P obj3 = new C();
		System.out.println(obj3.x);
		obj3.m1();
		
		
		
	}

}
