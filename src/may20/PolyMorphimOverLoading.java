package may20;

public class PolyMorphimOverLoading {
	// Create a Clock and display time, we are using this as local var
	//and instance var are same
	
	int hr, min, sec;
	
	public void setClock (int hr)
	{
		this.hr = hr;
	}
	
	public void setClock (int hr, int min)
	{
		this.hr = hr;
		this.min =min;
	}
	public void setClock (int hr, int min, int sec)
	{
		this.hr = hr;
		this.min =min;
		this.sec=sec;
	}
	
	
	public void getClock()
	{
		System.out.format("%02d:%02d:%02d", hr,min,sec);
		System.out.println();
	}

}

/*
1) println : this will print and move the cursor to the new line
2) print : this will print and the cursor stays in the same 

*
* *
* * *
* * * *
* * * * *
3)printf : to format method took from c lang
4)format : similar to printf
08:52:10
*/