package p10_constructor;

public class Student {
	String sName;
	int sSno;
	long sPhon;
	String result;
	
	Student(String sName, int sSno, long sPhon, String result){
		this.sName = sName;
		this.sSno = sSno;
		this.sPhon = sPhon;
		this.result = result;		
	}
	
	public void display() {
		System.out.println("Student Details: ");
		System.out.println("Student Name: "+sName);
		System.out.println("Student Roll Number: "+sSno);
		System.out.println("Student Contact Number: "+sPhon);
		System.out.println("Student Result: "+result);
		System.out.println("****************************");
	}
}
