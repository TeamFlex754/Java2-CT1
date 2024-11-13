public class Main {
    public static void main(String[] args) {

        CheckingAccount newChecking1 = new CheckingAccount("Ian", "McVay",
                534, 2.5);

        newChecking1.deposit(500);
        newChecking1.withdrawal(600);
        newChecking1.processWithdrawal(600);
    }

}
