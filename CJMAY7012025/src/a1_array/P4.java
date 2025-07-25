package a1_array;

public class P4 {
	public static void main(String[] args) {
		double d[] = new double[5];
		
		System.out.println(d); //address
		System.out.println(d.length); //5
		
		d[0] = 15.5;
		d[1] = 10.5;
		d[2] = 5.5;
		d[3] = 10;
		d[4] = 0.7;
		d[d.length] = 53.5;
		d[-1] = 65.5;
		System.out.println(d[0]); //15.5
		System.out.println(d[1]);
		System.out.println(d[2]);
		System.out.println(d[3]);
		System.out.println(d[4]);
		
//		System.out.println(d[5]); //Exception
		System.out.println(d[6]);
		//ArrayIndexOutOfBoundsException
	}
}
