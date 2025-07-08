package p11_Encapsulation;

public class SavingAccount {
	private String aName;
	private long aNo;
	private String aIfsc;
	private double bal;
	
	public String getName() {
		return aName;
	}
	
	public void setName(String aName) {
		this.aName = aName;
	}
	
	public long getAcno() {
		return aNo;
	}
	
	public void setAcno(long aNo) {
		this.aNo = aNo;
	}
	
	public String getIfsc() {
		return aIfsc;
	}
	
	public void setIfsc(String aIfsc) {
		this.aIfsc = aIfsc;
	}
	
	
	public double getBal() {
		return bal;
	}
	
	public void setBal(double bal) {
		this.bal = bal;
	}
	
	
	
	
	
	public SavingAccount() {}
	
	public SavingAccount(String aName, long aNo, String aIfsc, double bal) {
		this.aName = aName;
		this.aNo = aNo;
		this.aIfsc = aIfsc;
		this.bal = bal;
	}

	public void withDraw(double amt) {
		if(bal>=amt) {
			bal = bal - amt;
			System.out.println(amt+" is withdrown succesfully..!");
			System.out.println("Remaining Balance: "+bal);
			System.out.println("########################");
		}else {
			System.out.println("Insufficient Balance Bhava..!");
			System.out.println("########################");
		}
		
	}
	
	public void deposit(double amt) {
		bal = bal +amt;
		System.out.println(amt+" is deposited successfully..!");
		System.out.println("Available Balance: "+bal);
		System.out.println("########################");
	}
	
	public void display() {
		System.out.println("ACCOUNT DETAILS: ");
		System.out.println("Account Holder Name: "+aName);
		System.out.println("Account Number: "+aNo);
		System.out.println("Account IFSC: "+aIfsc);
		System.out.println("Account Balance: "+bal);
		System.out.println("########################");
	}
}
