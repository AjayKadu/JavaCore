package com.sunbeam;

import java.util.Arrays;

public class Program {
        

	
	public static void main(String[] args) {
		
		 Employee[] arr = {
			new Employee(3,"Rohit", 2000.00),
			new Employee(1,"Sachin", 4766.09),
			new Employee(6,"Chahal", 3700.00),
			new Employee(8,"Jadeja", 6899.00),
		 };
		 
		 for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		 
		 Arrays.sort(arr);
	}

}
