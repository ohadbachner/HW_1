import java.util.ArrayList;

public class Deck extends Card {
    private ArrayList<Card> CardDeck = new ArrayList<>(52);
    int i = 0;
    public Deck(Boolean make){
        if (make){
            while (i !=52){
                for (int j = 1; j<= 13; j++) {
                    this.CardDeck[i] = super(j, Shape.Spades);
                }
                i += 13;


            //for (int i=0; i< 4; i++ ){
                //for (int j = 1; j<= 13; j++){
                    //this.CardDeck[j] = super(j,Shape.Spades);
                }
            }

        }

    }



}
