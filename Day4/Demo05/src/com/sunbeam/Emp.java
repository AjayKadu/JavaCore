package com.sunbeam;

import java.util.Scanner;

public class Emp {
	private int id;
	private String name;
	private double salary;
	private Date joining;

	public Emp() {
		this.id = 0;
		this.name = "";
		this.salary = 0;
		this.joining = new Date();
	}

	public Emp(int id, String name, double salary, Date joining) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.joining = joining;
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Id: ");
		this.id = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the Name: ");
		this.name = sc.nextLine();
		System.out.print("Enter the Salary: ");
		this.salary = sc.nextDouble();
		System.out.print("Enter the joining: ");
		this.joining.accept();
	}

	public void display() {
		System.out.println("Id: " + this.id);
		System.out.println("Name: " + this.name);
		System.out.println("Salary: " + this.salary);
		this.joining.display();
	}

}
