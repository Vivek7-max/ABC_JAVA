package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class MobileDriver {
	public static void main(String[] args) {
		Mobile m1 = new Mobile("Nokia",4,70000);
		Mobile m2 = new Mobile("Samsung",12,1500);
		Mobile m3 = new Mobile("Oppo",8,1800);
		
		ArrayList al = new ArrayList();
		al.add(m1);
		al.add(m2);
		al.add(m3);
		
		System.out.println(al);
		
		Collections.sort(al);
		
		System.out.println(al);
		
	}
}
