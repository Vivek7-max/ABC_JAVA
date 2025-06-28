package p9_nonStaticInitializers;

public class P1 {
	int a = 30; //non static initializer
	public static void main(String[] args) {
		P1 obj = new P1();
		System.out.println(obj.a); //30
		
		P1 obj1 = new P1();
		System.out.println(obj1.a); //30
	}
	
}
