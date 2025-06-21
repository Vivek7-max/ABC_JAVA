package p5_methods;

public class P9 {
	public static void main(String[] args) {
		test(50);
		
	}
	
	public static void test(int a) {
		System.out.println(a); //Hi //Hi
		a--; //2
		if(a>=1) {
			test(a);
		}
		
	}
}
//P P P & P