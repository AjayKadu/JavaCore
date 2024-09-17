package com.sunbeam;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Enter the size of the first array:");
		
		String[] array1 = new String[sc.nextInt()];
		sc.nextLine(); 

		System.out.println("Enter elements for the first array:");
		
		for (int i = 0; i < array1.length; i++) {
			array1[i] = sc.nextLine();
		}

		System.out.println("Enter the size of the second array:");
		
		String[] array2 = new String[sc.nextInt()];
		sc.nextLine();

		System.out.println("Enter elements for the second array:");
		
		for (int i = 0; i < array2.length; i++) {
			array2[i] = sc.nextLine();
		}

		
		System.out.println("Duplicate values in the array:");
		
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				
				if (array1[i].equals(array2[j])) {
					
					System.out.println("Duplicate found: " + array1[i]);
					break;
				}
			}
		}
	}
}
