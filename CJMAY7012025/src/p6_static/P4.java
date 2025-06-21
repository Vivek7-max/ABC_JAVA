package p6_static;

public class P4 {
	static boolean c ;
	
	public static void sheela() {
		System.out.println("Hi Sheela");
	}
	
	static double b;
	
	public static void main(String[] args) {
		System.out.println(a); //0
		System.out.println(b); //0.0
		System.out.println(c); //false
		sheela(); //Hi Sheela
		P4.sheela(); //Hi Sheela
		System.out.println(P4.a); //0 
		System.out.println(P4.b); //0.0
		System.out.println(P4.c); //false
	}
	static int a ;
}
