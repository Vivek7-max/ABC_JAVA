package comparable;

public class Mobile implements Comparable{
	String brand ;
	int ram;
	double price;
	
	public Mobile(String brand, int ram, double price) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}
	
	Mobile(){}

	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", ram=" + ram + ", price=" + price + "]";
	}
	
	public int compareTo(Object o) {
		Mobile temp = (Mobile)o;
		return (this.brand).compareTo(temp.brand);
	}
	
}
