package a1_array;

import java.util.Arrays;
import java.util.Scanner;

public class P10_BubbleSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of the array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter elements of the array");
		for(int i = 0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Entered elements of array are: ");
		for(int i = 0; i<size; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		//Logic for bubble sort
		for(int i=0; i<size; i++) {
			for(int j=0; j<size-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println("Sorted elements of array are: ");
		for(int i = 0; i<size; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
