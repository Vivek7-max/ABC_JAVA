package collection;

import java.util.ArrayList;

public class P23 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add(20);
		al.add(40);
		al.add(90);
		al.add("hi");
		al.add('A');
		al.add(50);
		al.add(10);
		
		System.out.println(al);
		
		System.out.println("Using Advanced for loop: ");
		
		for(Object i : al) {         // hasNext() , next()
			System.out.println(i);
		}
		
		
	}
}
