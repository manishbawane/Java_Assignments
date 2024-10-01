package JavaAssignment4;

class SavingsAccount {
    private static double annualInterestRate; 
    private double savingsBalance; 

  
    public SavingsAccount(double balance) {
        this.savingsBalance = balance;
    }

   
    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
    }

    
    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate / 100; 
    }

   
    public double getSavingsBalance() {
        return savingsBalance;
    }
}
