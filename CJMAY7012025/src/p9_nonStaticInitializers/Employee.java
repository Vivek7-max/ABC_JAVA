package p9_nonStaticInitializers;

public class Employee {
	static int count = 101;
	int eid ;
	String name;
	double sal;
	
	public void empDetails() {
		System.out.println("Employee Details: ");
		System.out.println("Employee Name: "+name);
		System.out.println("Employee ID: "+"TCS"+eid);
		System.out.println("Employee Salary: "+sal);
		System.out.println("*********************");
	}
	
	{
		eid = count++;
	}
}
