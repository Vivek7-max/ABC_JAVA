package p6_static;
public class P13 {
	static int a = 90;
	static
	{
		System.out.println("SIB - 1");
	}
	public static int print() {
		System.out.println("JAVA");
		System.out.println("PYTHON");
		return 5+40;
	}
	static double b = a + test();
	public static void main(String[] args) {
		System.out.println("Mumbai..!");
		System.out.println(--a);
		if(test()<print()) {
			System.out.println("All the Best..!");
		}
		System.out.println(b++);
		System.out.println("Pune");
	}
	public static double test() {
		System.out.println("Sheela");
		System.out.println(print());
		System.out.println("Meena");
		return 50.5;
	}
	static
	{
		System.out.println("SIB - 2");
	}
}
