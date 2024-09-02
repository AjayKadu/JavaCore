
public class Program {

	public static void main(String[] args) {
		
		int a = 10;
		float b =  20.8f;
		long l = 2678933;
		double d = 789.78643;
		
		a = (int)b;
		System.out.println(a);
		
		b = a;
		System.out.println(b);
		
		b = l;
		System.out.println(b);
		
		l = (long)b;
		System.out.println(l);
	}

}
