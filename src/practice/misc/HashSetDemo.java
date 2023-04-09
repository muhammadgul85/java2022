package practice.misc;

import java.util.HashSet;
import java.util.Iterator;

//No duplicates, and it's not in order collection (it will print as per hashcode)
//No Duplicates, but random not in order list of items it contains
public class HashSetDemo {
	
	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Apple");
		hs.add("apple");
		hs.add("Banana");
		hs.add("Cherry");
		hs.add("Grape");
		hs.add("Apple");
		System.out.println("size is: "+ hs.size());
		System.out.println(hs);
		System.out.println("******************");
		
		//Retrieve values
		
		Iterator<String> it = hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("*************************");
		
		//You can use enhanced loop
		
		for(String temp:hs)
		{
			System.out.println(temp);
		}
		
		
		
		
		
	}

}
