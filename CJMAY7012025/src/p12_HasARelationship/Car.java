package p12_HasARelationship;

public class Car {
	double mileage;
	Engine e1 = new Engine();

	public void drive() {
		System.out.println("Enjoy long ride..!");
	}
}
