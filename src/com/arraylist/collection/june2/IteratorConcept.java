
package com.arraylist.collection.june2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorConcept {

	public static void main(String[] args) {
		Set<String> hs = new HashSet<String>(); //Set is Parent Interface
		hs.add("Apple");
		hs.add("apple"); //this will be added due to lower-case a has a different hashcode
		
		hs.add("Banana");
		hs.add("Cherry");
		hs.add("Grape");
		hs.add("Apple"); //This is duplicate so will not be allowed as hashcode is same
		
		System.out.println("Print HashSet: "+ hs);
		System.out.println("*******Print using Iterator Class************");
		
		Iterator<String>itr = hs.iterator();///Iterator is Class and has two methods, it's used to loop through
		
		while(itr.hasNext())//hasNext() method will check next element if exists then 
		{
			System.out.println(itr.next());//next method is for retreival and also move cursor to next level
		}
		System.out.println("****");

	}

}
