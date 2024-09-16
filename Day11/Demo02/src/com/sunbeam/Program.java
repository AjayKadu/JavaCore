package com.sunbeam;

//multiple interface inheritance will not lead to any ambiguity error
//because interfaces doesn't contain any definitions


/*
 interface Printable{
	void show();
}

interface Displayable{
	void show();
}

    class MyClass implements Printable,Displayable{

	@Override
	public void show() {
		System.out.println("MyClass show()");
	
	}
}

public class Program {

	public static void main(String[] args) {
	  		
		MyClass obj1 = new MyClass();
		obj1.show();
		Printable obj2 = new MyClass();
		obj2.show();
		Displayable obj3 = new MyClass();
		obj3.show();
	}

}
*/


//compiler error: duplicate show() method in FirstClass.
//if two interfaces have default method with same signature and a class is inherited from that interface,
//	then it will lead to ambiguity.


/*
interface Printable{
	
	default void show() {
		System.out.println("Printable.show() called.");
	}
}

interface Displayable{
	
	default void show() {
		System.out.println("Displayable.show() called.");
	}
}

//if two interfaces have default method with same signature and a class is inherited from that interface,
//	then it will lead to ambiguity.
//this problem can be resolved by overriding method in sub-class.

    class MyClass implements Printable,Displayable{

	@Override
	public void show() {
		System.out.println("MyClass show()");
	
	}
	
}

public class Program {

	public static void main(String[] args) {
		
         		
		MyClass obj1 = new MyClass();
		obj1.show();
		Printable obj2 = new MyClass();
		obj2.show();
		Displayable obj3 = new MyClass();
		obj3.show();
	}
}
*/


class SecodClass {
	      
	void show(){
		System.out.println("Class show()");
	}
}
