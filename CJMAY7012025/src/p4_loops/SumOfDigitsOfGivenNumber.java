package p4_loops;

public class SumOfDigitsOfGivenNumber {
	public static void main(String[] args) {
		int num = 45; //12 //1
		int temp = num;
		int sum = 0; //5 //7 //8
		
		while(num>0) {
			sum = sum + num%10;
			num = num / 10;
		}
		
		System.out.println("Sum of digits of "+temp+" is: "+sum); //8
		
	}
}
//num = 125 => 1+2+5 => 8
// num = 45 => 4+5 => 9
