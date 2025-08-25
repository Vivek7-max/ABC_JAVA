package setAndMap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class P4 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(30);
		al.add(10);
		al.add(70);
		al.add(20);
		System.out.println(al);
		
		TreeSet ts = new TreeSet(al);
		System.out.println(ts);
		
	}
}
