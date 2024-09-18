package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Blue");
		list.add("Pink");
		list.add("Red");
		list.add("Black");
		list.add("Yellow");
		list.add("Green");
		list.add("Orange");
		list.add("White");
		list.add("Marron");
		list.add("Violet");

		System.out.println("Before Sorting: ");
		System.out.println(list);
		System.out.println();

		Collections.sort(list);

		System.out.println("After Sorting: ");
		System.out.println(list);

	}

}
