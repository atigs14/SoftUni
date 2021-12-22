import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DatingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //stack
        ArrayDeque<Integer> males = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(males::push);

        //queue
        ArrayDeque<Integer> females = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toCollection(ArrayDeque::new));

        int matches = 0;

        while (!females.isEmpty() && !males.isEmpty()){
            int male = males.peek();
            int female = females.peek();

            if (male <= 0) {
                males.pop();
                continue;
            } else if (female <= 0) {
                females.poll();
                continue;
            }
            if (male % 25 == 0 ) {
                males.pop();
                males.pop();
                continue;
            } else if (female % 25 == 0) {
                females.poll();
                females.poll();
                continue;
            }


            if (male == female) {
                males.pop();
                females.poll();
                matches++;
            } else {
                females.poll();
                int decreasedNumber = males.pop() - 2;
                males.push(decreasedNumber);
            }

        }

        System.out.println("Matches: " + matches);
        if (males.isEmpty()){
            System.out.print("Males left: none");
        } else {
            System.out.print("Males left: ");
            for (int i = 0; i < males.size() - 1; i++) {
                System.out.print(males.pop() + ", ");
            }
            System.out.print(males.pop());
        }
        System.out.println();
        if (females.isEmpty()){
            System.out.println("Females left: none");
        } else {
            System.out.print("Females left: ");
            for (int i = 0; i < females.size(); i++) {
                System.out.print(females.poll() + ", ");
            }
            System.out.print(females.poll());
        }


    }
}
