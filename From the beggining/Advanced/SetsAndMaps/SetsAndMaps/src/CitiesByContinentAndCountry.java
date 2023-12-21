import java.util.*;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        /*
        Write a program to read continents, countries and their cities, put them in a nested map and print them in the order of first appearance
         */

        int inputLines = Integer.parseInt(console.nextLine());

        Map<String, Map<String, ArrayList<String>>> map = new LinkedHashMap<>();

        for (int i = 0; i < inputLines; i++) {
            String[] line = console.nextLine().split(" ");
            String continent = line[0];
            String country = line[1];
            String city = line[2];

            if (!map.containsKey(continent)){
                map.put(continent, new LinkedHashMap<>());
            }

            Map<String, ArrayList<String>> innerCountry = map.get(continent);

            if (!innerCountry.containsKey(country)){
                innerCountry.put(country, new ArrayList<>());
            }

            ArrayList<String> innerCity = innerCountry.get(country);
            innerCity.add(city);
        }

        for (String continent : map.keySet()) {
            System.out.println(continent + ":");

            for (String county : map.get(continent).keySet()) {
                System.out.printf("  %s -> ",county);
                System.out.println(String.join(", ",map.get(continent).get(county)));
            }
        }
    }
}
