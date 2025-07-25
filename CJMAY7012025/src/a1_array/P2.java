package a1_array;

public class P2 {
	public static void main(String[] args) {
		int[] a = {10,5,2,80,40,70}; //syntax1
		System.out.println("Address of Array: "+a); //address
		System.out.println("Elements of Array: ");
//		System.out.println(a[0]); //10
//		System.out.println(a[1]); //5
//		System.out.println(a[2]); //2
//		System.out.println(a[3]); //80
//		System.out.println(a[4]); //40
		
		for(int i=0;i<a.length;i++ ) {
			System.out.println(a[i]);
		}
	}
}
