package nonPrimitiveTypecasting;

public class C {
	
	C(){
		super();
	}
	public static void main(String[] args) {
		C obj = new C();
//		obj.test(); //Ambiguity, Confusion => Diamond Problem
	}
}
