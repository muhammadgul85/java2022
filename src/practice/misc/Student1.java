package practice.misc;

public class Student1 {
	
	
	int rollNo1;
	String sName1;
	
	public void setDetails (int rollNo1, String sName1)
	{
		this.rollNo1=rollNo1;
		this.sName1 = sName1;
		
	}
	
	public void getDetails()
	{
		System.out.println("The rollNo is: "+rollNo1 + "\n The student Name: "+ sName1);
	}

}
