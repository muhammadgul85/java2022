package practice.misc;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet <String> hset = new HashSet <String>();
		hset.add("Muhammad");
		hset.add("Gul");
		hset.add("Deebz");
		
		Iterator<String> it = hset.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
