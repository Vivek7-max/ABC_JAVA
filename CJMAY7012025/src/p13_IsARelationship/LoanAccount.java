package p13_IsARelationship;

public class LoanAccount extends BankAccount {
	double lAmt;
	double roi;
	
	LoanAccount(){}
	
	public LoanAccount(int acno, String acName, double bal, String ifsc,double lAmt, double roi) {
		this.acno = acno;
		this.acName = acName;
		this.bal = bal;
		this.ifsc = ifsc;
		this.lAmt = lAmt;
		this.roi = roi;
	}
	
	public void lADetails() {
		System.out.println("Loan Account Details: ");
		System.out.println("Loan Accont Number: "+acno);
		System.out.println("Loan Accout Holder Name: "+acName);
		System.out.println("Loan Account Balance: "+bal);
		System.out.println("IFSC Code: "+ifsc);
		System.out.println("Loan Amount: "+lAmt);
		System.out.println("Rate of Interest: "+roi);
		System.out.println("++++++++++++++++++++++++");
	}
	
	
}
