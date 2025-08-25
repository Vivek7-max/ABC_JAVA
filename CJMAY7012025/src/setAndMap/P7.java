package setAndMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class P7 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();

		ts.add(10);
		ts.add(70);
		ts.add(20);
		ts.add(5);
		ts.add(60);
		
		System.out.println(ts);
		
		ArrayList al = new ArrayList(ts);
		
		Collections.reverse(al);
		
		System.out.println(al);
		
	}
}
