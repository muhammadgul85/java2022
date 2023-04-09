package iterator.practice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer [] intarray = {2,3,4,5,6,7,9};
		
		//Arrays.stream(intarray).forEach(System.out::print);
		
		//Creating a list of integer
		
		List<Integer> list = Arrays.asList(intarray);
		
		//Create an iterator Integer list
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext())
		{
			System.out.print("Iterator: " +it.next()+ ",");
		}

	}

}
