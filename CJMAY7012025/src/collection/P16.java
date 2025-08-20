package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class P16 {
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
			Object ele = i.next();
			i.remove();
		}
		System.out.println(al);
		System.out.println("Forward Tracking");
		ListIterator li = al.listIterator();
		while(li.hasNext()) {
			Object ele = li.next();
			al.remove(ele);
		}
		
		
	}
}
