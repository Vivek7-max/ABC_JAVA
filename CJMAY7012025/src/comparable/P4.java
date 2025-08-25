package comparable;

public class P4 {
	public static void main(String[] args) {
		byte a = 10;
		Byte i = a; //Boxing => Primitive to Non Primitive
		
		System.out.println(i.toString()); //10
		
		Short b = 60;
		short j = b; //Un-Boxing => Non Primitive to Primitive
		
		System.out.println(j); //60
		
	}
}
