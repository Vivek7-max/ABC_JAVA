package p6_static;

public class P11 {
	static int a=test();
	public static int test() {
		System.out.println("Test Begin");
		System.out.println(a);
		System.out.println("Test End");
		return 30;
	}

	public static void main(String[] args) {
		System.out.println("Main Begin");
		System.out.println(a);
		System.out.println("Main End");

	}

}