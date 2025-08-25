package setAndMap;

import java.util.HashMap;

public class P14 {
	public static void main(String[] args) {
		HashMap hm = new HashMap();

		hm.put(111, "Java");
		hm.put(222, "Selenium");
		hm.put(333, "Python");
		hm.put(777, "SQL");
		hm.put(444, "HTML");
		hm.put(101, "Hi");
		hm.put(999, "CSS");
		
		System.out.println(hm);
		
		
		System.out.println(hm.remove(444));
		System.out.println(hm);
		
	}
}
