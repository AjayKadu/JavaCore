package com.sunbeam;

import java.util.Scanner;

public class Person {
	private int age;
	private String name;

	public Person() {
		this.age = 0;
		this.name = "";
//System.out.println("Parent Parameterless Constrctor");
	}

	public Person(int age, String name) {
		this.age = age;
		this.name = name;
		System.out.println("Parent Parameter Constrctor");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Name: ");
		this.name = sc.nextLine();
		System.out.print("Enter the Age: ");
		this.age = sc.nextInt();
	}

	public void display() {
		System.out.println("Age:" + age);
		System.out.println("Name:" + name);
	}

}
