import java.util.ArrayDeque;
import java.util.Scanner;

public class BowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque URLS = new ArrayDeque();

        String command = scanner.nextLine();

        String current = null;
        while (!command.equals("Home")){


            if (command.equals("back")){
                if (URLS.isEmpty()){
                    System.out.println("no previous URLs");
                } else {
                    System.out.println(URLS.pop());
                }

            } else {
                if (current != null){
                    URLS.push(current);
                }
                current = command;
            }
            System.out.println(current);


            command = scanner.nextLine();
        }
    }
}
