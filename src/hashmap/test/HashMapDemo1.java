package hashmap.test;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo1 {

	public static void main(String[] args) {
	
		
		HashMap <Integer, String> hMap = new HashMap <Integer, String>();
		hMap.put(100, "Sam");
		hMap.put(101, "Batista");
		hMap.put(102, "Rakha");
		
		System.out.println(hMap);
		System.out.println("Size: " + hMap.size());
		System.out.println("Individual value: " + hMap.get(100));
		
		//print all entries, this is entrySet 
		
		Set<Entry<Integer, String>> entrySet = hMap.entrySet();
		
		//Entry is Interface with two methods given in print statement below
		for(Entry<Integer, String> entry:entrySet)
		{
			System.out.println(entry.getKey() + " ------" + entry.getValue());
		}
		
	}

}
