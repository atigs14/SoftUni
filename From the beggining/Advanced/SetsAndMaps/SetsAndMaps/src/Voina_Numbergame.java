import java.util.*;
import java.util.stream.Collectors;

public class Voina_Numbergame {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        /*Write a program that:
        · Reads 20 numbers for both players, separated with " " (single space).
        o Every player can hold only unique numbers.
        Each Round both players get the top number from their own deck. Player with the bigger number get both numbers and add it on the bottom of his own sequence.
        Game ends after 50 rounds or if any player lose all of his numbers.
         */

        Set<Integer> firstPlayerCards = Arrays.stream(console.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors
                        .toCollection(LinkedHashSet::new));
        Set<Integer> secondPlayerCards = Arrays.stream(console.nextLine()
                .split(" ")).map(Integer::parseInt)
                .collect(Collectors
                        .toCollection(LinkedHashSet::new));

        int round = 50;

        while (round-- >= 0 && !firstPlayerCards.isEmpty() && !secondPlayerCards.isEmpty()) {
            int firstCard = firstPlayerCards.iterator().next();
            firstPlayerCards.remove(firstCard);

            int secondCard = secondPlayerCards.iterator().next();
            secondPlayerCards.remove(secondCard);

            if (firstCard > secondCard) {
                firstPlayerCards.add(firstCard);
                firstPlayerCards.add(secondCard);
            } else if (secondCard > firstCard) {
                secondPlayerCards.add(firstCard);
                secondPlayerCards.add(secondCard);
            }

        }

        if (firstPlayerCards.size() > secondPlayerCards.size()){
            System.out.println("First player win!");
        } else if (secondPlayerCards.size() > firstPlayerCards.size()){
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }


    }
}
