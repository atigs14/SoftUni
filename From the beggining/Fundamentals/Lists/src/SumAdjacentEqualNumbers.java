import java.util.*;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        /*
        Write a program to sum all adjacent equal numbers in a list of decimal numbers, starting from left to right.
        After two numbers are summed, the obtained result could be equal to some of its neighbors and should be
        summed as well (see the examples below).
        Always sum the leftmost two equal neighbors (if several couples of equal neighbors are available).
         */

        List<Double> input = new ArrayList<>(Arrays.stream(console.nextLine().split(" ")).map(Double::parseDouble).toList());

        for (int i = 0; i < input.size() - 1;) {
            if (input.get(i).equals(input.get(i + 1))) {
                input.set(i, (input.get(i) + input.get(i + 1)));
                input.remove(i + 1);
                i = 0;
            } else {
                i++;
            }
        }

        for (double el :
                input) {
            System.out.print(el + " ");
        }
    }
}
