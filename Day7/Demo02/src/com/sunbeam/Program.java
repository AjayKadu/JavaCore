package com.sunbeam;

public class Program {

	public static void main(String[] args) {
		
		try {
			Time t1 = new Time();
			t1.setHrs(70);
			t1.setMin(1);
			t1.setSec(1);
			System.out.println(t1.toString());
		}
		catch(InvalidTimeException e) {
			System.out.println("Exception Message: "+ e.getMessage());
			System.out.println("Invalid Time Field: "+ e.getInvalidString());
			System.out.println("Invalid Time Value: "+ e.getInvalidValue());
		}
		
	}

}
