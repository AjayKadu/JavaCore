package com.sunbeam;

public class Human {

	private int age;
	private int weight;
	private int height;
	
	public Human(int age, int weight, int height) {
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	
	public void display() {
		System.out.println("age : " + age + " weight " + weight + " height " + height);
	}
	


}
