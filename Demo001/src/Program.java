import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Roll No.");
		int a = sc.nextInt();
		System.out.println("Enter your name");
		sc.next();
		String Name = sc.nextLine();
		System.out.println("Enter your Marks");
		double Marks = sc.nextDouble();
		
		System.out.println("Roll No "+ a);
		System.out.println("Name "+Name);
		System.out.println("Marks"+Marks);
		

	}

}
