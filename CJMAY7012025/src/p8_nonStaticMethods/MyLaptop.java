package p8_nonStaticMethods;

public class MyLaptop {
	static String brand;
	String color;
	int ram;
	double price;	
	
	public void display() {
		System.out.println("Configurations of Laptop: ");
		System.out.println("Laptop BRAND: "+brand);
		System.out.println("Laptop COLOR: "+color);
		System.out.println("Laptop RAM: "+ram);
		System.out.println("Laptop PRICE: "+price);
		System.out.println("=========================");
	}
}
