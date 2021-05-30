package HW1;

import HW1.Main;

import java.util.ArrayList;


public class Deck extends Card {
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
                    this.cardDeck.set(i, new Card(j, shapes[shapeNumber]));
                    j++;
                    i++;
                }
                shapeNumber++;
            }
        }

            /*for (int j = 1; j<= 13; j++) {
                this.cardDeck.set(i, new Card(j , Shape.Spades));
                i ++;
                }
            for (int j = 1; j<= 13; j++) {
                this.cardDeck.set(i, new Card(j , Shape.Diamonds));
                i ++;
            }
            for (int j = 1; j<= 13; j++) {
                this.cardDeck.set(i, new Card(j , Shape.Clubs));
                i ++;
            }
            for (int j = 1; j<= 13; j++) {
                this.cardDeck.set(i, new Card(j , Shape.Hearts));
                i ++;
            }
        }*/

    }

    //public Deck(int j, Shape spades) { //why do we need this??
       // super(j, spades);
    //}

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

    public boolean isEmpty(){
        return cardDeck.isEmpty();
    }

    public void shuffle(){
        for (int i=0; i<50; i++){
            int rnd1 = Main.rnd.nextInt(51);
            int rnd2 = Main.rnd.nextInt(51);
            Card saveMe = this.cardDeck.get(rnd2);
            this.cardDeck.set(rnd2,this.cardDeck.get(rnd1));
            this.cardDeck.set(rnd1, saveMe);
        }
    }
}
