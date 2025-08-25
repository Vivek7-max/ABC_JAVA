package setAndMap;

import java.util.HashMap;

public class P9 {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		
		System.out.println(hm);
		
		hm.put(111, "Java");
		hm.put(222, "Selenium");
		hm.put(333, "Python");
		hm.put(null, null);
		hm.put(777, "SQL");
		
		System.out.println(hm);
		
	}
}
