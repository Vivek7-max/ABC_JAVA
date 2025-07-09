package p14_Inheritance;

public class B extends A{
	static int b = 60;
	
	public static void main(String[] args) {
		System.out.println(b); //60
		System.out.println(A.a); //50
		System.out.println(a); //50
		
		System.out.println(B.a); //50
		System.out.println(B.b); //60
		
	}

}
