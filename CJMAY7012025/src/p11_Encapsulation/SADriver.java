package p11_Encapsulation;

public class SADriver {

	public static void main(String[] args) {
		SavingAccount s1 = new SavingAccount("Miss. Sheela", 45678, "ICICI007",50000);
		s1.display();
		s1.withDraw(20000);
		s1.deposit(100000);
		
		System.out.println(s1.getBal());
		
		s1.setBal(400000);
		s1.display();

	}

}
