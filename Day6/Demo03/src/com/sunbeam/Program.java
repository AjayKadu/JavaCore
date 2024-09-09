package com.sunbeam;

import java.time.LocalDate;

class Date {

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
	
}

public class Program {

	public static void main(String[] args) {
       
		Date dt1 = new Date(1,1,2001,null);
		Date dt2 = dt1;                          //Shallow copy of references
		
	
		System.out.println(dt1.toString());
		System.out.println(dt2.toString());
		
		dt1.setDay(26);
		dt1.setMonth(9);
		dt1.setYear(2024);
		
		System.out.println(dt1.toString());
		System.out.println(dt2.toString());
		
		dt2.setDay(20);
		System.out.println(dt1.toString());
		System.out.println(dt2.toString());
	}

}
