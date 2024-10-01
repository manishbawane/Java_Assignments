package JavaAssignment5;

class BankB extends Bank {
	private double balance;

	public BankB(double balance) {
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
