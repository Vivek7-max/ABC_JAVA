package setAndMap;

import java.util.ArrayList;

public class P6 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(30);
		al.add(10);
		al.add(70);
		al.add(20);
		System.out.println(al);
		
		Object [] b = al.toArray();
		
		System.out.println(b); //Address
	}
}
