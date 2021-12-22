import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder currentText = new StringBuilder();

        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque <String> queue = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();

            String situation = command.split("\\s+")[0];


            if (situation.equals("1")){
                String textToAdd = command.split("\\s+")[1];
                currentText.append(textToAdd);
                queue.push(textToAdd);

            } else if (situation.equals("2")) {

                int countElements = Integer.parseInt(command.split("\\s+")[1]);
                int startIndex = currentText.length() - countElements;
                currentText.delete(startIndex, currentText.length());
                queue.push(currentText.toString());

            } else  if (situation.equals("3")){
                int index = Integer.parseInt(command.split("\\s+")[1]);
                System.out.println(currentText.charAt(index - 1));

            } else {
                if (queue.size() > 1) {
                    queue.pop();
                    currentText = new StringBuilder(queue.peek());
                }
                else {
                    currentText = new StringBuilder();
                }
            }
        }
        System.out.println();
    }
}
