package com.arraylist.collection.june2;

public class WrapperClass {
	public static void main(String[] args) {
		
		int x =10;
		
		String y = Integer.toString(22);
		System.out.println(y);
		//You cannot utilise int as object therefore wrapper class comes in action
		//int is normal primitive data type which is not object oriented as we can't create object for it
		
		Integer z = 23;
		System.out.println(z);
		// x.   doesn't give you any objects however z does
		
		z.getClass();//This is example only
		
		//String to int 
		
		String a = "23333";
		//String a = "Hello"; //This will give you NumberFormatException
		
		int b = Integer.parseInt(a);
		
		System.out.println(b);
	}

}
