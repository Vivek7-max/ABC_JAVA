package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class P15 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(80);
		al.add(70);
		
		System.out.println(al);
		Iterator i = al.iterator();
				
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}
}
