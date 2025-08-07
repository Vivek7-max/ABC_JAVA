package buitInClasses;

public class LaptopDriver {

	public static void main(String[] args) {
		Laptop l1 = new Laptop("HP", "Black", 55000);
		System.out.println(l1); 
		Laptop l2 = new Laptop("Dell", "Pink", 55000);
		System.out.println(l2);
		
		
		if(l1.equals(l2)) {
			System.out.println("Laptops are having same details");
		}else {
			System.out.println("Laptops are having different details");
		}
		
		
	}

}
