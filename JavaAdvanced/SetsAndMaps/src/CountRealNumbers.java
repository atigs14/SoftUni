import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer> values = new LinkedHashMap<>();

        for (double value : input) {
            if (!values.containsKey(value)){
                values.put(value, 1);
            } else {
                values.put(value, values.get(value) + 1);
            }
        }

        for (double key : values.keySet()) {
            System.out.printf("%.1f -> %d%n",key, values.get(key));
        }
    }

}
