
public class StringWrapper {

	public static void main(String[] args) {
		
		//Boxing; 
		
		int a =123;
		System.out.println(a);
		
		String str = String.valueOf(a);
	
		System.out.println(str.charAt(1));
		System.out.println(str);
		
		//Unboxing;
		
		int b = Integer.parseInt(str);
		System.out.println(b);

	}

}
