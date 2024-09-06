package com.sunbeam;

import java.util.Scanner;

public class Person{
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
		System.out.println("Age");
		this.age = sc.nextInt();
		System.out.println("Name");
		this.name = sc.nextLine();
	}
	
}

