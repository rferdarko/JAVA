import accounts.Account;

public class Main {
    public static void main(String[] args) {
        // Create an instance of Account and set the balance and interest rate
        Account account = new Account(100, 0.025);
        account.status(); // Check the account status, prints out the balance
        account.withdraw(45.86); // withdrawal
        account.status(); // check balance
        account.withdraw(62.96); // withdrawal
        account.status(); // check balance
        account.deposit(32.50); // deposit
        account.status(); // check balance


    }

}
