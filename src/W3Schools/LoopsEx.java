package W3Schools;

public class LoopsEx {
	public static void main(String[] args) {
		
		int i = 0;
		while(i < 5)
		{
			System.out.println(i);
			i++;
			
		}
		
		
		int b = 0;
		do
		{
			System.out.println("Sys: " + b);
			b++;
		}
		while(b<5);
		
		
		int c =1;
		while (c <= 5)
		{
			System.out.println("Code: " +c);
			c++;
		}
		
		for(int d =0; d<=10; d++)
		{
			System.out.println("0-10: "+d);
		}
		
		for(int e=2; e< 12; e= e+2)
		{
			System.out.println("Even: "+e);
		}
		
		for (int f=1; f<16; f=f+2)
		{
			System.out.println("Odd: "+f);
		}
		
		String [] cars = {"Ford", "Mazda", "Toyota", "Buggati"};
		
		for(String j: cars)
		{
			System.out.println(j);
		}
		
		
		for (int k=0; k< 100; k++)
		{
			
			
			if (k==20)
			{
				break;
			}
			System.out.println(k);
		}
		System.out.println("*************");
		for (int l =0; l< 30; l++)
			
		{
			if (l==21)
			{
				continue;
			}
			System.out.println(l);
		}
		
		System.out.println("**************");
		int m = 0; 
		while (m<10)
		{
			System.out.println(m);
			m++;
			if(m==4)
			{
				break;
			}
		}
		
		System.out.println("************");
		int o = 0; 
		while(o<10)
		{
			System.out.println(o);
			o++;
			if(o==5)
			{
				continue;
				
			}
			//Shurliii hy ignore it
			if (o==7)
			{
				break;
			}
		}
	}

}
