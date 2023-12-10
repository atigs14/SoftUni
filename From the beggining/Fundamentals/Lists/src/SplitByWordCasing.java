import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SplitByWordCasing {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] input = console.nextLine().split("[,;:.!()\"'\\\\/\\[\\]\\s]+");

        List<String> lowercaseWords = new ArrayList<>();
        List<String> uppercaseWords = new ArrayList<>();
        List<String> mixedcaseWords = new ArrayList<>();

        for (String word : input) {
            if (word.matches("[a-z]+")) {
                lowercaseWords.add(word);
            } else if (word.matches("[A-Z]+")) {
                uppercaseWords.add(word);
            } else {
                mixedcaseWords.add(word);
            }
        }

        System.out.println("Lower-case: " + String.join(", ",lowercaseWords));
        System.out.println("Mixed-case: " + String.join(", ",mixedcaseWords));
        System.out.println("Upper-case: " + String.join(", ",uppercaseWords));

    }
}
