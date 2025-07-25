package a1_array;

import java.util.Scanner;

public class P6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of employees persent");
		
		int size = sc.nextInt();
		String arr[] = new String[size];
		
		System.out.println("Enter name of each employee");
		for(int i =0; i<size; i++) {
			arr[i] = sc.next();
		}
	
		System.out.println("Emplyee List: ");
		for(int i=0; i<size; i++) {
			System.out.println(arr[i]);
		}
		
	}
}
