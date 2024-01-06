package BankAccount;

public class BankAccount {

    private final static double DEFAULT_INTEREST_RATE = 0.02;
    private static int bankAccountCount = 1;
    private final int id;
    private double balance;
    private static double interestRate = DEFAULT_INTEREST_RATE;


    public BankAccount() {
        this.id = bankAccountCount++;
    }

    public static void setInterestRate(double interestRate){
        BankAccount.interestRate = interestRate;
    }

    public double getInterest(int years){
        return years * BankAccount.interestRate * this.balance;
    }

    public void deposit ( double amount){
        this.balance += amount;
    }

    public int getId(){
        return this.id;
    }

}
