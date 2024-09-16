package com.sunbeam;

public class Rectangle implements Shape {
    
	private int length;
	private int breadth;
	
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcArea() {
		return this.length*this.breadth;
	}
	
	
}
