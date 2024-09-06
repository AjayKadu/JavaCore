package com.sunbeam;

public class Progrsm {

	public static void main(String[] args) {
		
		Person p = new Employee(22,"Ajay",1,28877.0,"IT");
		p.printRecord();
		
		Employee emp = (Employee)p;
		emp.display();
	}

}
