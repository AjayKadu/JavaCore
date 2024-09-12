package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Rohit");
		list.add(null);
		list.add("Gill");
		list.add("Virat");
		list.add("shreyash");
		list.add("");
		list.add("Rishabh");
		list.add("Bhuvi");
		list.add(null);

		System.out.println(list.toString());
		String e = list.get(2);
		System.out.println(e);

		list.remove(e);
		System.out.println(list.toString());

		list.set(4, "Surya");
		System.out.println(list.toString());

		list.add(5, "KlRahul");
		System.out.println(list.toString());

		System.out.println(e.toUpperCase());

		List<String> list2 = new LinkedList<>();
		ArrayList<String> list3 = new ArrayList<>();

		Collections.addAll(list2, "India", "Austrlia", "England", "South Africa", "Ierland");
		Collections.addAll(list3, "India", "Austrlia", "England", "South Africa","Austrlia", "Ierland");
		
		System.out.println();
		System.out.println(list2.toString());

		System.err.println(list3.equals(list2));
		
		System.out.println(list2.contains("England")); 
		
		System.out.println(list3.indexOf("Ierland"));
		
		System.out.println(list3.lastIndexOf("Austrlia"));
		
		System.out.println(list);
		System.out.println(list2);
		System.out.println(list3);
		
		System.out.println();
		
		list3.clear();
		System.out.println(list);
		System.out.println(list2);
	
		
		System.out.println(list.isEmpty()); 
		
		
		Collections.sort(list);
		System.out.println(list);
	}

}
