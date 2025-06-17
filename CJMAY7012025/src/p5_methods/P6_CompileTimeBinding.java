package p5_methods;

public class P6_CompileTimeBinding {
	public static void main(String[] args) {
		byte a = 10;
		test(a);
		test("hi");
	}
	
	public static void test(int a) {
		System.out.println("Hi");
	}
	
	public static void test(byte a) {
		System.out.println("Bye");
	}
	
	public static void test(double a) {
		System.out.println("Hello");
	}
	
	public static void test(String a) {
		System.out.println("Hello");
	}
}
// Compile time binding