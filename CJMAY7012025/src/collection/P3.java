package collection;

import java.util.ArrayList;

public class P3 {
	public static void main(String[] args) {
		ArrayList al1 = new ArrayList();
		al1.add(10);
		al1.add(20);
		al1.add(50);
		al1.add(70);
		System.out.println(al1);
		
		ArrayList al2 = new ArrayList();
		al2.add("Sheela");
		al2.add("Meena");
		al2.add("Reena");
		al2.add("Teena");
		System.out.println(al2);
		
		al1.addAll(al2);
		System.out.println(al1);
		System.out.println(al1.size()); //8
		
//		al1.add(al2);
//		System.out.println(al1);
//		System.out.println(al1.size()); //5
	}
}
