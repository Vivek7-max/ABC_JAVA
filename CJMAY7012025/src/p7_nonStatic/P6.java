package p7_nonStatic;

public class P6 {
	static int a = 40;
	int b;
	public static void main(String[] args) {
		System.out.println("Main Begin");
		
		P6 obj = new P6();
	
		System.out.println(obj.a); //40
		System.out.println(a);
		System.out.println(P6.a);
		
		System.out.println(obj.b);
	
		System.out.println("Main End");

	}

}
