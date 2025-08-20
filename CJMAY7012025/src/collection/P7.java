package collection;

import java.util.ArrayList;

public class P7 {
	public static void main(String[] args) {
		ArrayList al1 = new ArrayList();
		al1.add(10);
		al1.add("Meena");
		al1.add(20);
		al1.add(50);
		al1.add("Sheela");
		al1.add(70);
		
		System.out.println(al1);
		
		ArrayList al2 = new ArrayList();
		al2.add("Meena");
		al2.add("Sheela");
		System.out.println(al2);
		
//		al1.add(al2); //[10,20,50,70,[Meena,Sheela]]
		
		System.out.println(al1.contains(al2));
	}
}
