package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class P21 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(20);
		al.add(40);
		al.add(90);
		al.add(2);
		al.add(10);
		
		System.out.println(al);
		
		ListIterator li = al.listIterator(3);
		
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}
}
