package p14_Inheritance;

public class Q extends P{
	int b = 50;
	Q(){
		super();
	}
	public static void main(String[] args) {
		Q obj = new Q();
		obj.test();
		System.out.println(obj.b); //Member of subclass : Why?
		System.out.println(obj.a); //members of superclass : Why?
		
		
	}
	
	public void test() {
		System.out.println(b); //50
		System.out.println(a); //60
	}
}
