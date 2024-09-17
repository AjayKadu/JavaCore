package tester;

import java.util.Scanner;
import com.app.geometry.Point2D;

public class TestPointArray1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many points do you want to plot?");
		
		Point2D[] points = new Point2D[sc.nextInt()];

		for (int i = 0; i < points.length; i++) {
			
			System.out.println("Enter x and y coordinates for point " + (i + 1) + ":");
			
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			
			points[i] = new Point2D(x, y);
		}

		boolean exit = false;
		
		while (!exit) {
			System.out.println("\nMenu:");
			System.out.println("1. Display details of a specific point");
			System.out.println("2. Display details of all points");
			System.out.println("3. Display distance between two points");
			System.out.println("4. Exit");
			System.out.println("Enter your choice:");

			int choice = sc.nextInt();
			
			switch (choice) {
			
			case 1:

				System.out.println("Enter index of the point (starting from 0): ");
				
				int index = sc.nextInt();
				
				if (index >= 0 && index < points.length) {
					System.out.println("Details: " + points[index].getDetails());
				} 
				else {
					System.out.println("Invalid index, please retry!!!!");
				}
				break;

			case 2:

				System.out.println("Details of all points:");
				
				for (Point2D point : points) {
					System.out.println(point.getDetails());
				}
				break;

			case 3:

				System.out.println("Enter index of start point:");
				
				int start = sc.nextInt();
				
				System.out.println("Enter index of end point:");
				
				int end = sc.nextInt();

				if (start >= 0 && start < points.length && end >= 0 && end < points.length) {
					
					if (!points[start].isEqual(points[end])) {
						
						double distance = points[start].calculateDistance(points[end]);
						
						System.out.println("Distance between point " + start + " and point " + end + " is: " + distance);
					} else 
					{
						System.out.println("Both points are located at the same position.");
					}
				} 
				else {
					System.out.println("Invalid index, please retry!!!!");
				}
				break;

			case 4:

				System.out.println("Exiting...");
				exit = true;
				break;

			default:
				System.out.println("Invalid choice, please try again.");
			}
		}

		sc.close();
	}
}
