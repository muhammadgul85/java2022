package practice.misc;

public class Encapsulation1 {
	private double balance = 1000.00;
	
	
	public void setBalance (double depositAmount)
	{
		balance = balance + depositAmount;
	}
	
	public double getBalance(int pin)
	{
		if(pin==4534)
		{
			return balance;
		}
		System.out.println("Invalid PIN");
		return 0;
	}
	
	
	
	
/*	private double balance = 100000.00;
	
	public void setBalance( double depoistAmount)
	{
		balance = balance + depoistAmount;
		
	}
	
	public double getBalance (int pin)
	{
		if(pin == 4534)
		{
			return balance;
		}
		System.out.println("Invalid PIN");
		return 0;
		
	}
	*/

}
