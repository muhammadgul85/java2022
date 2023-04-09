package com.arraylist.collection.june2;
// No duplicates, and it's not in order collection (it will print as per hashcode)
import java.util.HashSet;
import java.util.Iterator;



public class HashSetDemo {
	public static void main(String[] args) {
		//No Duplicates, but random not in order list of items it contains
		HashSet <String> hs = new HashSet<String>();
		
		hs.add("Apple");
		hs.add("apple"); //this will be added due to lower-case a has a different hashcode
		
		hs.add("Banana");
		hs.add("Cherry");
		hs.add("Grape");
		hs.add("Apple"); //This is duplicate so will not be allowed as hashcode is same
		
		System.out.println("Size is: " + hs.size());//Size will be same
		System.out.println(hs); // you can print it this way
		System.out.println("********************");
		
		//How to retrieve values 
		
		Iterator  <String> it = hs.iterator(); //Iterator is Class and two methods
		
		while(it.hasNext())//hasNext() method will check next element if exists then 
		{
			System.out.println(it.next());//next method is for retreival and also move cursor to next level
		}
		System.out.println("********************");
		
		
		
		//You can use Enhanced Loop, i.e. For Each Loop
		
		for(String temp:hs)//temp is var here
		{
			System.out.println(temp);
		}
		
		
		/*No Duplicates Allowed , Unique Values, Set is Interface but we will create object
		/for HashSet Class
		
		       HashSet() ==> initial capacity as 16
				HashSet(int) ==> here int specifies the initial capacity
				HashSet(int, float) ==> here float is loading factor, which measns hash set should grow when reaches it's limit, by default 0.75
				HashSet(int, float, Boolean)
				HashSet(Collection<? extends E>)
				
				Iterator 

				hasNext() : boolean ==> this methods check if there is element in next level
				next() : E   ==> this will retrieve and also moves the cursor next level


					for-each loop or Enchanced For Loop :


					syntax :

			for(Datatype someVaribale:CollectionReference)
				{

				someVaribale
				}	
		*/
		
		
	}

}
