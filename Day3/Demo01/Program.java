package sunbeam.geometry;

import sunbeam.geometry.dim3.Box;
import sunbeam.geometry.dim2.Circle;
import sunbeam.geometry.dim3.Cylinder;

public class Program{

   public static void main(String[] args){

     Box b1 = new Box(10,8,15);
	System.out.println("Result "+ b1.calcVolume());

	Circle c1 = new Circle(4.5);
	System.out.println("Result "+ c1.calcArea());

Cylinder cy1 = new Cylinder(3.4, 4.5);
System.out.println("Result "+ cy1.calcVolume());

	}
}
