package com.sunbeam;
import java.util.Scanner;

public class Rectangle extends Shape  {
    private double length;
    private double breadth;
    
    public void acceptRecord() {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter Length:");
    	this.length = sc.nextDouble();
    	System.out.print("Enter breadth:");
    	this.breadth = sc.nextDouble();
    }
    
    public void calArea() {
    	this.area = this.length*this.breadth;
    }
}
