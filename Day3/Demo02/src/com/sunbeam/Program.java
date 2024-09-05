package com.sunbeam;

public class Program {

	public static void main(String[] args) {
	
		Human[] arr = new Human[4];
		
		arr[0] = new Human(22,50,165);
		arr[1] = new Human(23,52,167);
		arr[2] = new Human(24,54,171);
		arr[3] = new Human(22,45,157);
		
		for(int i=0; i<arr.length; i++) {
			arr[i].display();
		}
		

	}

}
