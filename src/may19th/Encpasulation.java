package may19th;

public class Encpasulation {
	
	//double balance = 10000.000; this can be accessed so we have to make it private
	// but if we make variables private we can't access it
	//only way is through getters and setters we will be able to access private variables
	
	
	private double balance = 10000.00;
	
	
	public void setBalance (double depositAmount)
	{
		balance = balance +depositAmount;
	}
	
	public double getBalance(int pin)
	{
		//validation
		if (pin == 4534)
		{
			return balance;
		}
		System.out.println("Invalid Pin");
		return 0;
	}
	
	
	
	
	
	

}
