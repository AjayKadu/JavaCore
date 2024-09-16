package com.sunbeam;

public class Circle implements Shape {
    private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double calcArea() {
		return Shape.PI * this.radius* this.radius;
	}
	
	@Override
	public double calPeri() {
		return 2 * Shape.PI * this.radius;
	}
    
    
}
