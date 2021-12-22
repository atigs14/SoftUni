import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CustomComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Integer> numbers = Arrays.stream(input.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        Comparator<Integer> comparator = ((first, second) -> {
            if (first % 2 == 0 && second % 2 != 0) {
                return -1;
            }
            else if (first % 2 != 0 && second % 2 == 0){
                return 1;
            } else {
                return first.compareTo(second);
            }
        });

        numbers.stream().sorted(comparator).forEach(number -> System.out.print(number +  " "));
    }
}
