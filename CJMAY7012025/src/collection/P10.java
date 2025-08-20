package collection;

import java.util.ArrayList;

public class P10 {
	public static void main(String[] args) {
		ArrayList al1 = new ArrayList();
		al1.add(10);
		al1.add(20);
		al1.add(50);
		al1.add(70);
		System.out.println(al1); //[10,20,50,70]
		
		
		al1.remove(5); //IndexOutOfBoundsException

		
		
		System.out.println(al1); //[20,50,70]
		
	}
}
