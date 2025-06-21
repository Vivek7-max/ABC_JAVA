package p6_static;

public class P9 {
	static int a; //30 //90
	static int b; //40
	public static void main(String[] args) {
		System.out.println("Main Begin");
		System.out.println(a);
		System.out.println(b);
		a=30;
		a=test();
		System.out.println(a);
		System.out.println(b); 
		System.out.println("Main End");
	}

	public static int test() {
		System.out.println("Test Begin");
		int a = 60;
		 b = 40;
		System.out.println(a);
		System.out.println(P9.a);
		System.out.println("Test End");
		return 90;
	}

}