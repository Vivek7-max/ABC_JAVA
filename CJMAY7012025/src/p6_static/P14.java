package p6_static;

public class P14 {
	static int a ;
	
	public static void main(String[] args) {
		System.out.println(a); //0
		a = 60;
		test();
		
		System.out.println(P14.a);
	}
	
	public static void test() {
		System.out.println(a); //60
		System.out.println(a);
	}

}
