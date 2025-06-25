package p7_nonStatic;

public class P5 {
	int a ; 
	public static void main(String[] args) { 
		System.out.println("Main Begin"); 
		P1 obj1 = new P1(); 
		obj1.a = 10; 
		System.out.println(obj1.a); 
		P1 obj2 = new P1(); 
		System.out.println(obj2.a); 
		System.out.println("Main End");
	}
}
