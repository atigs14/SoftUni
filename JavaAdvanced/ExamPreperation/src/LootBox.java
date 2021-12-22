import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LootBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> queue = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(stack::push);

        int sum = 0;

        while (!queue.isEmpty() && !stack.isEmpty()){
            int firstElement = queue.peek();
            int secondElement = stack.peek();

            int sumOfTwo = firstElement + secondElement;
            if (sumOfTwo % 2 == 0) {
                sum += sumOfTwo;
                queue.poll();
                stack.pop();
            } else {
                queue.offer(secondElement);
                stack.pop();
            }

        }

        String emptyBoxOutput = queue.isEmpty() ? "First lootbox is empty" : "Second lootbox is empty";

        String itemsValueOutput = sum >= 90 ? "Your loot was epic! Value: ":
                "Your loot was poor... Value: ";

        System.out.println(emptyBoxOutput);
        System.out.println(itemsValueOutput + sum);
    }
}
