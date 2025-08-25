package setAndMap;

import java.util.HashSet;

public class P5 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();

		hs.add(10);
		hs.add(80);
		hs.add(60);
		hs.add(20);
		hs.add(40);

		System.out.println(hs);
		
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		Object [] b = hs.toArray();
		System.out.println(b); //Address
		
		//Is it possible to convert the List to Array?
		//Is it possible to convert the set to array?
		//==> Yes - toArray()
		
		
	}
}
