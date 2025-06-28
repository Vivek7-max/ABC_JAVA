package p8_nonStaticMethods;

public class P1 {
	
	public static void main(String[] args) {
		System.out.println("Main Begin");
		P1 obj = new P1();
		obj.test();
		System.out.println("Main End");
	}
	
	public void test() {
		System.out.println("Test Being");
		System.out.println("Test End");
	}
	
}
