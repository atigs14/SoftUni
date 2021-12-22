import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Integer> numbers = Arrays.stream(input.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

//        Function<List<Integer>, Integer> getMinNumber = list -> Collections.min(list);
//        System.out.println(getMinNumber.apply(numbers));

        Consumer<List<Integer>> printMinNumber = list -> System.out.println(Collections.min(list));
        printMinNumber.accept(numbers);
    }
}
