import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	     
		try {
			System.out.print("Enter the first number: ");
			String input1 = sc.nextLine();
			Double d1 = Double.valueOf(input1);
			
			System.out.print("Enter the Second number: ");
			String input2 = sc.nextLine();
			Double d2 = Double.valueOf(input2);
			
			double Avg = (d1+d2)/2;
			 System.out.println("The Average is: " + Avg);
		}
		catch(NumberFormatException e){
			System.out.println("Error: Inputs are not valid double values.");
		}
	
	}

}
