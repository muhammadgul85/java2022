package may20;
//Corresponding method is mapped to
public class OverLoading1 {
	public static void main(String[] args) {
		
		PolyMorphimOverLoading c1 = new PolyMorphimOverLoading();
		c1.setClock(5);
		c1.getClock();
		System.out.println("*******");
		c1.setClock(4);
		c1.getClock();
		System.out.println("*******");
		c1.setClock(3, 23);
		c1.getClock();
		
		c1.setClock(2, 32, 44);
		c1.getClock();
		
		
		
	}
}
