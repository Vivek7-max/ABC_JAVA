package buitInClasses_Object;

public class P3 {
	public static void main(String[] args) {
		P3 obj = new P3();
		System.out.println(obj); //address1
		
		P3 obj1 = new P3();
		System.out.println(obj1); //address2
		
		System.out.println(obj == obj1); //false
		System.out.println(obj.equals(obj1)); //false
	}
}
