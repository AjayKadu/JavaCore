package com.app.fruits;

public class Mango extends Fruit {
     
	private String color;
	private double weight;
	private String name;
	private boolean isFresh;
	
	
	public Mango(String color, double weight, String name, boolean isFresh) {
		super(color,weight,name,true);
	
	}


	@Override
	public String taste() {
		return "sweet";
	}
}
