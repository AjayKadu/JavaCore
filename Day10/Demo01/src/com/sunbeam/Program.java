package com.sunbeam;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Program {

	/* 
	  public static void main(String[] args) {

         Queue<String> q = new ArrayDeque<>();
         Queue<String> q = new LinkedList<>();
         
         q.offer("One");
       //q.offer(null);           //Null are not allowed;
       //q.offer(null);
         q.offer("Two");
         q.offer("Three");
         q.offer("Four");
         q.offer("Five");
         
         while(!q.isEmpty()) {
        	 String str = q.poll();
        	 System.out.println(str);
         }
         
         System.out.println(q.peek());   //peek() gives the null value;
	}
	*/
	
	public static void main(String[] args) {

        Queue<String> q = new LinkedList<>();
        
        q.add("One");
        q.add("Two");
        Collections.addAll(q,"Three","Four","Five");
        
        while(!q.isEmpty()) {
        	String ele = q.remove();
        	System.out.println(ele);
        }
        
        System.out.println(q.element());  //Elements give the NOSuchElementException;
	}

}
