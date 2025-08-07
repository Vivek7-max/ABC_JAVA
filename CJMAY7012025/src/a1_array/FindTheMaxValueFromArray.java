package a1_array;

import java.util.Scanner;

public class FindTheMaxValueFromArray {

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
		
		int max = a[0]; //10 20 //40 //70
		
		for(int i=1; i<a.length; i++) {
			if(a[i]<max) {
				max = a[i];
			}
		}
		
		System.out.println("Min value from array: "+max);

	}

}
