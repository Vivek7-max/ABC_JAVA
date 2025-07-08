package p12_HasARelationship;

public class SchoolDriver {
	public static void main(String[] args) {
		School sch1 = new School();
		sch1.admission("Sheela");
		
		System.out.println(sch1.s1.stuName);
		
		sch1.s1.bunk();
	}
}
