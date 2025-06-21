package p6_static;

public class P1 {
	public static void main(String[] args) {
		P2.sheela();
		meena();
		
	}
	
	public static int meena() {
		System.out.println("Hi Meena - Method from P1");
		P2.sheela();
		return 10;
	}
}

//Q1 - Execute - P1
//Hi Sheela - Method from P2
//Hi Meena - Method from P1
//Hi Sheela - Method from P2