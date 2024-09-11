package com.sunbeam;

public class Employee implements Comparable<Employee>{
     
	private int eid;
	private String name;
	private double salary;
	
	
	public Employee(int eid, String name, double salary) {
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}


	@Override
	public int compareTo(Employee obj) {
		
		int diff = this.eid - obj.eid;
		return diff;
		
	}


	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	
}
