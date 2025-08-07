package a1_array;
import java.util.Scanner;
public class PrintOddNumbersPresentInTheArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		short [] a = new short[6];
		System.out.println("Enter the elements of array");
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextShort();
		}
		System.out.println("Elements of arraya are:");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Odd Elements of the array are: ");
		for(int i=0; i<a.length; i++) {
			if(a[i] % 2 != 0 ) {
				System.out.print(a[i]+" ");
			}
		}
	}
}
