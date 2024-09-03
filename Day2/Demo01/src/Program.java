
public class Program {

	public static void main(String[] args) {
		
		int a = 20;
		
		//Boxing
		
		Integer b = new Integer(a);
		
		//Auto-Boxing
		
		Integer c=a;
		
		//Unboxing
		
		int x = c.intValue();
		
		//Auto-Unboxing
		
		int y = c;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(x);
		System.out.println(y);
	}

}
