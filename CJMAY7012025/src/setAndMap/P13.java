package setAndMap;

import java.util.HashMap;

public class P13 {
	public static void main(String[] args) {
		HashMap hm = new HashMap();

		hm.put(111, "Java");
		hm.put(222, "Selenium");
		hm.put(333, "Python");
		hm.put(777, "SQL");
		
		System.out.println(hm);
		
		System.out.println(hm.containsValue("SQP"));
	}
}
