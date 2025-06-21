package p6_static;

public class P8 {
	static int a; //default value
	public static void main(String[] args) {
		System.out.println("Main Begin");
		System.out.println(a); //0
		test();
		System.out.println("Main End");
	}
	public static void test() {
		System.out.println("Test Begin");
		int a = 20;
		System.out.println(a); //20
		System.out.println(P8.a); //0
		System.out.println("Test End");
		

	}

}