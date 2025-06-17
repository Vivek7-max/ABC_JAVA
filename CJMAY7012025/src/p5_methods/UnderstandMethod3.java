package p5_methods;

public class UnderstandMethod3 {
	
	public static void main(String[] args) {
		System.out.println("Main Begin");
		print();
		System.out.println("Main End");
	}	
	
	public static void test() {
		System.out.println("Test Begin");
		System.out.println("Test End");
	}
	
	public static void print() {
		System.out.println("Print Begin");
		test();
		System.out.println("Print End");
	}
	
}
