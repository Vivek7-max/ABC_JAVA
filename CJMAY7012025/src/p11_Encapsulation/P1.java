package p11_Encapsulation;

public class P1 {
	static int a=50;
	
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(P1.a);
		P1 obj = new P1();
		System.out.println(obj.a);

	}

}
