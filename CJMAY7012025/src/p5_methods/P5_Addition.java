package p5_methods;

public class P5_Addition {
	public static void main(String[] args) {
		System.out.println(add(10,20)); //30.0
		System.out.println(add(1,2,3)); //6
		System.out.println(add(1,2,3,4)); //10
	}
	
	public static double add(double a, int b) {
		return a+b; 
	}
	
	public static double add(double a, int b, int c) {
		return a+b+c;
	}
	
	public static int add(int a, int b, int c, int d) {
		return a+b+c+d;
	}
	
	public static int add(int a, byte b, int c) {
		return a+b+c;
	}
}
