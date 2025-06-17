package p4_loops;

public class PrintEvenNumbers {

	public static void main(String[] args) {
		int num = 1;
		
		while(num<=10) {
			
			if(num%2 == 0) {
				System.out.println(num);
			}
			num++;
		}
	}
}
