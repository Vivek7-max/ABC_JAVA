package collection;

import java.util.ArrayList;

public class P14 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(60);
		al.add(70);
		al.add(30);
		
		System.out.println(al); //[10,20,60,70,30]
		
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		//Why? , How?
		
	}

}
