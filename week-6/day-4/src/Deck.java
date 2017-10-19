import java.util.ArrayList;
import java.util.List;

public class Deck {
    List<Card> deck;

    public Deck() {
        this.deck = new ArrayList<>();
    }

    public void generateDeck() {
        for (int i = 0; i < 52; i++) {
            this.deck.add(new Card("RED","CLUBS","TWO"));
        }
    }
}
