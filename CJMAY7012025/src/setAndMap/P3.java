package setAndMap;

import java.util.TreeSet;

public class P3 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		
		ts.add(10);
		ts.add(70);
		ts.add(20);
		ts.add(5);
		ts.add(60);
		
		System.out.println(ts);
		
		for(Object o : ts) {
			System.out.println(o);
		}
	}
}
