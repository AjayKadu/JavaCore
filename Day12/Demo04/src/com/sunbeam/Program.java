package com.sunbeam;

import java.util.Scanner;

public class Program {

	enum Arithmatic {
		Exit,Addition, Subtraction, Multipication, Division;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the choice");
		
		Arithmatic[] arith = Arithmatic.values();
		for (Arithmatic ar : arith) {
			System.out.println(ar.ordinal() +"."+ ar.name());
		}

		int index = sc.nextInt();
         Arithmatic choice = arith[index];		

		System.out.println("Enter first number");
		int num1 = sc.nextInt();

		System.out.println("Enter Second number");
		int num2 = sc.nextInt();

		switch (choice) {
		case Addition:
			int Addition = num1 + num2;
			System.out.println(Addition);
			break;
		case Subtraction:
			int Substract = num1 - num2;
			System.out.println(Substract);
			break;
		case Multipication:
			int Multipication = num1 * num2;
			System.out.println(Multipication);
			break;
		case Division:
			int Division = num1 / num2;
			System.out.println(Division);
			break;

		case Exit:
			System.exit(0);
			break;
		}

	}

}
