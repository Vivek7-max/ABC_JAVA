package p11_Encapsulation;

public class P4 {
	 int a = 20;
	public static void main(String[] args) {
		
		P4 obj = new P4();
		obj.a = 60;
		System.out.println(obj.a); //60
		
		P4 obj1 = new P4();
		obj1.a = 45;
		System.out.println(obj.a); //60
		System.out.println(obj1.a); //45
		
	}
}
