package p10_constructor;

public class P1 {
	int a;
	public static void main(String[] args) {
		P1 obj = new P1();
		obj.a = 10;
		System.out.println(obj.a); //10
		
		P1 obj1 = new P1();
		System.out.println(obj1.a); //0

	}

}
