package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

public class Program {

	public static void main(String[] args) {

		Employee[] arr = { new Employee(3, "Rohit", 2000.00), new Employee(1, "Sachin", 4766.09),
				new Employee(6, "Chahal", 3700.00), new Employee(8, "Jadeja", 6899.00), };

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		class Example implements Comparator<Employee> {

			@Override
			public int compare(Employee o1, Employee o2) {

				int diff = Integer.compare(o1.getEid(), o2.getEid());
				return diff;
			}

		}

		Arrays.sort(arr, new Example());
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		class Demo implements Comparator<Employee> {

			@Override
			public int compare(Employee o1, Employee o2) {
				int diff = o1.getName().compareTo(o2.getName());
				return diff;
			}

		}
		Arrays.sort(arr, new Demo());

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
