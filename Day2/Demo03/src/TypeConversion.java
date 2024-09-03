
public class TypeConversion {

	public static void main(String[] args) {
		
		int a = 12;
		Integer b = a;
		
		float f = b.floatValue();
		byte x = b.byteValue();
		long l = b.longValue();
		int i = b.intValue();
		short s = b.shortValue();
		char ch = (char) a;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(f);
		System.out.println(x);
		System.out.println(l);
		System.out.println(i);
		System.out.println(s);
		System.out.println(ch);
		
		
		
       
	}

}
