package JavaAssignment5;

class BankC extends Bank {
	private double balance;

	public BankC(double balance) {
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
