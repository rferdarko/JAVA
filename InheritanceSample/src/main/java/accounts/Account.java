package accounts;

public class Account {
    private double balance;
    private double interestRate;


    // Constructor to set balance and interest rates

    public Account(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    // Method for withdrawing money

    public boolean withdraw(double amount) { // takes in amount parameter
        if (amount > balance) { // if amount to withdraw exceeds balance
            return false;    // return false
        }

        balance -= amount;  // deduct amount from the balance
        return true;  // then return true
    }

    // Deposit Method
    public void deposit(double amount) { // takes in amount parameter
        balance += amount; // adds the amount to the balance
    }

    // Getters

    public double getBalance() {  // Gets Balance
        return balance;
    }

    public double getInterestRate() {  // Gets Interest Rate
        return interestRate;
    }

    // Status method to print the balance of the account
    public void status() {
        System.out.printf("Balance: %.2f\n" , balance);
    }
}
