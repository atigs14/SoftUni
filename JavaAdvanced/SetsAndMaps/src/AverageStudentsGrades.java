import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, ArrayList<Double>> register =new TreeMap<>();

        String[] input = scanner.nextLine().split("\\s+");

        while (n-- > 0) {
            String name = input[0];
            Double grade = Double.parseDouble(input[1]);

            if (!register.containsKey(name)){
            }


            input = scanner.nextLine().split("\\s+");
        }
    }
}
