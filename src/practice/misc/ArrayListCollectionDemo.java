package practice.misc;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCollectionDemo {
	
	public static void main(String[] args) {
		
		List a1 = new ArrayList();//List is a parent Class
	/*	a1.add(10);
		a1.add(20);
		a1.add(30);
		System.out.println(a1);
		System.out.println("Size of ArryaList: " + a1.size());
		*/
		a1.add("List starts here");
		a1.add(10);
		a1.add(20);
		a1.add(30);
		
		a1.add(10);
		a1.add(20);
		a1.add(30);
		
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add("Gul");
		a1.add("Reyaz");
		
		
		//System.out.println(a1);
		System.out.println("size of list: " +a1.size());
		
		for(int i=0; i<a1.size(); i++)
		{
			System.out.println(a1.get(i)+ ",");
		}
		
		
	}

}
