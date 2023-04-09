package may20;

public class ConstOLMainMeth {
	public static void main(String[] args) {
		
		ConstructorEx c1 = new ConstructorEx();
		c1.displayClock();
		System.out.println("***************");
		
		ConstructorEx c2 = new ConstructorEx(3);
		c2.displayClock();
		System.out.println("***************");
		
		ConstructorEx c3 = new ConstructorEx(3,7);
		c3.displayClock();
		System.out.println("***************");
		
		ConstructorEx c4 = new ConstructorEx(3,8,45);
		c4.displayClock();
	}

}
