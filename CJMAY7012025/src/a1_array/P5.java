package a1_array;

import java.util.Scanner;

public class P5 {
	public static void main(String[] args) {
		System.out.println("Enter the length of array - ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter the elements of array - ");
		
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Entered Elements of array are: ");
		for(int i=0; i<size; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
