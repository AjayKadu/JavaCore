package com.sunbeam;

import java.util.Scanner;

public class Employee extends Person {
	
	private int eid;
	private double salary;
	private String department;
	
  public Employee() {
		
	}
	
	public Employee(int age, String name, int eid, double salary, String department) {
		super(age,name);
		this.eid = eid;
		this.salary = salary;
		this.department = department;
	}
	
//	public void acceptRecord() {
//		super.acceptRecord();
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter Employee id:");
//		this.eid = sc.nextInt();
//		System.out.print("Enter Employee salary:");
//		this.salary = sc.nextDouble();
//		System.out.print("Enter Employee department:");
//		this.department = sc.nextLine();
//	}
	
	public void display() {
		System.out.println("Employee id: "+eid);
		System.out.println("Employee salary"+salary);
		System.out.println("Employee department"+department);
	}
	
	
	
}

