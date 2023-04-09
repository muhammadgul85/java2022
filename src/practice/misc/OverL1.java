package practice.misc;

public class OverL1 {
	public static void main(String[] args) {
		
		
		PolyMorphismOverL pl = new PolyMorphismOverL();
		pl.setClock(8);
		pl.getClock();
		System.out.println("**********************");
		
		pl.setClock(4, 54);
		pl.getClock();
		System.out.println("**********************");
		
		pl.setClock(5, 40, 10);
		pl.getClock();
	}

}
