import java.util.ArrayDeque;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> queue = new ArrayDeque<>();
        String[] input = scanner.nextLine().split("\\s+");
        int n = Integer.valueOf(scanner.nextLine());

        for (String child :
                input) {
            queue.offer(child);
        }

        while (queue.size() > 1) {

            System.out.printf("Removed %s%n",queue.poll());
        }
        System.out.println("Last is " + queue.poll());
    }
}
