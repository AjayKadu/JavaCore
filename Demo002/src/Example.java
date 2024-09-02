
public class Example {

	public static void main(String[] args) {
		System.out.println("Public class");
		Example.main(45);
		Example.main(10,20);
		Example.main(); 
	}
	
	public static void main(int a, int b) {
		System.out.println("Second class");
        
	}
	public static void main(int b) {
		System.out.println("Third class");
        
	}
	public static void main() {
		System.out.println("Fourth class");
        
	}

}



