package practice.misc;

public class ConOL_FormInput {
	
	
	double passportNumber;
	long drivingLicense;
	String taxNumber;
	
	
	public ConOL_FormInput (double passportNumber)
	{
		this.passportNumber = passportNumber;
		System.out.println("Your valure are: "+(int) (Math.random()*1000000));
	}
	
	public ConOL_FormInput(double passportNumber, long drivingLicense)
	{
		this.passportNumber = passportNumber;
		this.drivingLicense = drivingLicense;
		System.out.println("Your values are: "+ (int)(Math.random()*100000));
	}
	
	public ConOL_FormInput(double passportNumber, long drivingLicense, String taxNumber)
	{
		this.passportNumber = passportNumber;
		this.drivingLicense = drivingLicense;
		this.taxNumber = taxNumber;
		System.out.println("Your values are: "+ (int)(Math.random()*100000));
	}
	
	
	public void displayCon ()
	{
		System.out.format(" ", passportNumber,drivingLicense,taxNumber);
	}
	
	

}
