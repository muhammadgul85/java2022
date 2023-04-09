package hashmap.test;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx1 {

	public static void main(String[] args) {

	HashMap<Integer, String> hmp =	new HashMap<Integer, String>();
	hmp.put(101, "Deebs");
	hmp.put(103, "Abdul");
	hmp.put(102, "Mehru");
	
	//Capture in EntrySet()
	Set<Entry<Integer, String>>entryset = hmp.entrySet();
		for(Entry<Integer, String> ent:entryset)
		{
			System.out.println(ent.getKey() + " ---- " + ent.getValue());
		}
		
	}

}
