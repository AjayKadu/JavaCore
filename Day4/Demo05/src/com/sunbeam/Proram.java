package com.sunbeam;

public class Proram {

	public static void main(String[] args) {
		
//		Emp ep = new Emp();
//		ep.display();
		
		Date dt = new Date(1,1,2001);
		System.out.println(dt.toString());
		Emp ep2 = new Emp(1,"Ajay",100000,dt);
		ep2.display();

//		Emp ep3 = new Emp();
//		ep3.accept();
//		ep3.display();
	}


}
