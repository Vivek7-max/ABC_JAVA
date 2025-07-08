package p10_constructor;

public class IplDriver {

	public static void main(String[] args) {
		Ipl rcb = new Ipl("RCB","VK","Ramu",3);
		rcb.details();
		
		Ipl mi = new Ipl("MI","RS","Shamu",1);
		mi.details();
		
		Ipl csk = new Ipl("CSK", "MSD", "SP", 4);
		csk.details();
		
	}

}
