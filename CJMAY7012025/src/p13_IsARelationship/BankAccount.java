package p13_IsARelationship;

public class BankAccount {
	int acno;
	String acName;
	double bal;
	String ifsc;
	
	public BankAccount(){}
	
	public BankAccount(int acno, String acName, double bal, String ifsc) {
		this.acno = acno;
		this.acName = acName;
		this.bal = bal;
		this.ifsc = ifsc;
	}
	
	public void details() {
		System.out.println("Bank Account Details: ");
		System.out.println("Accont Number: "+acno);
		System.out.println("Accout Holder Name: "+acName);
		System.out.println("Account Balance: "+bal);
		System.out.println("IFSC Code: "+ifsc);
		System.out.println("+++++++++++++++++++++++");
		
	}
	
	
}
