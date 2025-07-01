package p9_nonStaticInitializers;

public class P6 {
	int a = 60;
	{
		System.out.println("IIB:1");
	}
	public static void main(String[] args) {
		System.out.println("Main Begin");
		P6 obj = new P6();
		obj.test();
		System.out.println("Main End");
	}
	public void test() {
		System.out.println("Test Begin");
		System.out.println("Test End");
	}
	int b;
	{
		System.out.println("IIB:2");
	}
}
