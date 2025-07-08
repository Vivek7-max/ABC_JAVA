package p12_HasARelationship;

public class CarDriver {
	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println(c1.mileage);
		c1.drive();

		System.out.println(c1.e1);
		System.out.println(c1.e1.cc);
		
		c1.e1.combustion();
	}
}
