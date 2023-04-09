package com.arraylist.collection.june2;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCollectionDemo {
	public static void main(String[] args) {
		
		List a1 = new ArrayList ();
		//ArrayList a1 = new ArrayList(); List is Parent, You can do either way
		
	/*	a1.add(10);
		a1.add(20);
		a1.add(30);
		System.out.println(a1);
		System.out.println(a1.size());//Capacity is 10 but output will be 3 as we have 3 value only
		When it reaches initial capacity it creates an array which is larger than previous, previous
		memory will be selected for Garbage Collection
		 and new capacity will be
		New Capacity = Currecnt.Capacity *3/2 +1 
		*/
		a1.add("List starts here:");
		a1.add(10);
		a1.add(20);
		a1.add(30);
		
		a1.add(10);
		a1.add(20);
		a1.add(30);
		
		a1.add(10);
		a1.add(20);
		a1.add(30);
		
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add("Reyaz"); //You can add int or String
		a1.add("Gul");
		System.out.println(a1);
		System.out.println(a1.size());
		
		for(int i=0; i<a1.size(); i++)
			
		{
			System.out.print(a1.get(i)+ " ,");//using get() method 
		}
		;
	}

}
