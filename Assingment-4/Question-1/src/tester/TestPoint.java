package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter x coordinate of point 1: ");
		double x1 = sc.nextDouble();
		System.out.print("Enter y coordinate of point 1: ");
		double y1 = sc.nextDouble();

		System.out.print("Enter x coordinate of point 2: ");
		double x2 = sc.nextDouble();
		System.out.print("Enter y coordinate of point 2: ");
		double y2 = sc.nextDouble();

		Point2D p1 = new Point2D(x1, y1);
		Point2D p2 = new Point2D(x2, y2);

		System.out.println();

		System.out.println("Point 1 details: " + p1.getDetails());
		System.out.println("Point 2 details: " + p2.getDetails());

		System.out.println();

		if (p1.isEqual(p2)) {
			System.out.println("Both points are at the same location.");
		} 
		else {
			System.out.println("The points are different.");

			double distance = p1.calculateDistance(p2);

			System.out.println("Distance between Point 1 and Point 2: " + distance);
		}

	}

}
