package p10_constructor;

public class Ipl {
	String tName;
	String tCaptain;
	String tCoach;
	int matches;
	
	public Ipl(String tName, String tCaptain, String tCoach, int matches){
		//pre ins
		this.tName = tName;
		this.tCaptain = tCaptain;
		this.tCoach = tCoach;
		this.matches = matches;
	}
	
	public void details() {
		System.out.println("TEAM DETAILS: ");
		System.out.println("Team Name: "+tName);
		System.out.println("Team Captain: "+tCaptain);
		System.out.println("Team Coach: "+tCoach);
		System.out.println("Number of matches played: "+matches);
		System.out.println("****************************");
	}
	
	//new ConstructorOfClass;
	
	
}
