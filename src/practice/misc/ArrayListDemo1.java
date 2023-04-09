package practice.misc;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		
		List a2 = new ArrayList ();
		
		a2.add(98000000);
		a2.add("Hello");
		
		List<Long> a3 = new <Long>ArrayList();
		//a3.add("Hello");//Below will give compile time error as data type safety is applied and long only
		//accepted
		
		a3.add(9900999L);
		
		ArrayList <Double> a4 = new <Double> ArrayList();
		
		//a4.add(33.33f);
		a4.add(44.44);
		
		
		
		
		
		
		
		
		
		
	}

}
