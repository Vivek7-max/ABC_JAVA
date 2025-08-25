package setAndMap;

import java.util.Collection;
import java.util.HashMap;

public class P17 {
	public static void main(String[] args) {
		HashMap hm = new HashMap();

		hm.put(111, "Java");
		hm.put(222, "Selenium");
		hm.put(333, "Python");
		hm.put(777, "SQL");
		hm.put(444, "HTML");
		hm.put(101, "Hi");
		hm.put(999, "CSS");
		hm.put(102, "CSS");
		
		System.out.println(hm);
		
		Collection c = hm.values();
		
		System.out.println(c);
	}
}
