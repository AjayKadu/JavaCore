import java.util.Scanner;

public class Program {
	
	public static int countWords(String str) {
		 
		String[] ch = str.trim().split(" ");
	     return ch.length;
	}

	public static void main(String[] args) {
         
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the String: ");
		
		String str = sc.nextLine().trim();
		
		int res = countWords(str);
		
		System.out.println("Count of Words in given String is: "+res);

	}

}
