package p9_nonStaticInitializers;

public class P3 {
	int a = test();
	
	public static void main(String[] args) {
		P3 obj = new P3();
		P3 obj1 = new P3();
	}
	
	public int test() {
		System.out.println("Hi");
		return 90;
	}
}
