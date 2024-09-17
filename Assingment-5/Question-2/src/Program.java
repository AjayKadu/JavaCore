import java.util.Scanner;

public class Program {

	public static boolean isPalimdrome(String str) {
		int start = 0;
		int end = str.length() - 1;

		while (start < end) {
			if (str.charAt(start) != str.charAt(end)) {
				return false;
			}

			start++;
			end--;
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String");

		String str = sc.nextLine().trim();

		boolean res = isPalimdrome(str);

		if (res == true)
			System.out.println("String is Palimdrone");
		else {
			System.out.println("String is Not Palimdrone");
		}

	}

}
