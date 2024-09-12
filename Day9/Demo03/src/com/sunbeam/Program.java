package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Program {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		Collections.addAll(list, 11, 22, 33, 44, 55);

		Iterator<Integer> trav = list.iterator();

		// fail-fast iterator

		while (trav.hasNext()) {
			Integer ele = trav.next();
			System.out.println(ele);
			// if (ele == 44)
			// list.add(4, 55); // ConcurrentModificationException

			System.out.println();
		}

		
		//fail-safe iterator
		
		
		List<Integer> list2 = new CopyOnWriteArrayList<>();

		Collections.addAll(list2, 99, 77, 55, 33, 11);

		Iterator<Integer> trav1 = list2.iterator();

		while (trav1.hasNext()) {
			int ele2 = trav1.next();
			System.out.println(ele2);
			if (ele2 == 55)
				list2.add(3, 44);
		}

		trav1 = list2.iterator();

		while (trav1.hasNext()) {
			Integer ele = trav1.next();
			System.out.println(ele);
		}

	}

}
