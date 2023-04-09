package com.may24;

public class ClassA {
	public static void main(String[] args) {
		
		
		Sum a = new Sum();
		Diff b = new Diff();
		Mult c = new Mult();
		Div d = new Div ();
		a.setX(20);
		a.setY(10);
		a.add();
		
		b.setX(14);
		b.setY(2);
		b.diff();
	}

}
