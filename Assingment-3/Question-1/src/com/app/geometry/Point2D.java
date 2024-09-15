package com.app.geometry;

public class Point2D {

	private double x;
	private double y;

	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getDetails() {
		return "Points(x=" + x + ", y=" + y + ")";
	}

	public boolean isEqual(Point2D obj) {
		return this.x == obj.x && this.y == obj.y;
	}
	
	public double calculateDistance(Point2D obj) {
		return Math.sqrt(Math.pow((obj.x - this.x),2) + Math.pow((obj.y - this.y), 2));
	}

}
