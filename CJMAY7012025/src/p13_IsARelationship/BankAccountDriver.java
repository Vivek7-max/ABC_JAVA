package p13_IsARelationship;

public class BankAccountDriver {

	public static void main(String[] args) {
		BankAccount obj = new BankAccount(12345, "Sheela", 50000, "ICICI007");
		obj.details();

		LoanAccount obj1 = new LoanAccount(789456, "Meena", 20000, "HDFC123", 100000, 11.5);
		obj1.lADetails();

	}

}
