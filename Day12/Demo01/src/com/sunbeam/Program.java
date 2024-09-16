package com.sunbeam;

import java.io.File;
import java.sql.Date;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Path");
		String path = sc.nextLine();

		File file = new File(path);

		if (!file.exists()) {
			System.out.println("Invalid Path");
		}

		if (file.isDirectory()) {

			String[] list = file.list();
			for (String string : list) {
				System.out.println(string);
			}
		} 
		else if (file.isFile()) {
			
			System.out.println(file.getName());
			System.out.println(file.getParent());

			if (file.canRead()) {
				System.out.println("You can Read");
			}
			if (file.canWrite()) {
				System.out.println("You can Write");
			}
			if (file.canExecute()) {
				System.out.println("You can Execute");
			}
	
		long ms =  file.lastModified();
		System.out.println(new Date(ms)); 
		}
		else
		System.out.println("Something Wrong");

	}

}
