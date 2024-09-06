package com.sunbeam;

import java.util.Scanner;

public class Program {
	
	
	
	public static int menuList() {
		Scanner sc = new Scanner(System.in);
		System.out.println("0. Exit");
		System.out.println("1. Circle");
		System.out.println("2. Rectangle");
		System.out.println("Enter choice :: ");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		int n;
		while((n = menuList())!=0) {
			
			Shape shape = null;
			
			switch (n) {
			case 1:
				shape = new Circle();
				break;
			case 2:
				shape = new Rectangle();
				break;

			default:
				break;
			}
			if(shape != null) {
				shape.acceptRecord();
				shape.calArea();
				shape.printArea();
			}
		}
		
	}

}
