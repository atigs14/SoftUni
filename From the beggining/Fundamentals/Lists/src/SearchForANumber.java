import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SearchForANumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        /*
        On the first line, you will receive a list of integers. On the next line,
        you will receive an array with exactly three numbers. First number represents
        the number of elements you have to take from the list (starting from the first one).
        Second number represents the number of elements you have to delete from the
        numbers you took (starting from the first one). Last number is the number we search
        in our collection after the manipulations. If it is present print: “YES!”, otherwise
        print “NO!”
         */

        List<Integer> input = Arrays.stream(console.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int[] secondLine = Arrays.stream(console.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int length = secondLine[0];
        int numbersToDelete = secondLine[1];
        int numberWeSearch = secondLine[2];

        List<Integer> newCollection = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            newCollection.add(input.get(i));
        }

        for (int i = 0; i < numbersToDelete - 1; i++) {
            newCollection.remove(i);
        }

        if (newCollection.contains(numberWeSearch)){
            System.out.println("YES!");
        } else {
            System.out.println("NO!");
        }

    }
}
