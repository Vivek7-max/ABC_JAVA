package test;

import java.util.Scanner;

public class LearnScannerClass5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your good name..");
		
		String name = sc.nextLine();
		System.out.println("Your Name Is: "+name);

	}

}
