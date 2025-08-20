package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class P22 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(20);
		al.add(40);
		al.add(90);
		al.add(2);
		al.add(10);
		
		System.out.println(al);
		
		ListIterator li = al.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
			li.add("Hi");
		}
		
		System.out.println(al); //?
		
		
	}
}
