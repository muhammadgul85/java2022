package may20;

public class FormForInput {
	double passportNumber;
	double drivingLicense;
	String taxNumber;
	public FormForInput (double passportNumber){
		this.passportNumber = passportNumber;
		System.out.println("Your value are: "+ (int)(Math.random()*1000000));
		
	}
	public FormForInput (double passportNumber, long drivingLicense )
	{
		this.passportNumber= passportNumber;
		this.drivingLicense = drivingLicense;
		System.out.println("Your value are: "+ (int)(Math.random()*1000000));
	}
		
	public FormForInput (double passportNumber, double drivingLicense, String taxNumber)
	{
		this.passportNumber = passportNumber;
		this.drivingLicense = drivingLicense;
		this.taxNumber = taxNumber;
		System.out.println("Your value are: "+ (int)(Math.random()*1000000));
	}
	public void displayCon()
	{
		System.out.format(" ", passportNumber,drivingLicense,taxNumber);
	}
}
