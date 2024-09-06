package com.sunbeam;

public interface Printable {
      int age = 22;
      String name = "Ajay";
      
       void show();
       void print();
}

class Example implements Printable{
	
	public void show() {
		System.out.println("show()");
	}
	
	public void print() {
		System.out.println("print()");
	}
}


