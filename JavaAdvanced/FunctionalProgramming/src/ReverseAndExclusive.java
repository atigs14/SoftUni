import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverseAndExclusive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Integer> numbers = Arrays.stream(input.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int n = Integer.parseInt(scanner.nextLine());

        Collections.reverse(numbers);

        Predicate<Integer> isDivision = num -> num % n == 0;
        numbers.removeIf(isDivision);

        for (int num :
                numbers) {
            System.out.print(num + " ");
        }
    }
}
