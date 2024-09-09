package com.sunbeam;

import java.time.LocalDate;

class Date implements Cloneable { // It because to tell the jvm to clone the instance

	private int day;
	private int month;
	private int year;

	LocalDate ld = LocalDate.now();

	public Date() {
		this.day = ld.getDayOfMonth();
		this.month = ld.getMonthValue();
		this.year = ld.getYear();
	}

	public Date(int day, int month, int year, LocalDate ld) {
		this.day = day;
		this.month = month;
		this.year = year;
		this.ld = LocalDate.now();
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public LocalDate getLd() {
		return ld;
	}

	public void setLd(LocalDate ld) {
		this.ld = ld;
	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + ", ld=" + ld + "]";
	}

	@Override
	protected Date clone() throws CloneNotSupportedException {

		Date other = (Date) super.clone(); // because to copy the parent instance into child
		return other; // clone is object class method which is in cloneable interface
	}

}

public class Program {

	public static void main(String[] args) throws CloneNotSupportedException {

		Employee emp1 = new Employee(1, 10000.00, "Ajay", 30, 9, 2024);
		Employee emp2 = emp1.clone();
		
		
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
		
		emp2.setName("Vijay");
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
		
		Date date = emp2.getJoiningDate();
		date.setDay(2);
		date.setMonth(4);
		date.setYear(2010);
		
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
	}

	
	
	public static void main1(String[] args) throws CloneNotSupportedException {

		Date dt1 = new Date(1, 2, 2020, null);
		Date dt2 = dt1.clone(); // Shallow copy of instances

		System.out.println(dt1.toString());
		System.out.println(dt2.toString());

		dt1.setDay(5);
		System.out.println(dt1.toString());
		System.out.println(dt2.toString());

		dt2.setMonth(4);
		System.out.println(dt1.toString());
		System.out.println(dt2.toString());
	}

}
