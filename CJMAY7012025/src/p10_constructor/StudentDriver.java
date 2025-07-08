package p10_constructor;

public class StudentDriver {
	public static void main(String[] args) {
		Student s1 = new Student("Sheela", 1, 9876543210L, "PASS");
		s1.display();
		
		Student s2 = new Student("Meena", 23, 8070605040L, "FAIL");
		s2.display();

		
	}
}
