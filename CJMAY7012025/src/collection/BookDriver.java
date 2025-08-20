package collection;

import java.util.ArrayList;
import java.util.Collections;

public class BookDriver {
	public static void main(String[] args) {
		Book b1 = new Book("ABC", 12, 250);
		Book b2 = new Book("PQR", 10, 550);
		Book b3 = new Book("LMN", 7, 200);
		
		ArrayList al = new ArrayList();
		
		al.add(b1);
		al.add(b2);
		al.add(b3);
		
		System.out.println(al);
		
		Collections.sort(al); 
		
		System.out.println(al);
		
		
	}
}
