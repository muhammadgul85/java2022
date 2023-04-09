package W3Schools;

public class SwitchEx {
	public static void main(String[] args) {
		
		
		int day = 4;
		
		switch (day)
		{
		case 1:
			System.out.println("Monday");
			break;
			
		case 2: 
			System.out.println("Tuesday");
			break;
		case 3: 
			System.out.println("Wednesday");
			break;
		case 4: 
			System.out.println("Thursday");
			break;
		case 5: 
			System.out.println("Friday");
			break;
		case 6: 
			System.out.println("Satursday");
			break;
		case 7: 
			System.out.println("Sunday");
			break;
		}
		
		
		String month = "Feb";
		switch(month)
		{
		case "Jan" :
			System.out.println("January month");
			break;
		case "Feb":
		System.out.println("February month");
			break;
			
			default:
				System.out.println("Looking towards the weekend");
			
		}
	}

}
