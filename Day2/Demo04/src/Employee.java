import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {

		Program p = new Program();
		p.acceptRecord();
		p.printRecord();

	}

}

class Program {

	private String name;
	private int age;
	private int salary;
	
	Scanner sc = new Scanner(System.in);

	public void acceptRecord() {
		
		System.out.print("Name");
		 this.name = sc.nextLine();
		System.out.print("Age");
		 this.age = sc.nextInt();
		System.out.print("Salary");
		salary = sc.nextInt();
	}
	
	public void printRecord() {
		System.out.println("Name"+name);
		System.out.println("Age"+age);
		System.out.println("Salary"+salary);
	}

}
