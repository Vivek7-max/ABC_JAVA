package buitInClasses;

public class Laptop {
	String brand;
	String color;
	double price;
	public Laptop(String brand, String color, double price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	public Laptop() {}
	
	public String toString() {
		return "[Brand: "+brand+", Color: "+color+", Price: "+price+"]";
	}
	
	public boolean equals(Object o) {
		Laptop temp = (Laptop) o;
		return this.brand == temp.brand && 
			   this.color == temp.color && 
			   this.price == temp.price;
	}
	
}
