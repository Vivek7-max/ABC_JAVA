package p8_nonStaticMethods;


public class LaptopDriver {
	public static void main(String[] args) {
		MyLaptop l1 = new MyLaptop();
		l1.brand = "HP";
		l1.color = "Black";
		l1.ram = 8;
		l1.price = 45000;
		l1.display();
		
		MyLaptop l2 = new MyLaptop();
		l2.color = "Grey";
		l2.ram = 12;
		l2.price = 65000;
		l2.display();

		MyLaptop l3 = new MyLaptop();
		l3.color = "Pink";
		l3.ram = 12;
		l3.price = 85000;
		l3.display();

	}
}
