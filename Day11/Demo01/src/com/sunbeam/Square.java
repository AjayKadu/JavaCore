package com.sunbeam;

public class Square implements Shape {
      private int side;

	public Square(int side) {
		this.side = side;
	}

	public double calcArea() {
		return this.side * this.side;
	}
      
      
}
