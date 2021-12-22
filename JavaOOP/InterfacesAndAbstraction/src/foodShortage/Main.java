package foodShortage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Buyer> buyerList = new ArrayList<>();

        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");

            if (tokens.length == 3) {
                Rebel rebel = new Rebel(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                buyerList.add(rebel);
            } else {
                Citizen citizen = new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2], tokens[3]);
                buyerList.add(citizen);
            }
        }


        int sum = 0;
        String names = scanner.nextLine();
        while (!names.equals("End")) {
             if (buyerList.contains(names)){
                 for (Buyer buyer : buyerList) {
                     buyer.buyFood();
                     int number = buyer.getFood();
                     sum += number;
                 }
             }

            names = scanner.nextLine();
        }

        System.out.println(sum);
    }
}
