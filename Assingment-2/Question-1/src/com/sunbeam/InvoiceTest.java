package com.sunbeam;

public class InvoiceTest {

	public static void main(String[] args) {
		
		Invoice invoice = new Invoice("1A", "testModel", 1, 20.00);
		System.out.println(invoice.toString());
		System.out.println(invoice.invoicePrint());
		
		Invoice i1 = new Invoice("2A", "secondTest", 5, 90.00);
		System.out.println(i1.toString());
		System.out.println(i1.invoicePrint());
		
		Invoice i2 = new Invoice("2A", "secondTest", -12, -2.00);
		System.out.println(i2.toString());
		System.out.println(i2.invoicePrint());
		
		

	}

}
