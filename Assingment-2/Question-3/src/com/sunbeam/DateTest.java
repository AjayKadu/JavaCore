package com.sunbeam;

public class DateTest {

	public static void main(String[] args) {
		
		System.out.println("Initial Date");
		Date dt1 = new Date(10,9,2024);
		dt1.displayDate();

		dt1.setDay(26);
		dt1.setMonth(9);
		dt1.setYear(2025);
		System.out.println("After Update Date");
		dt1.displayDate();

	}

}
