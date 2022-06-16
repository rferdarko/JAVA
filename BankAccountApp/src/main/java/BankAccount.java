public class BankAccount {
    // This class creates a Bank Account Object

    // 1. VARIABLES
    String accountName;
    static String routingNumber = "5124783126";  // Static router number belongs to the class not the object
    String name;
    String ssn;
    String accountType;

    // 3. Constructors are definitions of unique methods
    /* 3a. Used to define / setup / initialize properties of the Object
       3b. Constructors are IMPLICITLY called automatically upon INSTANTIATION of an Object
       3c. Constructors have the same name as the class name
       3d. Constructors ARE METHODS, have parameters enclosed in parenthesis and have a body
       3e. Constructors have NO RETURN TYPE AT ALL, so there is no void, String, default...
    */

    // 3. CONSTRUCTORS
    BankAccount() {
        System.out.println("NEW BANK ACCOUNT CREATED");  // To prove a point
    }
    // Overloading - Calling the same method name with different arguments
    // this can apply to ANY Method, but here we're going to apply it to Constructors

    // 4. OVERLOADING
    // we'll create another Constructor with the parameter of Account Type (accountType)
    // and when we create a new account in the main method, we'll specifiy that it's a
    // "Checking Account" and pass that value to the Constructor

    BankAccount(String accountType){  // Constructor with accountType parameters
        System.out.println("NEW ACCOUNT CREATED: " + accountType); // This prints the type of account just created
    }
    // This Constructor takes the parameters accountType and initialDeposit parameters, Java knows how to handle it
    BankAccount(String accountType, double initialDeposit) {
        System.out.println("NEW ACCOUNT CREATED: " + accountType + " Initial Deposit: $"+ initialDeposit);
    }



    // 2. METHODS
    void deposit() {   // deposit funds from the Bank Account - no return value for method

    }
    void withdraw() {  // withdraw funds from the Bank Account - no return type for method

    }
    void checkBalance() { // check balance of the Bank Account - no return type for method

    }
    void getStatus() {    // get status of the Bank Account - no return type for method

    }

    void routingNumber() {  // Method to assign the static routing number to the accounts
        System.out.println("ROUTING NUMBER: "+ routingNumber +"\n"); // prints routing number with new line
    }
    // Steps:
    // 1. create the variables that all Bank Accounts will have
    // 2. methods available to ALL Bank Accounts
    // 3. Create constructors so new instances of the BankAccount Object can access the methods
    // constructors go in between the Variables and the Methods in the class and have the same name as the class
    // 4. Use Overloading - Calling the same method name with different arguments
    // we're going to apply it to the Constructors and have Overloaded Constructors

}
