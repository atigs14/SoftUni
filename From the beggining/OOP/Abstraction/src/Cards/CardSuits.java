package Cards;

public enum CardSuits {
    CLUBS(0),
    DIAMONDS(13),
    HEARTHS(26),
    SPADES(39);

    private final int value;
    CardSuits(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
