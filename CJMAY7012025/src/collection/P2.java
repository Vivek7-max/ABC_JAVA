package collection;

import java.util.ArrayList;

public class P2 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(50);
		al.add(70);
		
		System.out.println(al);
		
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
	}
}
