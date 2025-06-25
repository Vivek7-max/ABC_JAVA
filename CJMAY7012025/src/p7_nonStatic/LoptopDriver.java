package p7_nonStatic;

public class LoptopDriver {

	public static void main(String[] args) {
		Laptop l1 = new Laptop();
		l1.brand = "HP";
		l1.color = "Black";
		l1.ram = 8;
		l1.price = 45000;
		System.out.println("Configurations of L1: ");
		System.out.println("Laptop BRAND: "+l1.brand); //HP
		System.out.println("Laptop COLOR: "+l1.color); //Black
		System.out.println("Laptop RAM: "+l1.ram); //8
		System.out.println("Laptop PRICE: "+l1.price); //45000
		
		Laptop l2 = new Laptop();
		l2.color = "Grey";
		l2.ram = 12;
		l2.price = 65000;
		System.out.println("==========");
		System.out.println("Configurations of L2: ");
		System.out.println("Laptop BRAND: "+l2.brand); //HP
		System.out.println("Laptop COLOR: "+l2.color); //Grey
		System.out.println("Laptop RAM: "+l2.ram); //12
		System.out.println("Laptop PRICE: "+l2.price); //65000

	}

}
