
public class EmployeeTest {

	public static void main(String[] args) {

		System.out.println("Annual Salary:");
		Employee emp1 = new Employee("Rohit", "Sharma", 6000.00);
		Employee emp2 = new Employee("Rishabh", "Pant", 5500.00);
//		Employee emp3 = new Employee("Yuvi", "Kumar", 000000.00);
		
		System.out.println(emp1.getYearlySalary());
		System.out.println(emp2.getYearlySalary());
		
		 System.out.println("\nAfter 10% Raise Annual Salary:");
		 System.out.println(emp1.giveRaise()+emp1.getYearlySalary());
		 System.out.println(emp2.giveRaise()+emp2.getYearlySalary());


	}

}

