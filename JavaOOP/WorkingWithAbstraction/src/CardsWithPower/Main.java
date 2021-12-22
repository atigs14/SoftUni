package CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        RankPowers rankPowers = RankPowers.valueOf(scanner.nextLine());
        CardSuits cardSuits = CardSuits.valueOf(scanner.nextLine());

        Card card = new Card(cardSuits, rankPowers);
        System.out.printf("Card name: %s of %s; Card power: %d",rankPowers, cardSuits, card.getPower());
    }
}
