package nonPrimitiveTypecasting;

public class Driver1 {
	public static void main(String[] args) {
		B obj = new B(); //sub class object
		
		System.out.println(obj.a);  //10
		System.out.println(obj.b);  //30
		
		A obj1 = obj; //upcasting //super class type
		
		System.out.println(obj1.a); //10
//		System.out.println(obj1.b); //CTE
		
		B obj2 = (B) obj1; //down casting
		
		System.out.println(obj2.a); //10
		System.out.println(obj2.b); //30
		
		
	}
}
