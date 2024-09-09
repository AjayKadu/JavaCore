package com.sunbeam;

public class Employee implements Cloneable {
       
	private int eid;
	private double salary;
	private String name;
	private Date joiningDate;
	
	public Employee(int eid, double salary, String name, int day, int month, int year) {
	
		this.eid = eid;
		this.salary = salary;
		this.name = name;
		this.joiningDate = new Date(day, month, year, null);
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", salary=" + salary + ", name=" + name + ", joiningDate=" + joiningDate + "]";
	}

	@Override
	protected Employee clone() throws CloneNotSupportedException {
		
		Employee other = (Employee) super.clone();
		other.joiningDate = this.joiningDate.clone();   //Deep Copy of Instances
		
		return other;
		
	}
	
	
	
	
	
}
