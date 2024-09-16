package com.sunbeam;

 public interface Shape {
	 
	 double PI = 3.14;
     
	 double calcArea();
	 
	 default double calPeri() {
		 return 0.0;
	 }
	
	 public static double calcTotalArea(Shape[] arr) {
		 
		 double totalArea = 0;
		 
		 for (Shape sh : arr) {
			
			 totalArea += sh.calcArea(); 
		}
		 return totalArea;
	 }
}
