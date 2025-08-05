package a1_array;

import java.util.Scanner;

public class PrintElemetsOfArrayReadDataFromUser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Integer array");
		int size = sc.nextInt();
		
		int [] a = new int [size]; 
		
		System.out.println("Enter the elements of the array");
		for(int i = 0; i<size; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Entered elements of array are: ");
		for(int i = 0; i<size; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
