package p5_methods;

public class P7 {
	public static void main(String[] args) {
		test();
	}
	
	public static void test() {
		System.out.println("Hi"); //Hi
		test();
		System.out.println("Bye");
	}
}
