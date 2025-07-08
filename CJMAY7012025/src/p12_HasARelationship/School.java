package p12_HasARelationship;

public class School {
	String schName;
	Student s1;
	
	public void admission(String stuName) {
		s1 = new Student(stuName);
		System.out.println("Admission is Done..!");
	}
}
