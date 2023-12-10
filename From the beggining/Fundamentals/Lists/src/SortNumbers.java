import java.util.*;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] input = console.nextLine().split(" ");

        List<String> numbers = new ArrayList<>(Arrays.asList(input));

        Collections.sort(numbers);

        System.out.println(String.join(" <= ", numbers));

    }
}
