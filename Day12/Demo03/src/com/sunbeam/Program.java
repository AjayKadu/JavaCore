package com.sunbeam;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main1(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Path");
		String path = sc.nextLine();

		File file = new File(path);
		boolean status = file.mkdir();
		System.out.println(status);

	}
	
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Path");
		String path = sc.nextLine();

		File file = new File(path);
		boolean status = file.createNewFile();
		System.out.println(status);

	}

}
