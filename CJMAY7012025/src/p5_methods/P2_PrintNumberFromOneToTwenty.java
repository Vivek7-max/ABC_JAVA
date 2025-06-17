package p5_methods;

public class P2_PrintNumberFromOneToTwenty {

	public static void main(String[] args) {
		
		print(1,20);
	}
	
	public static void print(int a, int b) {
		
		while(a<=b) {
			System.out.print(a+" ");//1 //2.....20
			a++;
		}
		
	}

}
