
public class Employee {
	private String firstName;
	private String lastName;
	private double monthlySalary;

	public Employee(String firstName, String lastName, double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		monthlySalary = salary;

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getmonthlySalary() {
		return monthlySalary;
	}

	public void setmonthlySalary(double salary) {
		this.monthlySalary = salary;
	}

	public double getYearlySalary() {
		return monthlySalary * 12;
	}

	public double giveRaise() {
	   return this.monthlySalary += monthlySalary * 0.10;      

}
}
