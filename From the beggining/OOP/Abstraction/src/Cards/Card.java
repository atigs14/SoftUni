package Cards;

public class Card {

    private final String rank;
    private final String suit;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    private int calculatePower() {
        int value1 = CardRank.valueOf(rank).getValue();
        int value2 = CardSuits.valueOf(suit).getValue();
        return value1 + value2;
    }

    private String getName(){
        return rank + " of " + suit;
    }


    @Override
    public String toString() {
        return String.format("Card name: %s; Card power: %d",getName(), calculatePower());
    }
}
