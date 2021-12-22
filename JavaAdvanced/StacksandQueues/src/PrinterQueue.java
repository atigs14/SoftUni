import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<String> tasks = new ArrayDeque<>();

        while (!input.equals("print")){
            if (input.equals("cancel")){
                if (tasks.isEmpty()){
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + tasks.pollFirst());
                }
            }else {
                tasks.offer(input);
            }
            input = scanner.nextLine();
        }
        while (!tasks.isEmpty()){
            System.out.println(tasks.pollFirst());
        }

    }
}
