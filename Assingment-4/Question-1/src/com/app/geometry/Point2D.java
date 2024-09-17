package com.app.geometry;

public class Point2D {

	private double x;
	private double y;

	public Point2D(double x1, double y1) {
		this.x = x1;
		this.y = y1;
	}

	public Point2D() {

	}

	public String getDetails() {
		return "(x=" + x + "," + "Y=" + y + ")";
	}

	public boolean isEqual(Point2D obj) {

		return this.x == obj.x && this.y == obj.y;

	}

	public double calculateDistance(Point2D obj) {
		return Math.sqrt(Math.pow((obj.x - this.x), 2) + Math.pow((obj.y - this.y), 2));
	}
}
