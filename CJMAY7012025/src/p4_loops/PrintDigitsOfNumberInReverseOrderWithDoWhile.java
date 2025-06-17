package p4_loops;

public class PrintDigitsOfNumberInReverseOrderWithDoWhile {

	public static void main(String[] args) {
//		int num = 45;
//		do {
//			System.out.println(num%10);
//			num = num / 10;
//		}while(num>0);
		
		for(int num = 125; num>0; num=num/10) {
			System.out.println(num%10);
		}

	}

}
