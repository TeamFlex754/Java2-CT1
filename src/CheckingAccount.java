public class CheckingAccount extends BankAccount {

    private double interestRate;

    public CheckingAccount(String firstName, String lastName, int accountId, double interestRate) {
        super(firstName, lastName, accountId);
        this.interestRate = interestRate;
    }
    public void processWithdrawal(double amt) {
        if (amt > this.getBalance()) {
            System.out.println("$30 overdraft fee accessed.");
            double newBalance = this.getBalance() - amt - 30;
            System.out.println("New balance: " + newBalance);
        } else {
            this.withdrawal(amt);
        }
    }
    public void displayAccount() {
        super.accountSummary();
        System.out.println("Interest Rate: " + this.interestRate + "%");
    }

}
