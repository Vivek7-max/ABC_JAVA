package test;

import java.util.Scanner;

public class LearnScannerClass2 {
	public static void main(String[] args) {
		LearnScannerClass2 obj = new LearnScannerClass2();
		obj.add();
	}
	
	public void add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		double a = sc.nextDouble();
		System.out.println("Enter second numbr");
		int b = sc.nextInt();
		System.out.println("Sum of Entered number is: ");
		System.out.println(a+b);
	}
	
}
