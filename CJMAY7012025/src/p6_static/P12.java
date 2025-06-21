package p6_static;
public class P12 {
	static int a = test(); //30
	static int b = 30+print(); //30+60 // 90
	public static int test() {
		System.out.println("Test Begin");             
		System.out.println("a="+a);
		print(); //60 //60
		System.out.println("b="+b);
		System.out.println("Test End");
		return 30;
	}
	public static void main(String[] args) {
		System.out.println("Main Begin");
		System.out.println("a="+a);
		test(); //30
		print(); //60
		System.out.println("b="+b);
		System.out.println("Main End");
	}
	public static int print() {
		System.out.println("Print Begin");
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("Print End");
		return 60;
	}
}