package setAndMap;

import java.util.TreeMap;

public class P10 {
	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		
		tm.put(111, "Java");
		tm.put(222, "Selenium");
		tm.put(333, "Python");
		tm.put(777, "SQL");
		tm.put(444, null);
		System.out.println(tm);
		
	}
}
