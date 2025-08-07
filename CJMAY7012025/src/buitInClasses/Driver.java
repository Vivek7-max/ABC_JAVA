package buitInClasses;

public class Driver {
	public static void main(String[] args) {
		P6 obj = new P6(10);
		P6 obj1 = new P6(10);
		
		System.out.println(obj == obj1); //false    
		System.out.println(obj.equals(obj1)); //false
		
	}
}
