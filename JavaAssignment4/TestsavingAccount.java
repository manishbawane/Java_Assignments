package JavaAssignment4;

public class TestsavingAccount {
    public static void main(String[] args) {
        
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        
        SavingsAccount.modifyInterestRate(3);

        
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        
        System.out.printf("Saver 1 new balance: $%.2f\n", saver1.getSavingsBalance());
        System.out.printf("Saver 2 new balance: $%.2f\n", saver2.getSavingsBalance());

       
        SavingsAccount.modifyInterestRate(4);

        
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.printf("Saver 1 new balance after 4%% interest: $%.2f\n", saver1.getSavingsBalance());
        System.out.printf("Saver 2 new balance after 4%% interest: $%.2f\n", saver2.getSavingsBalance());
    }
}

