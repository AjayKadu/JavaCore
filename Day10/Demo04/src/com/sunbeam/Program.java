package com.sunbeam;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main1(String[] args) {
		
		Set<Book> set = new HashSet<>();
		
		set.add(new Book(4, "The Alchemist", "Novel", 493.23));
		set.add(new Book(1, "The Archer", "Novel", 723.53));
		set.add(new Book(5, "The Fountainhead", "Novel", 652.73));
		set.add(new Book(2, "Atlas Shrugged", "Novel", 872.94));
		set.add(new Book(6, "Harry Potter", "Novel", 621.53));
		set.add(new Book(1, "The Archer", "Novel", 723.53));
		set.add(new Book(3, "Lord of Rings", "Novel", 621.53));
		System.out.println("Set Size: " + set.size());
		
		for (Book book : set) {
			System.out.println(book);
		}

	}
	
	public static void main(String[] args) {
		
		Set<Book> set = new LinkedHashSet<>();
		
		set.add(new Book(4, "The Alchemist", "Novel", 493.23));
		set.add(new Book(1, "The Archer", "Novel", 723.53));
		set.add(new Book(5, "The Fountainhead", "Novel", 652.73));
		set.add(new Book(2, "Atlas Shrugged", "Novel", 872.94));
		set.add(new Book(6, "Harry Potter", "Novel", 621.53));
		set.add(new Book(1, "The Archer", "Novel", 723.53));
		set.add(new Book(3, "Lord of Rings", "Novel", 621.53));
		System.out.println("Set Size: " + set.size());
		
		for (Book book : set) {
			System.out.println(book);
		}

	}

	
public static void main2(String[] args) {
		
		Set<Book> set = new TreeSet<>();
		
		set.add(new Book(4, "The Alchemist", "Novel", 493.23));
		set.add(new Book(1, "The Archer", "Novel", 723.53));
		set.add(new Book(5, "The Fountainhead", "Novel", 652.73));
		set.add(new Book(2, "Atlas Shrugged", "Novel", 872.94));
		set.add(new Book(6, "Harry Potter", "Novel", 621.53));
		set.add(new Book(1, "The Archer", "Novel", 723.53));
		set.add(new Book(3, "Lord of Rings", "Novel", 621.53));
		System.out.println("Set Size: " + set.size());
		
		for (Book book : set) {
			System.out.println(book);
		}

	}

}
