package ListUtilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        ArrayList<Integer> integers = new ArrayList<>();
        Collections.addAll(integers, 1, 2, 3, 4, 15);
        Integer maxInteger = ListUtils.getMax(integers);

        ArrayList<String> strings = new ArrayList<>();
        Collections.addAll(strings, "a", "b");
        String minString = ListUtils.getMin(strings);

        System.out.println(maxInteger);
        System.out.println(minString);


    }
}
