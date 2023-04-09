package W3Schools;
/*
 * The solution to avoid this problem, is to use the backslash escape character.

The backslash (\) escape character turns special characters into string characters:

Escape character	Result	Description
\'	'	Single quote
\"	"	Double quote
\\	\	Backslash
 */
public class StringsEx {
	public static void main(String[] args) {
		
		
		String text = "ABCDEFDJDJDJDJLL";
		System.out.println("length: "+text.length());
		System.out.println("first char" + text.charAt(0));

		System.out.println("lower case: " + text.toLowerCase());
		
		
		String txt = "Please locate where 'locate' occurs!";
		
		System.out.println("find locate: "+ txt.indexOf("locate"));
		
		String txt1 = "We are the so-called \"Vikings\" from the north";
		System.out.println(txt1);
		String txt3 = "It\'s alright";
		System.out.println(txt3);
		//The sequence \\  inserts a single backslash in a string:
		
		
		String txt4 = "The character \\ is called backslash.";
		System.out.println(txt4);
		
		System.out.println(Math.max(4, 5));
		
		System.out.println(Math.min(4, 5));
		System.out.println(Math.sqrt(64));
		
	}

}
