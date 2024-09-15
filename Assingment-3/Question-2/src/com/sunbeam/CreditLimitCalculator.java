package com.sunbeam;

import java.util.Scanner;

public class CreditLimitCalculator {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of customers: ");
        
        int numberOfCustomers = scanner.nextInt();

        for (int i = 0; i < numberOfCustomers; i++) {
        	
            System.out.println("\nEnter details for customer " + (i + 1) + ":");

          
            System.out.print("Account Number: ");
            int accountNumber = scanner.nextInt();

            System.out.print("Balance at the beginning of the month: ");
            int beginningBalance = scanner.nextInt();

            System.out.print("Total charges this month: ");
            int totalCharges = scanner.nextInt();

            System.out.print("Total credits applied this month: ");
            int totalCredits = scanner.nextInt();

            System.out.print("Allowed credit limit: ");
            int creditLimit = scanner.nextInt();
            
            System.out.println();

           
            Customer customer = new Customer(accountNumber, beginningBalance, totalCharges, totalCredits, creditLimit);

            
            customer.displayCustomerInfo();
        }

   
    }
}
