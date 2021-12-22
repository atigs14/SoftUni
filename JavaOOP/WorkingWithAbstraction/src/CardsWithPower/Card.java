package CardsWithPower;

public class Card {
    private CardSuits cardSuits;
    private RankPowers rankPowers;

    public Card(CardSuits cardSuits, RankPowers rankPowers) {
        this.cardSuits = cardSuits;
        this.rankPowers = rankPowers;
    }

    public  int getPower(){
        return cardSuits.getSuitPower() + rankPowers.getRankPower();
    }
}
