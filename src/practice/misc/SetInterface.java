package practice.misc;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetInterface {
	
	public static void main(String[] args) {
		
		Set<String> hs = new <String> HashSet();//Set is Parent Interface 
		
		hs.add("Apple");
		hs.add("apple"); //this will be added due to lower-case a has a different hashcode
		
		hs.add("Banana");
		hs.add("Cherry");
		hs.add("Grape");
		hs.add("Apple"); //This is duplicate so will not be allowed as hashcode is same
		
		
		Iterator<String> it = hs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("**********************");
		
	}

}
