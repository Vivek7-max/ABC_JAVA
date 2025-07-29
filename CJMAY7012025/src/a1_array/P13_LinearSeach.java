package a1_array;

import java.util.Scanner;

public class P13_LinearSeach {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int[] a = new int[size];

		System.out.println("Entet the elements of the array");
		for(int i=0; i<size; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("Enter the element to be searched");
		int search = sc.nextInt();

		boolean flag = false;

		for(int i=0; i<a.length; i++) {
			if(search == a[i]) {
				flag = true;
				break;
			}
		}

		if(flag) {
			System.out.println(search+" is present in the array");
		}else {
			System.out.println(search+" is not present in the array");
		}
	}
}
