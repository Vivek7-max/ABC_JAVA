package p12_HasARelationship;

public class Driver {

	public static void main(String[] args) {
		P1 obj = new P1();
		System.out.println(obj.a); //0
		System.out.println(obj.b); //null
		obj.test();
		System.out.println(obj.b.s); //null
		obj.b.print(); //
		
//		obj.test();
//		System.out.println(obj.b);
	}

}
