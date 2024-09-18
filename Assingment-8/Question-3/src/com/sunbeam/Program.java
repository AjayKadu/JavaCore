package com.sunbeam;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		ArrayList<String> sports = new ArrayList<>();

		sports.add("Soccer");
		sports.add("Basketball");
		sports.add("Tennis");
		sports.add("Cricket");
		sports.add("Javelin");
		sports.add("Football");

		System.out.println("Original Sports List: " + sports);

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the New Sport to change: ");

		String newSport = sc.nextLine();

		if (sports.size() > 1) {
			sports.set(1, newSport);
		} else {
			System.out.println("Sports list doesn't have a second sport to replace.");
		}

		System.out.println("Modified Sports List: " + sports);

	}

}
