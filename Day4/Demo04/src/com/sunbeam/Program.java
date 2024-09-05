package com.sunbeam;

public class Program {

	public static void main(String[] args) {
		
Singleton c =	Singleton.getInstance();
Singleton c2 = Singleton.getInstance();

if(c==c2) {
	System.out.println("same");
}
else {
	System.out.println("Not Singleton");
}

	}

}
