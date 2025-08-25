package setAndMap;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class P1 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		hs.add(10);
		hs.add(80);
		hs.add(60);
		hs.add("Hi");
		hs.add('a');
		hs.add(10);
		hs.add(80);
		hs.add("Hi");
		
		System.out.println(hs);
		
		System.out.println("using Iterator");
		Iterator i = hs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("Using For Each loop");
		for(Object v : hs) {
			System.out.println(v);
		}
		
		
		HashSet hs1 = new HashSet(hs);
		System.out.println(hs);
		
	}
}
