package bank;

public class AxisBank extends BankInfo {

	// Overriding method

	public void Deposit() {

		System.out.println("Total Amount Deposited in the Bank");
	}

	public static void main(String[] args) {

		AxisBank obj = new AxisBank();
		// This will call the child class version of Deposit()
		obj.Deposit();
		obj.saving();
		obj.fixed();

	}

}
