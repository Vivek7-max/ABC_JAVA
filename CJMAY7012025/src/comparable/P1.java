package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class P1 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(20);
		al.add(60);
		al.add(30);
		al.add(10);
		
		System.out.println(al);
		
		Collections.sort(al);
		
		System.out.println(al);
		
		Collections.reverse(al);
		
		System.out.println(al);
	}
}
