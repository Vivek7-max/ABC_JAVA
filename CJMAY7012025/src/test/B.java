package test;

public class B extends A{
	int a = 20;
	public static void main(String[] args) {
		B obj = new B();
		obj.test();
	}
	public void test() {
		int a = 30;
		System.out.println(a); //30 
		System.out.println(this.a); //20
		System.out.println(super.a); //10
	}
}
