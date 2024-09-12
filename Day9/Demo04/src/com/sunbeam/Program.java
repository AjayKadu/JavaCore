package com.sunbeam;

import java.util.Stack;

public class Program {

	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<>();
		
		st.push(11);
		st.push(22);
		st.push(33);
		st.push(44);
		st.push(55);
		
		for (Integer integer : st) {
			System.out.println(integer);
		}
		
		System.out.println();
		
		System.out.println(st.peek()); 
		
	    System.out.println(st.search(33));	
	    
	    System.out.println();
	    
	    while(!st.isEmpty()) {
	    	st.pop();
	    }
	    
	   System.out.println(st.isEmpty());
		
	}

}
