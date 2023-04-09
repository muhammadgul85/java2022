package com.arraylist.collection.june2;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		
		ArrayList a1 = new ArrayList();
		
		a1.add(980000088);
		a1.add("Hellow");
		
		//For Type Safety we use data type
		ArrayList <Long> a2 = new <Long> ArrayList();
		
		//Below will give compile time error as data type safety is applied and long only
		//accepted
		//a2.add("Hello");
		
		ArrayList <Double> a3 = new <Double> ArrayList();
		a3.add(223.3);
	//	a3.add(22.2f);
		
		
		
		
		
		
		
	}

}
