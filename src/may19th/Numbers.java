package may19th; //Check 19th May Lecture

public class Numbers {
	
	private int x,y;
	
/*	public void setXY (int a, int b)
	{
		x=a;
		y=b;
	}
	
	public void getXY()
	{
		System.out.println("x value is: " +x);

		System.out.println("y value is: " +y);
	}
	
*/
	
	public void setXY(int x, int y)
	{
		/*// with the same Variable names we get output as 0
		 * The reason is we initialise it to 0, in heap area x=0 and y=0
		 * as these are local variable and their value is 0
		 * 
		 *x=x;
		  y=y;
		 */
		
		//so to specify it we use this key word, and this operator 
		//this.x will become the value from Java Stack Area(New value)
		//whereas =x is local variable
		//Local Var dominates
		//when local var are same as Instance Var use this. keyword
		
		this.x=x; // Current calling object reference means object e.g. num when we create object of class
				 //(Numbers num =new Numbers ();)
		this.y=y;
	}
	public void getXY()
	{
		System.out.println("Value of x: "+x);
		System.out.println("Value of y:" + y);
	}
	
	
	
}
