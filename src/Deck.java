import java.util.ArrayList;


public class Deck extends Card {
    // object arreylist
      public ArrayList<Card> cardDeck = new ArrayList<>();

    public Deck(Boolean fillDeck){
        int i = 0;
        int j = 0;
        int shapeNumber = 0;
        Shape[] shapes = new Shape[]{Shape.Spades, Shape.Diamonds, Shape.Clubs, Shape.Hearts};
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

    public Card getCardDeck() {
        int length = this.cardDeck.size();
        Card lastOne = this.cardDeck.get(length - 1);
        return lastOne;
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

    public Card removeFirstCard(){
        Card firstOne = this.cardDeck.get(0);
        this.cardDeck.remove(0);
        return firstOne;
    }

    public boolean isEmpty(){
        return cardDeck.isEmpty();
    }

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
