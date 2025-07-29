package a1_array;

import java.util.Arrays;

public class P9_SortBuiltInMethod{
	public static void main(String[] args) {
		int[] a = {20,30,2,5,25};
		System.out.println("Elements of array");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		Arrays.sort(a);
		System.out.println("Sorted elements of array: ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
	}
}

//2 5 20 25 30 => Sort the elements of array
//sort(a)