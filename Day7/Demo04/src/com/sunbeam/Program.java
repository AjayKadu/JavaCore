package com.sunbeam;

class Box <TYPE> {
	private TYPE obj;

	public TYPE getObj() {
		return obj;
	}

	public void setObj(TYPE obj) {
		this.obj = obj;
	}
	
}

public class Program {

	public static void main(String[] args) {
		
       Box<Integer> b1 = new Box<>();
       b1.setObj(new Integer(2));
       Integer r1 = b1.getObj();
       
      Box<String> b2 = new Box<>();
      b2.setObj("ABC");
      String r2 = b2.getObj();
       
	}

}
