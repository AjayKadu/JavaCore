package com.sunbeam;

import java.util.Date;

class Box{
	private Object obj;

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
}



public class Program {

	public static void main(String[] args) {
		
		Box b1 = new Box();
		b1.setObj(new Integer(2));
		Integer r1 = (Integer) b1.getObj();
		System.out.println(r1);
		
		Box b2 = new Box();
		b2.setObj(new Date());
	    Date r2 = (Date) b2.getObj();
	    System.out.println(r2);
	    
//	    Box b3 = new Box();
//	    b3.setObj("123");
//	   Integer r3 = (Integer) b3.getObj();   //ClassCastException on run time
//	   System.out.println(r3);
	}

}
