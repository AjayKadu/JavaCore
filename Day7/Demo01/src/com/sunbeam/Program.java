package com.sunbeam;

import java.util.Scanner;

public class Program {

	/*
	 * public static void main1(String[] args) {
	 * 
	 * int num; int den;
	 * 
	 * Scanner sc = new Scanner(System.in); System.out.print("Enter Numerator: ");
	 * num = sc.nextInt(); System.err.print("Enter Denominator: "); den =
	 * sc.nextInt();
	 * 
	 * try { double res = num/den; System.out.println("Result "+res); }
	 * catch(Exception e) { e.printStackTrace(); System.out.println(e.getMessage());
	 * sc.close(); System.out.println("Complete"); }
	 * 
	 * }
	 */

	/*
	 * private static int divide(int num, int den)throws Exception {
	 * 
	 * return num/den;
	 * 
	 * }
	 * 
	 * public static void main2(String[] args) { try { Scanner sc = new
	 * Scanner(System.in); System.out.print("Enter Numerator: "); int num =
	 * sc.nextInt(); System.err.print("Enter Denominator: "); int den =
	 * sc.nextInt();
	 * 
	 * 
	 * int res = divide(num,den); System.out.println("Result "+res ); }
	 * catch(Exception e){ System.out.println("Divide by 0"); }
	 * 
	 * }
	 * 
	 */

	/*
	 * private static int divide(int num, int den) throws Exception {
	 * 
	 * return num / den; // telling this method can throw Exception
	 * 
	 * }
	 * 
	 * public static void main(String[] args) {
	 * 
	 * try { Scanner sc = new Scanner(System.in);
	 * System.out.print("Enter Numerator: "); int num = sc.nextInt();
	 * System.out.print("Enter Denominator: "); int den = sc.nextInt();
	 * 
	 * int res = divide(num, den); // Using try-catch we handle the Exception
	 * System.out.println("Result " + res); }
	 * 
	 * catch (Exception e) { System.out.println("Divide by 0"); }
	 * 
	 * }
	 */

	private static int divide(int num, int den) throws Exception {
       
		
			if(den == 0) {
			throw new Exception("Can't Divide by Zero");
			}
		return num / den; 
		
		
	}

	public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Numerator: ");
			int num = sc.nextInt();
			System.out.print("Enter Denominator: ");
			int den = sc.nextInt();

			int res = divide(num, den); 
			System.out.println("Result " + res);
	}
	
		
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
