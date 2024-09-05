package com.sunbeam;

 class MyClass{
	 
	 private int age = 22;
	 private String name;
	 private int height;
	 private int weight;
	 
	 {
		 this.age = 23;
		 this.name ="Ajay";
		 System.out.println("Age: "+age);
		 System.out.println("Name: "+name);
	 }
	 
	 {
		 this.height = 165;
		 System.out.println("Height: "+height);
	 }
	 
	 
	public MyClass(int age, int weight) {
		this.age = age;
		this.weight = weight;
		System.out.println("Age: "+age);
		System.out.println("Weight: "+weight);
	}
	 
	 
 }


public class Program {

	public static void main(String[] args) {
		
		MyClass m1 = new MyClass(24,55);
	}

}
