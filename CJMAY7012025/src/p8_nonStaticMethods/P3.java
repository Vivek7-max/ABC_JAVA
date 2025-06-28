package p8_nonStaticMethods;

public class P3 {
	
	int b;
	
	public static void main(String[] args) {
		P3 obj = new P3();
		System.out.println(obj);//add1
		obj.test();
		P3 obj1 = new P3();//add2
		obj1.test();
		
	}
	
	public void test() {
		int b = 60;
		System.out.println(this.b);//add1
		System.out.println(this); //add1
	}
	
}
