package p6_static;

public class P10 {
	static int a = 10;
	static
	{
		System.out.println("Static Block1");
	}
	
	public static void test() {
		System.out.println("Meena");
	}
	
	
	public static void main(String[] args) {
		System.out.println("Sheela");
		test();
		System.out.println(P10.a);
	}
	
	static
	{
		System.out.println("Static Block2");
	}
	
}
