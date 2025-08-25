package setAndMap;

import java.util.Comparator;
import java.util.TreeMap;
//Sort the map in reverse order
public class P22 {
	public static void main(String[] args) {
		TreeMap<Integer, String> hm = new TreeMap(Comparator.reverseOrder());
		//Put entries
		hm.put(11, "A");
		hm.put(22, "C");
		hm.put(33, "Z");
		hm.put(77, "V");
		hm.put(44, "J");
		hm.put(10, "P");
		hm.put(99, "T");
		
		System.out.println(hm);
		
		/*
		 * In this program we are using the parameterized constructor of the 
		 * map which is accepts comparator type of parameter.
		 * => Comparator is Interface which gives the comparing properties like comparable interface
		 */
		
	}
}
