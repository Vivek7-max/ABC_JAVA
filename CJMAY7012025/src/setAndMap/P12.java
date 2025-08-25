package setAndMap;

import java.util.HashMap;

public class P12 {
	public static void main(String[] args) {
		HashMap hm = new HashMap();

		hm.put(111, "Java");
		hm.put(222, "Selenium");
		hm.put(333, "Python");
		hm.put(777, "SQL");

		System.out.println(hm);
		
		HashMap hm1 = new HashMap();
		hm1.put(444, "HTML");
		hm1.put(10, "Hi");
		hm1.put(999, "CSS");
		hm1.putAll(hm);
		
		System.out.println(hm1);
	}
}
