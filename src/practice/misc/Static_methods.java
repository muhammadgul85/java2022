package practice.misc;

public class Static_methods {
	
	
	
	public static int staticMethod(int x)
	{
		int res=0;
		for (int i=0;i<x; i++)
		{
			res = res +i;
			if(i==10)
			{
				break;
			}
		}
		return res;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Sum of Natural No: " + Static_methods.staticMethod(4));
		
		

	}

}
