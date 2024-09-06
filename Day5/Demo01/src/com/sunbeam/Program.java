package com.sunbeam;

import java.util.Scanner;

class Person{
	private int age;
	private String name;
	
	public Person() {
		this.age =0;
		this.name ="";
	}
	
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public void printRecord(){
		System.out.println("Age: "+age);
		System.out.println("Name: "+name);
	}
	
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		this.age = sc.nextInt();
		this.name = sc.nextLine();
	}
	
}

class Employee extends Person{

	private int eid;
	private double salary;
	private String department;
	
	public Employee() {
		
	}
	
	public Employee(int age, String name, int eid, double salary, String department) {
		super(age, name);
		this.eid = eid;
		this.salary = salary;
		this.department = department;
	}
	
	public void acceptRecord() {
		super.acceptRecord();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee id:");
		this.eid = sc.nextInt();
		System.out.print("Enter Employee salary:");
		this.salary = sc.nextDouble();
		System.out.print("Enter Employee department:");
		this.department = sc.nextLine();
	}
	
	public void display() {
		super.printRecord();
		System.out.println("Employee id: "+eid);
		System.out.println("Employee salary"+salary);
		System.out.println("Employee department"+department);
	}
	
	
	
}


public class Program {

	public static void main(String[] args) {
		
		Employee emp = new Employee(22,"Ajay",1,2000.6,"IT");
		emp.display();
		
	}

}
