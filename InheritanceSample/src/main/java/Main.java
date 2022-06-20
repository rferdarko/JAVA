import accounts.*;

public class Main {
    public static void main(String[] args) {
        // Create an instance of Account and set the balance and interest rate
        //Account account = new Account(100, 0.025);
        //account.status(); // Check the account status, prints out the balance
        //account.withdraw(45.86); // withdrawal
        //account.status(); // check balance
        //account.withdraw(62.96); // withdrawal
        //account.status(); // check balance
        //account.deposit(32.50); // deposit
        //account.status(); // check balance

        // new CheckingAccount (100,0.042); // New instance of CheckingAccount
        //CheckingAccount Account = new CheckingAccount ( 100,0.042, 700 );
        //System.out.println (Account.getRewardPoints ());
        //if (Account.purchase ( 18.63 )) {
        //    System.out.println ("Purchase successful");
        //}
        //else {
        //    System.out.println ("Purchase failed");
       // }
        //System.out.println (Account.getRewardPoints ());

        //CheckingAccount ca = new CheckingAccount (100, 0.037, 500 );
        //SavingsAccount sa = new SavingsAccount (100,0.045 );

        //ca.status ();
        //sa.status ();

        //ca.withdraw(10);
        //sa.withdraw (10);

        //ca.status ();
        //sa.status ();

        SilverCheckingAccount silver = new SilverCheckingAccount (5000,0.025, 1000);

        GoldCheckingAccount gold = new GoldCheckingAccount (5000, 0.025, 1000);

        DiamondCheckingAccount diamond = new DiamondCheckingAccount ( 5000, 0.025, 1000);

        System.out.println (silver.getRewardPoints ());
        System.out.println (gold.getRewardPoints ());
        System.out.println (diamond.getRewardPoints ());


        silver.purchase (50);
        gold.purchase ( 50 );
        diamond.purchase ( 50 );

        System.out.println (silver.getRewardPoints ());
        System.out.println (gold.getRewardPoints ());
        System.out.println (diamond.getRewardPoints ());



    }

}
