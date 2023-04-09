package W3Schools;

public class ConstructorEx {
	int hr, min, sec;
	
	public ConstructorEx () {
		hr=10;
		min=14;
		sec=20;
				
		System.out.println("Default Constructor");
		
	}
	
	ConstructorEx (int hr)
	{
		this.hr = hr;
		System.out.println("hr is: " + hr);
	}
	ConstructorEx (int hr, int min)
	
	{
		this.hr = hr;
		this.min = min;
		
		System.out.println("hr is: " + hr + " mins are: "+min);
	}
	
	ConstructorEx (int hr, int min, int sec)
	{
		this.hr = hr;
		this.min = min;
		this.sec = sec;
		System.out.println("hr is: " + hr + " mins are: "+min + " seconds are: " + sec);
	}
	public void displayClock ()
	{
		System.out.format("%02d:%02d:%02d:", hr,min,sec);
		System.out.println();
	}
	

}
