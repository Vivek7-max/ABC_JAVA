package p10_constructor;

public class P7 {
	
	int a = 40;
	
	public static void main(String[] args) {
		P7 obj = new P7();
		System.out.println(obj.a);
		obj.test();
	}
	
	public void test() {
		int a = 60;
		System.out.println(a); //60
		System.out.println(this.a);
	}
}
