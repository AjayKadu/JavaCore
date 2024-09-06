package com.sunbeam;
import java.util.Scanner;

public class Circle extends Shape{
	
   private double radius;
   
   public void acceptRecord() {
	   Scanner sc = new Scanner(System.in);
	   this.radius = sc.nextDouble();
   }
   
   public void calArea() {
	   this.area = Math.PI * radius * radius;
   }
}
