public class BankAccountApp {
    // Main Runner for the Bank Account Application
    public static void main(String[] args) {  // main method

        BankAccount acc1 = new BankAccount(); // creates a new instance of BankAccount
        // this then automatically calls on the BankAccount Constructor when the new instance
        // of BankAccount is instantiated
        // now we can add some of the default methods defined in the BankAccount class
        acc1.routingNumber();

        // This calls the Constructor with the accountType parameters and passes the account type
        BankAccount acc2 = new BankAccount("Checking Account"); // Calls the account type constructor
        BankAccount acc3 = new BankAccount("SAVINGS Account"); // Calls the account type constructor
        BankAccount acc4 = new BankAccount("Savings", 5000.55); // calls the 3rd Constructor
    }


}
