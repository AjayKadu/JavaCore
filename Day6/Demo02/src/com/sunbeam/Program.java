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


	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(this == obj)
			return true;
		if(!(obj instanceof Employee))
			return false;
		Employee ep = (Employee) obj;
		if(this.empid == ep.empid) {
			return true;
		}
		return false;
		
	}
	
	
	
	
}


public class Program {

	public static void main(String[] args) {
        
		Employee emp1 = new Employee(1,10000.00,"Ajay");
		Employee emp2 = new Employee(1,10000.00,"Ajay");
		
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
		
		if(emp1.equals(emp2)) {
			System.out.println("Same");
		}
		else {
			System.out.println("Not same");
		}
		
		if(emp1 == emp2) {
			System.out.println("Same");
		}
		else {
			System.out.println("Not same");
		}

	}

}
