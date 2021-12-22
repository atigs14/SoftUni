import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class NumberGameVoina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> firstDeck = new LinkedHashSet<>();
        Set<Integer> secondDeck = new LinkedHashSet<>();

        int[] firstLine = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] secondLine = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();


        for (int element : firstLine) {
            firstDeck.add(element);
        }
        for (int element : secondLine) {
            secondDeck.add(element);
        }

        int roundCounter = 50;

        while (roundCounter-- > 0 && !firstDeck.isEmpty() && !secondDeck.isEmpty()){

            int firstNumber = firstDeck.iterator().next();
            firstDeck.remove(firstNumber);

            int secondNumber = secondDeck.iterator().next();
            secondDeck.remove(secondNumber);

            if (firstNumber > secondNumber) {
                firstDeck.add(firstNumber);
                firstDeck.add(secondNumber);
            } else {
                secondDeck.add(firstNumber);
                secondDeck.add(secondNumber);
            }


        }

        if (roundCounter == 0) {
            System.out.println("Draw!");
        } else if (firstDeck.size() > secondDeck.size()){
            System.out.println("First player win!");
        } else {
            System.out.println("Second player win!");
        }
    }
}
