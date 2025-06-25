package p7_nonStatic;

public class P7 {
	
	 int a;
	
	public static void main(String[] args) {
		System.out.println("Main Begin"); //MB
		P7 obj1 = new P7(); //a=0
		obj1.a = 10;
		System.out.println(obj1.a); //10
		
		
		P7 obj2 = new P7(); //a=0
		System.out.println(obj2.a); //0
		System.out.println("Main End"); //ME
		
		
		
	}

}
