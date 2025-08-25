package setAndMap;

import java.util.HashMap;

public class P16 {
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
		
		System.out.println(hm.get(1000));
	}
}
