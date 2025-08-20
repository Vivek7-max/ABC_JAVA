package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class P20 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(20);
		al.add(40);
		al.add(90);
		al.add(2);
		al.add(10);
		
		System.out.println(al);
		
		System.out.println("Using List Iterator in Forward Direction: ");
		ListIterator li = al.listIterator();
		
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
		System.out.println("Using List Iterator in reverse Direction");
	
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
		
	}
}
