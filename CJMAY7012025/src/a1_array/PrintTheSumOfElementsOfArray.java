package a1_array;

import java.util.Scanner;

public class PrintTheSumOfElementsOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		int [] a = new int[size];
		System.out.println("Enter the elements of array");
		for(int i=0; i<size; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Elements of arraya are:");
		for(int i=0; i<size; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int sum = 0;
		for(int i=0; i<size; i++) {
			sum = sum + a[i];
		}
		
		System.out.println("Sum of elements of arraya is: "+sum);

	}

}
