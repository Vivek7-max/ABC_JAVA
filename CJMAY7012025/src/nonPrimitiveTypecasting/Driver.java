package nonPrimitiveTypecasting;

public class Driver {
	public static void main(String[] args) {
		B obj = new B();
		
		System.out.println(obj.a); //10
		System.out.println(obj.b); //30
		
		A obj1 = obj; //Up casting
		
		System.out.println(obj1.a); //10
		
//		System.out.println(obj1.b); //Why? : disadvantage of Up casting
		
		//To create Generalized container, in which we can store 
		// address of sub class (Specialized classed)
		
	}
}
