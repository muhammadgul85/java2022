package practice.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorEx {
	
	public static void main(String[] args) {
		
		
	/*	Integer [] intArray = {2,3,4,5,6,7,8,9};
		
		//Creating a list of integer
		List<Integer> list = Arrays.asList(intArray);
		
		//Create an iterator Integer list
		
		Iterator <Integer> it = list.iterator();
		
		while (it.hasNext())
		{
			System.out.println("Iterator: " + it.next() + ",");
		}
		
		
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		
		//Get the iterator
		
		Iterator<String> it1 = cars.iterator();
		//Print the first item
		//System.out.println("First item: " + it1.next());
		
		while(it1.hasNext())
		{
			System.out.println("item: " + it1.next() + ",");
		}
		
		*/
		ArrayList <Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(10);
		numbers.add(22);
		numbers.add(8);
		numbers.add(2);
		numbers.add(233);
		
		Iterator<Integer> it2 = numbers.iterator();
		while(it2.hasNext())
		{
			Integer i =it2.next();
			if(i<10)
			{
				it2.remove();
			}
		}
	System.out.println(numbers);
		
	}

}
