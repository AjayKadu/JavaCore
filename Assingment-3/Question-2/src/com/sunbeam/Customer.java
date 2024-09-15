package com.sunbeam;

public class Customer {

	private int accountNumber;
	private int beginningBalance;
	private int totalCharges;
	private int totalCredits;
	private int creditLimit;

	public Customer(int accountNumber, int beginningBalance, int totalCharges, int totalCredits, int creditLimit) {
		this.accountNumber = accountNumber;
		this.beginningBalance = beginningBalance;
		this.totalCharges = totalCharges;
		this.totalCredits = totalCredits;
		this.creditLimit = creditLimit;
	}

	public int calcNewBalance() {

		return beginningBalance + totalCharges - totalCredits;
	}

	public boolean isCreditLimitExceeded() {
		return calcNewBalance() > creditLimit;
	}

	public void displayCustomerInfo() {
		
		int newBalance = calcNewBalance();

		System.out.println("Account Number: " + accountNumber);
		System.out.println("New Balance: " + newBalance);

		if (isCreditLimitExceeded()) {
			System.out.println("Credit limit exceeded.");
		} 
		else {
			System.out.println("Credit limit is not exceeded.");
		}
	}

}
