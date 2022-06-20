package accounts;

public class CheckingAccount extends Account { // inherits Account
    public int rewardPoints;

    // Note: Constructors do not get inherited by the child class
    // So, CheckingAccount needs its own constructor, unless we add a no
    // no argument constructor to Account
    // public CheckingAccount() {  // CheckingAccount Constructor
    public CheckingAccount(double balance, double interestRate, int rewardPoints) {
        // super(50, 0.072); // calls constructor for Accounts(balance, interestRate);
        // This calls the Constructor in the Account Super Class, and we
        // provide the balance and interest rate values.
        // Super not needed when we create New Constructor in Account
        // that takes no arguments

        // super();  // calls constructor for Accounts(no arguments);
        super(balance, interestRate);
        // pass values as arguments into super
        //System.out.println ("Checking Account Constructor ");
        this.rewardPoints = rewardPoints;


    }
    public boolean purchase(double cost) {
        if (cost > balance) {
            return false;
        }

        balance -= cost;
        rewardPoints += calculateRewardPoints (cost);
        return true;
    }
    public int calculateRewardPoints(double cost) {
        return (int) (cost * 10);
    }

    public int getRewardPoints () {
        return rewardPoints;
    }
}
