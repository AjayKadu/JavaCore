package com.sunbeam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Source path: ");
		String srcPath = sc.nextLine();
		System.out.println("Enter the Destination path");
		String desPath = sc.nextLine();
		int b;
		
		try(FileInputStream fin = new FileInputStream(srcPath)){
			try(FileOutputStream fout = new FileOutputStream(desPath)){
				while((b = fin.read())!= -1) {
					fout.write(b);
				}
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
