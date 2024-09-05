package com.sunbeam;

class Circle{
	
	final private int r = 3;
	final private double PI;
	
	public Circle() {
		
		PI = 3.14;
	}
	
//	double mul = PI*r;
	
	public double areaCircle(int r){
	  double area = PI * r * r;
	  return area;
	}
	
	
}


public class Program {
	
	public static void main(String[] args) {
     
		Circle c1 = new Circle();
		double Result = c1.areaCircle(4);
		System.out.println(Result);
		

	}

}
