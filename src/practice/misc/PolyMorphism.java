package practice.misc;

public class PolyMorphism {
	
	public void sum(int x, int y)
	{
		System.out.println("Sum is: "+ (x+y));
		
	}
	public void sum(double x, double y)
	{
		System.out.println("Sum is: "+ (x+y));
	}
	
	public void sum(float x, float y)
	{
		System.out.println("Sum is: "+ (x+y));
	}
	
	public void sum(long x, long y)
	{
		System.out.println("Sum is: "+ (x+y));
	}
	
	public void sum(double x, long y)
	{
		System.out.println("Sum is: "+ (x+y));
	}

}
