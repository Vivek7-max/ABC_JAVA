package setAndMap;

import java.util.ArrayList;
import java.util.HashSet;

public class P2 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(30);
		al.add(10);
		al.add(70);
		al.add(20);
		System.out.println(al);
		
		HashSet hs = new HashSet(al);
		System.out.println(hs);
		
	}
}
