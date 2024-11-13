public class BankAccount {
    private String firstName;
    private String lastName;
    private int accountId;
    private double balance;

    public BankAccount(String firstName, String lastName,
                       int accountId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountId = accountId;

    }

    public String getFirstName() {
        return this.firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAccountId() {
        return this.accountId;
    }
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amt) {
            this.balance = this.balance + amt;
        System.out.println("Deposit complete. New balance: " + this.balance);
        }

    public void withdrawal(double amt) {
        if (amt > this.balance) {
            System.out.println("Insufficient funds.");
        } else {
            this.balance = this.balance - amt;
            System.out.println("Withdrawal complete. New balance: " + this.balance);
        }
    }
    public void accountSummary() {
        System.out.println("First Name: " + this.firstName +
        "\nLast Name: " + this.lastName +
                "\nAccount ID: " + this.accountId +
                "\nBalance: " + this.balance);
    }

}
