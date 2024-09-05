package com.sunbeam;

import java.util.Scanner;

public class Student extends Person {
	
    private int roll;
    private String course;
    private int marks;
    
    
	public Student() {
		this.roll = 0;
		this.course = "";
		this.marks = 0;
//		System.out.println("Child Parameterless Constrctor");
	}


	public Student(int roll, String course, int marks) {
		super(22,"Ajay");
		this.roll = roll;
		this.course = course;
		this.marks = marks;
		System.out.println("Child Parameter Constrctor");
	}


	public int getRoll() {
		return roll;
	}


	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		super.accept();
		System.out.print("Enter Roll: ");
		this.roll = sc.nextInt();
		System.out.print("Enter Course:");
		sc.nextLine();
		this.course = sc.nextLine();
		System.out.print("Enter Marks: ");
		this.marks = sc.nextInt();
		System.out.println();
	}
	
	public void display() {
		super.display();
		System.out.println("Roll:"+roll);
		System.out.println("Course:"+course);
		System.out.println("Marks:"+marks);
	}
	
    
    
}
