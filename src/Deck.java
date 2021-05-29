import java.util.ArrayList;


public class Deck extends Card {
     private ArrayList<Card> cardDeck = new ArrayList<>();

    public Deck(Boolean make){
        int i = 0;
        if (make){
            for (int j = 1; j<= 13; j++) {
                this.cardDeck.set(i, new Card(j , Shape.Clubs));
                i ++;
                }
            for (int j = 1; j<= 13; j++) {
                this.cardDeck.set(i, new Card(j , Shape.Diamonds));
                i ++;
            }
            for (int j = 1; j<= 13; j++) {
                this.cardDeck.set(i, new Card(j , Shape.Spades));
                i ++;
            }
            for (int j = 1; j<= 13; j++) {
                this.cardDeck.set(i, new Card(j , Shape.Hearts));
                i ++;
            }
        }

    }

    public ArrayList<Card> getCardDeck() {
        return cardDeck;
    }

    public void setCardDeck(ArrayList<Card> CardDeck){
        this.cardDeck = CardDeck;
    }

    public void addCard(Card card){
        this.cardDeck.add(card);
    }

    public Card removeTopCard(){
        int length = this.cardDeck.size();
        Card lastOne = this.cardDeck.get(length - 1);
        this.cardDeck.remove(length - 1);
        return lastOne;
    }

    public boolean isEmpty(){
        return cardDeck.isEmpty();
    }

    public void shuffle(){
        for (int i=0; i<50; i++){
            int rnd1 =
        }
    }
}
