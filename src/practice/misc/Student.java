package practice.misc;

public class Student {
	
	protected int rollNo;
	protected String sName;
	
	public void setData(int rollNo, String sName)
	{
		this.rollNo = rollNo; 
		this.sName = sName;
		
	}
	
	public void getData()
	{
		System.out.println("Roll No is: "+ rollNo + "\n Student Name is: "+ sName);
	}
	

}
