package polymorphism;

public class DriverOfAandB {

	public static void main(String[] args) {
		B obj = new B();
		System.out.println(obj.a); //70
		
		A obj1 = new A();
		System.out.println(obj1.a); //20
		
		A obj2 = new B(); //Upcasting
		System.out.println(obj2.a); //20
	}

}
