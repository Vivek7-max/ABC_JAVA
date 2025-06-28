package p8_nonStaticMethods;

public class P2 {
	
	int a ;
	static int b;
	
	public static void main(String[] args) {
		System.out.println("Main Begin"); //MB
		P2 obj = new P2();
		obj.test();
		System.out.println(obj.a); //0
		System.out.println(b); //0
		System.out.println("Main End"); //ME
	}
	
	public void test() {
		System.out.println("Test Being"); //TB
		System.out.println(a); //0
		System.out.println(b); //0
		System.out.println("Test End"); //TE
	}
	
}
