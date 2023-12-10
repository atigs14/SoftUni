import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        /*
        Read a list of integers and find the longest sequence of equal elements.
        If several exist, print the leftmost.
        */

        //Reading, parsing and creating list of the input, last part - collect(Collectors.toList()) - is used instead of .toList, because of app that tests my solutions.
        List<Integer> input = Arrays.stream(console.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int bestNumber = 0;
        int bestCounter = 0;

        for (int i = 0; i < input.size(); i++) {
            int counter = Collections.frequency(input, input.get(i));
            if (counter > bestCounter){
                bestCounter = counter;
                bestNumber = input.get(i);
            }
        }

        for (int i = 0; i < bestCounter; i++) {
            System.out.print(bestNumber + " ");
        }

    }
}
