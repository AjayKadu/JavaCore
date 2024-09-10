import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		System.out.print("Enter Number :");
		Scanner sc = new Scanner(System.in);
        
		Integer n = sc.nextInt();
		System.out.println("Given Number :"+ n);
		
		String Binary = Integer.toBinaryString(n);
		System.out.println("Binary equivalent :"+ Binary);
		
		String octal = Integer.toOctalString(n);
		System.out.println("Octal equivalent :"+octal);
		
		String hex = Integer.toHexString(n);
		System.out.println("Hexadecimal equivalent :"+hex);
	}

}
