package buitInClasses_Object;

public class P1 extends Object {
	int a = 20;
	public static void main(String[] args) {
		P1 obj = new P1();
		
		System.out.println(obj); //Address of object
		
		System.out.println(obj.toString()); //Address of Object
		System.out.println(obj.a);
		
	}
	
	public String toString() {
		return "Hi";
	}

}
