package p12_HasARelationship;

public class Student {
	int sId;
	String stuName;
	
	public Student(String stuName){
		//pre defined
		this.stuName = stuName;
	}
	
	public void bunk() {
		System.out.println("Looses Knowledge...");
	}
	
}
