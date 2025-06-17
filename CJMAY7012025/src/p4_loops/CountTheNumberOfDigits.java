package p4_loops;

public class CountTheNumberOfDigits {
	public static void main(String[] args) {
		int num = 125; 
		int count = 0; 
		
		while(num>0) {
			num = num/10; 
			count++;
		}
		
		System.out.println(count);
	}
}
//num = 45; => 2
//num = 125; => 3
//num = 1; => 1
//num = 45123; => 5