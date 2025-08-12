package buitInClasses_Object;

public class P7 {

	public static void main(String[] args) {
		P7 obj = new P7();
		P7 obj1 = new P7();
		System.out.println(obj); //address
		System.out.println(obj1.toString()); //address
		
		System.out.println(obj==obj1); //false
		
		System.out.println(obj.hashCode()); //? unique int value
		System.out.println(obj1.hashCode()); //Unique int value
		
		System.out.println(obj.hashCode() == obj1.hashCode()); //false
		
	}

}
