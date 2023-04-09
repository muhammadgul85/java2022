package practice.misc;

public class PersonDemo {
	
	public static void main(String[] args) {
		
		
		ObjectCreation oc = new ObjectCreation();
		System.out.println(oc.name);//default null for string
		System.out.println(oc.age);//default 0 for integer
		System.out.println(oc.phone);
		oc.greet();
		
		System.out.println("*****************************");
		oc.name = "Usman Buzdaar";
		oc.age = 1;
		oc.phone = 444444l;
		System.out.println(oc.name);
		System.out.println(oc.age);
		System.out.println(oc.phone);
		oc.greet();
		
	}

}
