import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        /*
        Write a program that prints information about food shops in Sofia and the products they store. Until the "Revision" command you will receive an input in the format: "{shop}, {product}, {price}"
        Keep in mind that if you get a store that already exists, you need to gather product information in it.
        Your output must be ordered by shop name and must be in the format:
        "{shop}-> Product: {product}, Price: {price}"
        The price should be formated to one digit after the decimal point.
         */

        Map<String, Map<String, Double>> catalog = new TreeMap<>();

        String line = console.nextLine();

        while (!line.equals("Revision")) {

            String[] tokens = line.split(", ");
            String shopName = tokens[0];
            String product = tokens[1];
            Double price = Double.parseDouble(tokens[2]);


            if (!catalog.containsKey(shopName)){
                catalog.put(shopName, new LinkedHashMap<>());
            }

            Map<String, Double> innerMap = catalog.get(shopName);
            innerMap.put(product, price);

            line = console.nextLine();
        }

        for (String shopName : catalog.keySet()) {
            System.out.println(shopName + "->");
            for (String product: catalog.get(shopName).keySet()) {
                System.out.printf("Product: %s, Price: %.1f%n",product,catalog.get(shopName).get(product));
            }
        }
    }
}
