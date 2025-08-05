package a1_array;

import java.util.Scanner;

public class P20 {

	public static void main(String[] args) {
//		char [] ch = {'A', 'B', 'C', 'D'};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("size of char array");
		int size = sc.nextInt();
		
		char [] ch = new char [size];
		System.out.println("Enter the elements of character array");
		
		char c1 = sc.next().charAt(0);
	}

}
