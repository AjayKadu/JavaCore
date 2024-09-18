package com.sunbeam;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the path");
		String path = sc.nextLine();

		File f = new File(path);
		
		if(f.isDirectory()) {
			System.out.println("It is Directory");
		}
		else if(f.isFile()) {
			System.out.println("It is File");
		}
		else {
			System.out.println("It's Not Directory or nor File");
		}
	}

}
