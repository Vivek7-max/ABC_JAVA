package p5_methods;

public class UnderstandMethod2 {
	public static void main(String[] args) {
		System.out.println("Main Begin");
		add(); //Method call statement
		System.out.println("Main End");
	}

	public static void add() {
		System.out.println("Test Begin");
		int a = 50;
		int b = 60;
		int c = a+b;//110
		System.out.println(c);//110
		System.out.println("Test End");
	}
}
