package com.sunbeam;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;

public class Program {

	public static void main1(String[] args) {
		
		//Deque as a Stack;
		
		Deque<Integer> dq = new ArrayDeque<>();
		
		dq.offerFirst(11);
		dq.offerFirst(22);
		dq.offerFirst(33);
		dq.offerFirst(44);
		dq.offerFirst(55);
		dq.offerFirst(66);
		dq.offerFirst(77);
		
		while(!dq.isEmpty()) {
		  int ele = dq.pollFirst();
		  System.out.println(ele);
		}

	}
	
	public static void main(String[] args) {
		
		//Deque as a Queue;
		
		Deque<Integer> dq = new ArrayDeque<>();
		
		Collections.addAll(dq, 11,22,33,44,55,66,77);
		
		while(!dq.isEmpty()) {
			  int ele = dq.pollFirst();
			  System.out.println(ele);
			}
	}

}
