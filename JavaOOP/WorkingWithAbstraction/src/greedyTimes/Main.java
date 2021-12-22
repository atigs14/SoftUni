
package greedyTimes;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long input = Long.parseLong(scanner.nextLine());
        String[] storage = scanner.nextLine().split("\\s+");

        var bag = new LinkedHashMap<String, LinkedHashMap<String, Long>>();
        long gold = 0;
        long stone = 0;
        long money = 0;

        for (int i = 0; i < storage.length; i += 2) {
            String name = storage[i];
            long count = Long.parseLong(storage[i + 1]);

            String material = "";

            if (name.length() == 3) {
                material = "Cash";
            } else if (name.toLowerCase().endsWith("gem")) {
                material = "Gem";
            } else if (name.toLowerCase().equals("gold")) {
                material = "Gold";
            }

            if (material.equals("")) {
                continue;
            } else if (input < bag.values().stream().map(Map::values).flatMap(Collection::stream).mapToLong(e -> e).sum() + count) {
                continue;
            }

            switch (material) {
                case "Gem":
                    if (!bag.containsKey(material)) {
                        if (bag.containsKey("Gold")) {
                            if (count > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (bag.get(material).values().stream().mapToLong(e -> e).sum() + count > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
                case "Cash":
                    if (!bag.containsKey(material)) {
                        if (bag.containsKey("Gem")) {
                            if (count > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (bag.get(material).values().stream().mapToLong(e -> e).sum() + count > bag.get("Gem").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
            }

            if (!bag.containsKey(material)) {
                bag.put((material), new LinkedHashMap<String, Long>());
            }

            if (!bag.get(material).containsKey(name)) {
                bag.get(material).put(name, 0L);
            }


            bag.get(material).put(name, bag.get(material).get(name) + count);
            if (material.equals("Gold")) {
                gold += count;
            } else if (material.equals("Gem")) {
                stone += count;
            } else if (material.equals("Cash")) {
                money += count;
            }
        }

        for (var x : bag.entrySet()) {
            Long sumValues = x.getValue().values().stream().mapToLong(l -> l).sum();

            System.out.println(String.format("<%s> $%s", x.getKey(), sumValues));

            x.getValue().entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey())).forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));

        }
    }
}