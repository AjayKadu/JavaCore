package com.sunbeam;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Program {

	public static void main(String[] args) {

		Queue<String> pq = new PriorityQueue<>();

		pq.add("String");
		pq.add("Integer");
		pq.add("Double");
		pq.add("Enum");
		pq.add("Interface");
		pq.add("Array");

		while (!pq.isEmpty()) {
			String str = pq.remove();
			System.out.println(str);
		}
		
		System.out.println();

		class PriorityComparator implements Comparator<String> {

			@Override
			public int compare(String x, String y) {
				int len = x.length() - y.length();
				return len;
			}

		}

		Queue<String> p = new PriorityQueue<>(new PriorityComparator());

		p.add("String");
		p.add("Integer");
		p.add("Double");
		p.add("Enum");
		p.add("Interface");
		p.add("Array");

		while (!p.isEmpty()) {
			String str = p.remove();
			System.out.println(str);
		}

	}

}
