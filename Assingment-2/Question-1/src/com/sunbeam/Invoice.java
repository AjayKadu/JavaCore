package com.sunbeam;

public class Invoice {

	private String partNumber;
	private String itemDescription;
	private int quantity;
	private double price;

	public Invoice(String partNumber, String itemDescription, int quantity, double price) {
		this.partNumber = partNumber;
		this.itemDescription = itemDescription;
		setQuantity(quantity);
		setPrice(price);
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if (quantity > 0) {
			this.quantity = quantity;
		} else {
			this.quantity = 0;
		}

	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price > 0) {
			this.price = price;
		}
		else {
			this.price = 0.0;
		}
		
	}

	public double invoicePrint() {
		return quantity * price;
	}

	@Override
	public String toString() {
		return "Invoice partNumber = " + partNumber + ", itemDescription = " + itemDescription + ", quantity = " + quantity
				+ ", price = " + price;
	}
	
	

}
