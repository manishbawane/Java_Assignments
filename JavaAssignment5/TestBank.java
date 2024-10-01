package JavaAssignment5;

public class TestBank {
	public static void main(String[] args) {

		Bank bankA = new BankA(1000);
		Bank bankB = new BankB(1500);
		Bank bankC = new BankC(2000);

		System.out.println("Balance in Bank A: " + bankA.getBalance());
		System.out.println("Balance after interest in Bank A: " + bankA.applyInterest());

		System.out.println("Balance in Bank B: " + bankB.getBalance());
		System.out.println("Balance after interest in Bank B: " + bankB.applyInterest());

		System.out.println("Balance in Bank C: " + bankC.getBalance());
		System.out.println("Balance after interest in Bank C: " + bankC.applyInterest());
	}
}
