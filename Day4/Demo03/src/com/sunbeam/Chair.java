package com.sunbeam;

public class Chair {
   
	private int weight;
	private int height;
	
	static private int price;
	
	static {
	   price = 300;
	}

	public Chair() {
		this.weight = 0;
		this.height = 0;
	}
	
	public Chair(int weight, int height) {
		this.weight = weight;
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public static int getPrice() {
		return price;
	}

	public static void setPrice(int price) {
		Chair.price = price;
	}


	public void display() {
		System.out.printf("Height: %d\nWeight: %d\nprice: %d\n",height,weight,Chair.price);
	}
	
	
	
}
