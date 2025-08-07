package a1_array;

import java.util.Scanner;

public class CountOddNumbersInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] a = new int[6];
		System.out.println("Enter the elements of array");
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Elements of arraya are:");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		int count = 0;
		for(int i=0; i<a.length; i++) {
			if(a[i] % 2 != 0 ) {
				count++;
			}
		}
		if(count == 0) {
			System.out.println("No Odd Number is present in the array");
		}else{
			System.out.println("Number of odd elements in the array: "+count);
		}
		
		
		
	}
}
