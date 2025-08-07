package buitInClasses;

public class P8Driver {

	public static void main(String[] args) {
		P8 obj = new P8(10,20);
		System.out.println(obj);
		
		P8 obj1 = new P8(50,50);
		System.out.println(obj1);
		
		System.out.println(obj==obj1); //false
		
		System.out.println(obj.equals(obj1)); //false
		
		System.out.println(obj.hashCode()); //31
		System.out.println(obj1.hashCode()); //101

	}

}
