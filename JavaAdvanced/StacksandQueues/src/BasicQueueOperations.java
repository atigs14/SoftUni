import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

       // int ellementsToPush = Integer.valueOf(input[0]);
        int ellementsToPop = Integer.valueOf(input[1]);
        String isNumberInside = input[2];

        ArrayDeque<String> queue = new ArrayDeque<>();
        String[] tokens = scanner.nextLine().split("\\s+");

        for (String token :
                tokens) {
            queue.add(token);
        }

        for (int i = 0; i < ellementsToPop; i++) {
            queue.pollFirst();
        }

        if (queue.contains(isNumberInside)){
            System.out.println("true");
        } else {
            if (queue.isEmpty()){
                System.out.println(0);
            }else {
                System.out.println(Collections.min(queue));

            }
        }

    }
}
