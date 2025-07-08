package p11_Encapsulation;

public class P3 {
	int a = 20;
	
	public static void main(String[] args) {
		P3 obj = new P3();
		obj.test();
	}
	
	
	public void test() {
		System.out.println(a);
		P3 obj = new P3();
		System.out.println(obj.a);
		System.out.println(this.a);
	}
	
}
