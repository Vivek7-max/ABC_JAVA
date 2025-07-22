package test;

import java.util.Scanner;

public class LearnScannerClass1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number to go for addition");
		int a = sc.nextInt();
		System.out.println("Enter the second number to go for addition");
		int b = sc.nextInt();
		int sum = a+b;
		System.out.println("Addition of entered numbers is: ");
		System.out.println(sum);
		
	}
}
