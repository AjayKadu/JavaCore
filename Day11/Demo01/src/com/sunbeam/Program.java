package com.sunbeam;

public class Program {
     
	public static void main(String[] args) {
		
		Shape[] arr = {
		         
				new Circle(7),
				new Rectangle(5,3),
				new Square(10)
		};
		
	     System.out.println(Shape.calcTotalArea(arr)); 
	     
	     Shape sh = new Circle(); 
	     
	    //Cricle ch = 
	     
	     ((Circle)sh).setRadius(10);
	     
	    System.out.println(sh.calPeri()); 
	     
		}
	}
