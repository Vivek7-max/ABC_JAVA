package collection;

import java.util.ArrayList;

public class P1 {
	public static void main(String[] args) {
		//Object For Collection
		ArrayList l = new ArrayList();
		
		System.out.println(l);//Empty Collection
		System.out.println(l.size()); //0
		
		l.add(10);
		l.add("Hi");
		l.add('a');
		l.add(50.5);
		l.add(35);
		l.add("Hi");
		
		System.out.println(l);//[10,Hi,a,50.5,35]
		System.out.println(l.size());//5
	}
}
