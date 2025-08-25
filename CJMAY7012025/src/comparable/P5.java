package comparable;

import java.util.ArrayList;

public class P5 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		System.out.println(al);
		
		int sum = 0;
		
		for(Object i : al) {
			sum = sum + (int)i;
		}
		
		System.out.println(sum);
	}
}
