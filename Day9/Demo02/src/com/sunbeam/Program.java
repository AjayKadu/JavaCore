package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Program {

	public static void main(String[] args) {

		List<Book> list = new ArrayList<>();

		Collections.addAll(list, 
				new Book(4, "The Alchemist", "Novel", 493.23),
				new Book(1, "The Archer", "Novel", 723.53),
				new Book(5, "The Fountainhead", "Novel", 652.73),
				new Book(2, "Atlas Shrugged", "Novel", 872.94), 
				new Book(6, "Harry Potter", "Novel", 423.68),
				new Book(3, "Lord of Rings", "Novel", 621.53)
		);
		
		
		Book str = list.get(2);
		System.out.println(str.toString());
		
		System.out.println();
		
		 ListIterator<Book> trav = list.listIterator(list.size());
		  while(trav.hasPrevious()) {
		  Book ele = trav.previous();
		  System.out.println(ele);
		}

		  Book b = new Book();
		   b.setId(5);
		  
		  
		int bk = list.indexOf(b);
		
		System.out.println(bk);
		Book bkk = list.get(bk);
		System.out.println(bkk);
		System.err.println();
		
		Collections.sort(list);
		
		for (Book book : list) {
			System.out.println(book);
		}
		
		System.out.println();
		
		class StringComparator implements Comparator<Book>{

			@Override
			public int compare(Book x, Book y) {
				int diff = Double.compare(x.getPrice(),y.getPrice());
				return diff;
			}
		}
		
		Collections.sort(list, new StringComparator());
		
		for (Book book : list) {
			System.out.println(book);
		}
		
		System.out.println();
		
		System.out.println(Collections.max(list, new StringComparator())); 
	}

}
