package p10_constructor;

public class CarDriver {

	public static void main(String[] args) {
		Car c1 = new Car("i10", 800000, "White", 21);
		c1.details();
		
		Car c2 = new Car("Ferari", 50000000, "Red", 13);
		c2.details();
	}

}
