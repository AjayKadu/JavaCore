package com.sunbeam;

class Employee{
	private int empid;
	private double salary;
	private String name;
	
	
	public Employee(int empid, double salary, String name) {
		this.empid = empid;
		this.salary = salary;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", salary=" + salary + ", name=" + name + "]";
	}
	
	
	
	
}


public class Program {
	
	public static void main2(String[] args) {
		int num1 = 10; 
		int num2 = 10; 
		if(num1 == num2)
			System.out.println("Equal");
		else 
			System.out.println("not Equal");

	}
	
	public static void main(String[] args) {
	     
        Employee emp1 = new Employee(1,100000.00,"Ajay");
        Employee emp2 = new Employee(1,100000.00,"Ajay");
        
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        
        if (emp1 == emp2) {
      	  System.out.println("Same");
        }
        else {
      	  System.out.println("Not Same");
        }
		
		
	}


	public static void main1(String[] args) {
	     
          Employee emp1 = new Employee(1,100000.00,"Ajay");
          Employee emp2 = new Employee(1,100000.00,"Ajay");
          
          if (emp1.equals(emp2)) {
        	  System.out.println("Same");
          }
          else {
        	  System.out.println("Not Same");
          }
		
		
	}

}
