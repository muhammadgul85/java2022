package W3Schools;

public class BooleansEx {
	public static void main(String[] args) {
		
		
		int x = 10;
		int y =9;
		
		System.out.println("x greateer than y: " + (x>y));
		
		System.out.println("x smaller than y: " + (x<y));
		System.out.println("x equal to y: " + (x>y));
		System.out.println(44==99);
		
		if(x> y)
		{
			System.out.println("x is greater than y");
		}
		else
		{
			System.out.println("x is smaller than y");
		}
		
		double time = 19.00;
		if(time > 20.00)
		{
			System.out.println("Good evening");
		}
		else if(time < 20.00)
		{
			System.out.println("Good afternoon");
		}
		else
		{
			System.out.println("Better check time");
		}
		
		
		int tme = 20;
		if(tme < 18)
		{
			System.out.println("Good day");
		}
		else
		{
			System.out.println("Good Evening");
		}
		
		int tm = 20;
		String result = (tm < 18) ? "Good Evening" : "Good Night";
		System.out.println(result);
		
		
		int pab = 23;
		String res= (pab < 23) ? "Good Evening" : "Good Night";
		System.out.println("Result is: " + res);
		
		int ab = 10;
		int ba = 10;
		
		if(ab != ba )
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not equal");
		}
		
	}
	
	
	

}
