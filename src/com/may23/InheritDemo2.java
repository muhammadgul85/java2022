package com.may23;

public class InheritDemo2 {
	public static void main(String[] args) {
		
		
		
		//Case 1
		P obj = new P ();
		System.out.println(obj.x);
		obj.m1();
		
		//Case 2 
		C obj1 = new C ();
		System.out.println(obj1.x);
		obj1.m1();
		
		//Case3
		//C obj2 = new P(); //You can't store a parent class object with Child
						  //If you check Class C, it's Child class as it inherits from P
		
		
		//Case 4 
		
		P obj3 = new C(); //Valid, as you can store Child class object with Parent
						  // upcasting 
		
		System.out.println(obj3.x); // Var value will not be overridden only method overriden 
									// Value of P will be 10 as in P Class which is parent class
		obj3.m1();
	}

}
