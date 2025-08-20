package collection;

import java.util.ArrayList;
import java.util.Collections;

public class P25 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(30);
		al.add(90);
		al.add(70);
		al.add(10);
		al.add(20);
		
		System.out.println(al);
		
		Collections.sort(al); //1st way to sort collection
		
		System.out.println(al);
		
	}
}
