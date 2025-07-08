package p10_constructor;

public class Car {
	
	String brand;
	double price;
	String color;
	int milage;
	
	public Car(String brand, double price, String color, int milage) {
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.milage = milage;
	}

	public void details() {
		System.out.println("CAR DETAILS: ");
		System.out.println("Car Brand: "+brand);
		System.out.println("Car Price: "+price);
		System.out.println("Car Color: "+color);
		System.out.println("Car Milage: "+milage);
		System.out.println("======================");
	}
}
