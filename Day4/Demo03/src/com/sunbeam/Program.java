package com.sunbeam;

import static com.sunbeam.Chair.*;

public class Program {

	public static void main(String[] args) {
		Chair c1 = new Chair(55,155);
		c1.display();
		setPrice(400);
		System.out.println("Chair New Price: "+getPrice());
		
	}

}
