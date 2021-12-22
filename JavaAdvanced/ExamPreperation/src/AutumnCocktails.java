import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AutumnCocktails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //ingredients
        ArrayDeque<Integer> queue = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toCollection(ArrayDeque::new));

        //freshness
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(stack::push);

        int firstCocktail = 0;
        int secondCocktail = 0;
        int thirdCocktail = 0;
        int forthCocktail = 0;

        while (!queue.isEmpty() && !stack.isEmpty()){
            int first = queue.peek();
            int second = stack.peek();

            if (first <= 0) {
                queue.poll();
                continue;
            }

            int sum = first * second;

            if (sum == 150)  {
                queue.poll();
                stack.pop();
                firstCocktail++;
            }
            else if (sum == 250){
                queue.poll();
                stack.pop();
                secondCocktail++;
            }else  if (sum == 300){
                queue.poll();
                stack.pop();
                thirdCocktail++;
            }else if (sum == 400){
                queue.poll();
                stack.pop();
                forthCocktail++;
            } else {
                stack.pop();
                int newLevel = queue.poll() + 5;
                queue.offer(newLevel);
            }
        }

        if (firstCocktail != 0 && secondCocktail != 0 && thirdCocktail != 0 && forthCocktail != 0) {
            System.out.println("It's party time! The cocktails are ready!");
        } else {
            System.out.println("What a pity! You didn't manage to prepare all cocktails.");
        }

        if (!queue.isEmpty()){
            int sumOfLeft = 0;
            for (int e : queue) {
                sumOfLeft += e;
            }
            System.out.println("Ingredients left: " + sumOfLeft);
        }

        if (thirdCocktail != 0) {
            System.out.println(" # Apple Hinny --> " + thirdCocktail);
        }
        if (forthCocktail != 0) {
            System.out.println(" # High Fashion --> " + forthCocktail);
        }
        if (firstCocktail != 0) {
            System.out.println(" # Pear Sour --> " + firstCocktail);
        }
        if (secondCocktail != 0) {
            System.out.println(" # The Harvest --> " + secondCocktail);
        }
    }
}
