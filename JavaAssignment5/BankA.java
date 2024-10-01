package JavaAssignment5;

class BankA extends Bank {
	private double balance;

	public BankA(double balance) {
		this.balance = balance;
	}

	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public double applyInterest() {
		return balance + (balance * interestRate);
	}
}
