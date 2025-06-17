package p5_methods;

public class P1_LargerstOfTwoNumbers {

	public static void main(String[] args) {
		lage(400,600);
	}
	
	public static void lage(int a, int b) {
		if(a>b) {
			System.out.println("Largest of "+a+" and "+b+" is: "+a);
		}else {
			System.out.println("Largest of "+a+" and "+b+" is: "+b);
		}
	}

}
