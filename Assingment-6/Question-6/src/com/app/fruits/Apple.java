package com.app.fruits;

public class Apple extends Fruit {

	private String color;
	private double weight;
	private String name;
	private boolean isFresh;
	
	
	public Apple(String color, double weight, String name, boolean isFresh) {
		super(color,weight,name,true);
	
	}


	@Override
	public String taste() {
		return "sweet n sour";
	}
	
	
	
	
}
