package may17;

public class ReverseInteger {
	public static void main(String[] args) {

		/*
		 * int num = 123; System.out.println(123%10);
		 * 
		 * System.out.println(123/10);
		 * 
		 * System.out.println(1%10);
		 * 
		 * System.out.println(1/10);
		 */

		int num = 123;
		int rev = 0;

		while (num > 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}

		System.out.println("Reverse number: " + rev);
	}

}
