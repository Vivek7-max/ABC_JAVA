package p9_nonStaticInitializers;

public class P4 {
	int a = test(); //30
	public static void main(String[] args) {
		System.out.println("Main Begin");
		P4 obj = new P4();
		System.out.println(obj.a);
		obj.a = 60;
		obj.test();
		P4 obj1 = new P4();
		System.out.println(obj1.a);
		System.out.println("Main End");
	}

	public int test() {
		System.out.println("Test Begin");
		System.out.println(a);
		System.out.println("Test End");
		return 30;
	}
}