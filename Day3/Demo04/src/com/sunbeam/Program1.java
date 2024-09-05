package com.sunbeam;

public class Program1 {
	
	public static double arraySum(double... arr) {
		
		double total = 0;
		for (int i = 0; i < arr.length; i++) {
			total = total+arr[i];
		}
		
		return total;
	}
	
	private static void objectClass(Object... arr) {
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
	
		
	}

	public static void main(String[] args) {
		
		double res = arraySum(1.1,1.2,1.3);
		System.out.println("Result"+ res);
		
		objectClass(10,1.1f,12.3,"Ajay");
	}
}
