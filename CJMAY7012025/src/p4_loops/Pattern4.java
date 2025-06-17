package p4_loops;

public class Pattern4 {
	public static void main(String[] args) {

		int num = 4;
		

		for(int i=0; i<num; i++) {
			
			int a = 1; 
			
			for(int j=0; j<num; j++) {
				System.out.print(a+" ");
				a++;
			}

			System.out.println();

		}
	}
}
