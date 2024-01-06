package BankAccount;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] tokens = console.nextLine().split(" ");

        HashMap<Integer, BankAccount> accounts = new HashMap<>();

        while (!tokens[0].equals("End")){
            String command = tokens[0];

            if (command.equals("Create")){
                BankAccount bankAccount = new BankAccount();
                int id = bankAccount.getId();

                accounts.put(id, bankAccount);

                System.out.printf("Account ID%d created%n", id);

            } else if (command.equals("Deposit")){
                int id = Integer.parseInt(tokens[1]);
                int amount = Integer.parseInt(tokens[2]);

                if (id <= accounts.size()){
                    accounts.get(id).deposit(amount);
                    System.out.printf("Deposited %d to ID%d%n",amount, id);
                } else {
                    System.out.println("Account does not exist");
                }


            } else if (command.equals("SetInterest")){
                double interest = Double.parseDouble(tokens[1]);
                BankAccount.setInterestRate(interest);

            } else if (command.equals("GetInterest")){
                int id = Integer.parseInt(tokens[1]);
                int years = Integer.parseInt(tokens[2]);

                if (id <= accounts.size()){
                   double interest = accounts.get(id).getInterest(years);
                    System.out.printf("%.2f%n",interest);
                } else {
                    System.out.println("Account does not exist");
                }
            }



            tokens = console.nextLine().split(" ");
        }
    }

}
