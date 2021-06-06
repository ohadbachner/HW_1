import java.util.ArrayList;

/**
 * Class Deck will extend Card class and will make a card deck
 *
 * @author Ohad Bachner & Shir Geisler
 */

public class Deck extends Card {

    static final int FIRST_CARD = 0;
    static final int RANDOM_INDEX = 50;
    static final int NUMBER_OF_CARDS = 52;
    static final int NUMBER_OF_EACH_VALUE = 13;
    /**
     * cardDeck will make an arrayList of cards
     */
    // object arrayList
    public ArrayList<Card> cardDeck = new ArrayList<>();

    /**
     * Class constructor is Boolean if the deck is filled or on not and if
     * not
     * building a new deck
     *
     * @param fillDeck getting true or false
     */
    public Deck(Boolean fillDeck) {
        int i = 0;
        int j;
        int shapeNumber = 0;
        Shape[] shapes = new Shape[]{Shape.Spades, Shape.Diamonds, Shape.Clubs,
                Shape.Hearts};
        if (fillDeck) {
            while (i < NUMBER_OF_CARDS) {
                j = 1;
                while (j <= NUMBER_OF_EACH_VALUE) {
                    this.cardDeck.add(i, new Card(j, shapes[shapeNumber]));
                    j++;
                    i++;
                }
                shapeNumber++;
            }
        }

    }

    /**
     * @return the last card in the deck
     */
    public Card getCardDeck() {
        int length = this.cardDeck.size();
        return this.cardDeck.get(length - 1);
    }

    /**
     * @param card adding a card to the deck
     */
    public void addCard(Card card) {
        this.cardDeck.add(card);
    }

    /**
     * @return return the last cards in the deck and than remove it.
     */
    public Card removeTopCard() {
        int length = this.cardDeck.size();
        Card lastOne = this.cardDeck.get(length - 1);
        this.cardDeck.remove(length - 1);
        return lastOne;
    }

    /**
     * remove and save the first card in the bottom of the deck
     *
     * @return the first card in the deck
     */
    public Card removeFirstCard() {
        Card firstOne = this.cardDeck.get(FIRST_CARD);
        this.cardDeck.remove(FIRST_CARD);
        return firstOne;
    }

    /**
     * @return if the card deck is empty or not
     */
    public boolean isEmpty() {
        return cardDeck.isEmpty();
    }

    /**
     * <p>
     * this method shuffling cards deck 50 times.
     * </p>
     *
     * @see java.util.Random
     */
    public void shuffle() {
        for (int i = 0; i < RANDOM_INDEX; i++) {
            int rnd1 = Main.rnd.nextInt(cardDeck.size());
            int rnd2 = Main.rnd.nextInt(cardDeck.size());
            Card saveMe = this.cardDeck.get(rnd2);
            this.cardDeck.set(rnd2, this.cardDeck.get(rnd1));
            this.cardDeck.set(rnd1, saveMe);
        }
    }
}
