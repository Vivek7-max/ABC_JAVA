package assignments;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		System.out.println("Enter the two values");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum = a+b;
		System.out.println("Sum of entered values: "+sum);
		
	}

}
