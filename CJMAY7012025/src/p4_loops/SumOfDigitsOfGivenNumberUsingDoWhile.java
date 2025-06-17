package p4_loops;

public class SumOfDigitsOfGivenNumberUsingDoWhile {
	public static void main(String[] args) {
//		int num = 125;
//		int temp = num;
//		int sum = 0;
//		do {
//			sum = sum + num % 10;
//			num = num / 10;
//		} while(num>0);
//		
		
		int sum = 0;
		int num = 125;
		int temp = num;
		for(; num>0; num=num/10) {
			sum = sum + num%10;
		}
		
		System.out.println("sum of digits of "+temp+" is: "+sum);
	}
}
