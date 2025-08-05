package a1_array;

public class P18 {

	public static void main(String[] args) {
		int [] [] a = new int [4] []; //jagged array
		
		System.out.println(a.length); //4
		
//		System.out.println(a[0].length);
		
		a[0] = new int[2];
		a[1] = new int[3];
		a[2] = new int[1];
		a[3] = new int[7];
		
		System.out.println(a[0].length); //2
		System.out.println(a[1].length); //3
		
		for(int i =0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
