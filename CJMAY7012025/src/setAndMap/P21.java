package setAndMap;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
//Sort Map On the basis of values
public class P21 {
	public static void main(String[] args) {
		//Create generic map
		TreeMap<Integer, String> hm = new TreeMap();
		//Put entries
		hm.put(11, "A");
		hm.put(22, "C");
		hm.put(33, "Z");
		hm.put(77, "V");
		hm.put(44, "J");
		hm.put(10, "P");
		hm.put(99, "T");
		
		System.out.println("Sorted map on the basis of Key: "+hm); //By default sorted on the basis of Key
		
		//Get the set of each entry
		Set s=hm.entrySet();
		
		// Note: To get the each entry we use Map.Entry
		//Created the Generic list of entries (Map.Entry<Integer, String>)
		
		ArrayList<Map.Entry<Integer,String>> al = new ArrayList(s);
		
		//Using sort method of list sort the entry on the basis of values
		//In Map.Entry we have comparingByValue() available
		al.sort(Map.Entry.comparingByValue());
		
		//Printing sorted List of Entries
		System.out.println("Sorted List of Entries: "+al);
		
		//Creating the LikedHashMap (In LinkedHashMap Order of insertion is maintained)
		LinkedHashMap sorted = new LinkedHashMap();
		
		//Put each element of list (Which is Map.Entry type) in map
		// By iterating the list
		for(Map.Entry o : al) {
			sorted.put(o.getKey(), o.getValue()); //get each key and value and add in new map
		}
		
		//Printing sorted map
		System.out.println("Sorted map on the basis of values: "+sorted);
		
	}
}
