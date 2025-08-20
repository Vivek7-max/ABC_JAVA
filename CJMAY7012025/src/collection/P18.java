package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class P18 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(20);
		al.add(40);
		al.add(90);
		al.add(2);
		al.add(10);
		
		System.out.println(al);
		
		System.out.println("Using Iterator");
		Iterator i = al.iterator();
		//remove() => remove the element in the collection
		
		while(i.hasNext()) {
			System.out.println(i.next());
			i.remove();
		}
		
		System.out.println(al);
		
	}
}
