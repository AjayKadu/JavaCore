package com.sunbeam;

public class Singleton {
    
	static private Singleton obj;
	
	static {
		obj= new Singleton();
	}
	
	private Singleton() {
		System.out.println("Singleton called");
	}

	public static Singleton getInstance() {
		return obj;
	}

	
	
}
