package com.sunbeam;

class Box<T> {
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
}

public class Program {

	public static void main(String[] args) {
		
		Box<?> b1;                 //Any type allow
		b1 = new Box<Integer>();
		//b1.setObj(10);
		Object r1 = b1.getObj();
		b1 = new Box<String>();
		System.out.println(b1.getObj());
		
		Box<? extends Number> b2; //Number and it's Sub type Allow
		b2 = new Box<Integer>();
		//b2 = new Box<Object>(); //super class //Not Ok
		b2 = new Box<Number>();
		
		Box<? super Number> b3;     //Number and Super class Allow
		b3 = new Box<Number>();
		//b3 = new Box<Integer>(); //sub class //Not Ok
		b3 = new Box<Object>();
		
	}

}
