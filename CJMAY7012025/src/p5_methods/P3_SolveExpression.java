package p5_methods;

public class P3_SolveExpression {
	public static void main(String[] args) {
		int multiplication = mul(10,20);
		int answer = add(multiplication, 15);
		System.out.println(answer);
	}
	
	public static int mul(int a, int b) {
		System.out.println("Hi");
		return a*b;
	}
	
	public static int add(int a, int b) {
		return a+b;
	}
	
}

// 10 * 20 + 15 => 215