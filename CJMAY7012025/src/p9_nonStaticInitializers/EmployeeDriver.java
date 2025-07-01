package p9_nonStaticInitializers;

public class EmployeeDriver {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.name = "Sheela";
		e1.sal = 35000;
		e1.empDetails();
		
		Employee e2 = new Employee();
		e2.name = "Shubham";
		e2.sal = 37000;
		e2.empDetails();
		
		Employee e3 = new Employee();
		e3.name = "Meena";
		e3.sal = 25000;
		e3.empDetails();
		
		Employee e4 = new Employee();
		e4.name = "Shruti";
		e4.sal = 50000;
		e4.empDetails();
		
	}
}
