package setAndMap;

import java.util.HashMap;
import java.util.Map;

public class P8 {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		
		hm.put("Hi", 102);
		hm.put("Hi", 103);
		hm.put("Hye", 101);
		hm.put(null, null);
		
		
		System.out.println(hm); //{101=Ram, 103=Sheela.....}
	}
}
