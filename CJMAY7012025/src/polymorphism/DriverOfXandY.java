package polymorphism;

public class DriverOfXandY {
	public static void main(String[] args) {
		Y obj = new Y();
		obj.dance(); //Hiphop..!=> From sub class
		
		X obj1 = new X();
//		obj1.dance(); //Kathak...!=> From super class
		
		X obj2 = new Y(); //upcasting
//		obj2.dance(); //Kathak...! => From super class
		
	}
}
