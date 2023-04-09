package abstraction.may24;

public abstract class Number {
	
	//Abstract Method
	public  abstract void compute (int x, int y);
	
	
	//Concrete Method/Normal - You can have concrete method in abstract class
	public void greet ()
	{
		System.out.println("Good Morning");
	}
}
