package p8_nonStaticMethods;

public class P4 {
	int a ; //0
	static int b = 50; //50
	static int c = test(); //30
	
	public static int test() {
		return 30;
	}
	public static void main(String[] args) {
		System.out.println(test()); //30
		P4 obj = new P4();
		obj.print();
		System.out.println(obj.a);//0
		System.out.println(b);//50
		System.out.println(c); //30
	}
	public void print() {
		System.out.println(a); //0
		System.out.println(b); //50
		System.out.println(c); //30
	}
}
