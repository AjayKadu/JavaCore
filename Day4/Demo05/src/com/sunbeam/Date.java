package com.sunbeam;
import java.util.Scanner;

public class Date {
   
	private int day;
	private int month;
	private int year;
	
	public Date() {
	   this.day = 0;
	   this.month = 0;
	   this.year = 0;
	}

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	
	
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Day");
		this.day = sc.nextInt();
		System.out.print("Enter the Month");
		this.month = sc.nextInt();
		System.out.print("Enter the Year");
		this.year = sc.nextInt();
		
	}
	

	public void display() {
		System.out.printf("Joining Date: %d/%d/%d", day,month,year);
	}
	
}
