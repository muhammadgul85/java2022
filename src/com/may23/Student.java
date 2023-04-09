package com.may23;

public class Student {
	
	protected int rollNo;
	protected String sName;
	
	public void setData(int rollNo, String sName)
	{
		this.rollNo= rollNo;// thi.rollNo is heap var and right  hand =rollNo; is local var
		this.sName=sName;
		
	}
	public void getDetails()
	{
		System.out.println("RollNo is: " +rollNo + "\t Student Name is: "+ sName);
	}
	

}
