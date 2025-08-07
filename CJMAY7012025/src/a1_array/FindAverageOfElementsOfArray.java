package a1_array;

import java.util.Scanner;

public class FindAverageOfElementsOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] a = new int[5];
		System.out.println("Enter the elements of array");
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Elements of arraya are:");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		System.out.println("Average of elements of array is:");
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println(sum /a.length );

	}

}
