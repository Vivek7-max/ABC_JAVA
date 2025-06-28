package p6_static;

public class P5 {
	
	static int a ;
	
	public static void main(String[] args) {
		int a = 10;
		System.out.println(a); //10
		System.out.println(P5.a); //0
	}
	
	public static void test() {
		System.out.println(a);
	}
}
