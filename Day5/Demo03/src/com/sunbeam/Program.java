package com.sunbeam;

public class Program {

	public static void main(String[] args) {
		
		A a = new A();
		a.showRecord();
		a.printRecord();
		a.show();
		
		B b = new B();
		b.displayRecord();
		b.printRecord();
		b.show();
		
		A a1 = new B();
		a1.show();
		a1.printRecord();
		a1.showRecord();
		
		B b1 = (B)a1;
		b1.displayRecord();
		b1.printRecord();
		b1.showRecord();
		b1.show();
	}

}
