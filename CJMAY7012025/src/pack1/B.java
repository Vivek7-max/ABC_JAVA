package pack1;

public class B extends A {
	static int a = 10;
	public static void main(String[] args) {
		B obj = new B();
		System.out.println(obj.a); //10 From B
		A obj1 = new A();
		System.out.println(obj1.a); //30 From A
		A obj2 = new B();
		System.out.println(obj2.a); //30 From A
	}
}
