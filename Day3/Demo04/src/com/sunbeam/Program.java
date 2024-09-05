package com.sunbeam;

public class Program {

	
	public static double arraySum(double[] arr) {
		double total =0;
		for(int i=0; i<arr.length; i++) {
			total = total+arr[i];
		}
		return total;
	}
	
	
	
	
	public static void main(String[] args) {
		double[] arr = {1.1, 1.2, 1.3};     // Named array
		double res = arraySum(arr);
		System.out.println("Result "+ res);
		
		res = arraySum(new double[] {1.1,1.2,1.3});
		System.out.println("Result "+ res);  // Anonymous array
		
	}
	
}
