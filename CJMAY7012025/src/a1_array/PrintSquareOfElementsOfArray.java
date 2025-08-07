package a1_array;

import java.util.Scanner;

public class PrintSquareOfElementsOfArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] a = new int[7];
		System.out.println("Enter the elements of array");
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Elements of arraya are:");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		System.out.println("Square of each element in the array: ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]*a[i]+" ");
		}
		
	}
}
