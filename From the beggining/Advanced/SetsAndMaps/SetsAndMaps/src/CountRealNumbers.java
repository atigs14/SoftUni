import java.util.*;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        /*
        Write a program that counts the occurrence of real numbers. The input is a single
        line with real numbers separated by a space. Print the numbers in the order of appearance.
        All numbers must be formatted to one digit after the decimal point.
         */

        Map<Double, Integer> numbers = new LinkedHashMap<>();

        double[] input = Arrays.stream(console.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        for (double number : input) {
            if (!numbers.containsKey(number)){
                numbers.put(number, 1);
            }else {
                numbers.put(number, numbers.get(number) + 1);
            }
        }

        for (Double key : numbers.keySet()) {
            System.out.println(key + " -> " + numbers.get(key));
        }
    }
}
