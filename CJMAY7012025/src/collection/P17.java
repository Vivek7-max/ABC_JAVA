package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class P17 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(20);
		al.add(40);
		al.add(90);
		al.add(2);
		al.add(10);
		System.out.println(al);
		
		//get(int index) => Object
		System.out.println("Using Get Method");
		for(int i = 0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		//Iterator => hasNext(), next()
		System.out.println("Using Iterator");
		Iterator i=al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
	}
}
