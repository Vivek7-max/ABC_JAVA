package p11_Encapsulation;

public class Car {
	private String brand;
	private double price;
	private String color;
	
	public String getBrand() {
		return brand;
	}
	public double getPrice() {
		return price;
	}
	public String getColor() {
		return color;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Car(String brand, double price, String color) {
		this.brand = brand;
		this.price = price;
		this.color = color;
	}
	
	Car(){}
	
}
