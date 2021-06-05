import java.util.ArrayList;

/**
 * @Class Deck will extends Card class and will make a card deck
 * @author Ohad Bachner & shir Geisler
 */

public class Deck extends Card {
    /**
     * @param cardDeck will make arrey list of cards
     */
    // object arreylist
      public ArrayList<Card> cardDeck = new ArrayList<>();

    /**
     * Class constructor is Boolean if the deck is filled or on not and if not
                building a new deck
     * @param fillDeck getting true or false
     */
    public Deck(Boolean fillDeck){
        int i = 0;
        int j = 0;
        int shapeNumber = 0;
        Shape[] shapes = new Shape[]{Shape.Spades, Shape.Diamonds, Shape.Clubs,
                Shape.Hearts};
        if (fillDeck) {
            while (i < 52) {
                j = 1;
                while (j <= 13) {
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
        Card lastOne = this.cardDeck.get(length - 1);
        return lastOne;
    }

    /**
     *
     * @param CardDeck setting new card deck
     */
    public void setCardDeck(ArrayList<Card> CardDeck){
        this.cardDeck = CardDeck;
    }

    /**
     *
     * @param card adding card to the deck
     */
    public void addCard(Card card){
        this.cardDeck.add(card);
    }

    /**
     *
     * @return return the last cards in the deck and than remove it.
     */
    public Card removeTopCard(){
            int length = this.cardDeck.size();
            Card lastOne = this.cardDeck.get(length - 1);
            this.cardDeck.remove(length - 1);
            return lastOne;
    }

    /**
     * remove and save the first card in the bottom of the deck
     * @return the first card in the deck
     */
    public Card removeFirstCard(){
        Card firstOne = this.cardDeck.get(0);
        this.cardDeck.remove(0);
        return firstOne;
    }

    /**
     *
     * @return if the card deck is empty or not
     */
    public boolean isEmpty(){
        return cardDeck.isEmpty();
    }

    /**
     * <p>
     *     this method shuffling cards deck 50 times.
     * </p>
     * @see java.util.Random
     */
    public void shuffle(){
        for (int i=0; i<50; i++){
            int rnd1 = Main.rnd.nextInt(cardDeck.size());
            int rnd2 = Main.rnd.nextInt(cardDeck.size());
            Card saveMe = this.cardDeck.get(rnd2);
            this.cardDeck.set(rnd2,this.cardDeck.get(rnd1));
            this.cardDeck.set(rnd1, saveMe);
        }
    }
}
