import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+")).toList();

        String[] command = scanner.nextLine().split("\\s+");

        while (!command[0].equals("Party!")){
            


            command = scanner.nextLine().split("\\s+");
        }


    }
}
