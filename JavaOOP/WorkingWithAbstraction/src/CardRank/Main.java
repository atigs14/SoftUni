package CardRank;

public class Main {
    public static void main(String[] args) {
        System.out.println("Card Ranks:");
        for (var rank : Ranks.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", rank.ordinal(), rank.name());
        }
    }
}
