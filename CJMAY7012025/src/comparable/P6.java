package comparable;

import java.util.ArrayList;

public class P6 {
	public static void main(String[] args) {
		ArrayList <Integer>al = new ArrayList();
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		System.out.println(al);
		
		int sum = 0;
		for(Integer i:al) {
			sum = sum + i;
		}
		
		System.out.println(sum);
	}
}
