package a1_array;

public class P17 {
	public static void main(String[] args) {
		double[][] a = new double[3][3];
		
		a[0][0] = 10;
		a[0][1] = 20;
		a[0][2] = 30;
		
		a[1][0] = 11;
		a[1][1] = 22;
		
		a[2][0] = 1;
		a[2][1] = 2;
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
