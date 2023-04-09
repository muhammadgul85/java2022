package practice.misc;

public class Reverse_Int {
	
	public static void main(String[] args) {
		
		int myNum =123;
		
		int rev=0;
		
		while(myNum>0)
		{
			rev = rev*10 + myNum % 10;
			myNum = myNum/10;
		}
			
		System.out.println("Reverse Number:  " +rev);
		
		
	}

}
