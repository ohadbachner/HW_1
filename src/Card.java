public class Card {
    // int of the number of the card
     private int number_of_card;
     // shape of the card have 4 options
     private Shape shape_of_card;

    public Card(int j, Shape spades){
        // Will get the number and the shape
        this.number_of_card = number_of_card;
        this.shape_of_card = shape_of_card;
    }

    public int getNumberOfCard (){
        return number_of_card;
    }

    public Shape getShapeOfCard() {
        return shape_of_card;
    }

    public void setNumberOfCard(int number_of_card){
        this.number_of_card = number_of_card;
    }

    public void setShapeOfCard(Shape shape_of_card) {
        this.shape_of_card = shape_of_card;
    }

    public int compare(Card other){
        // will compare between 2 cards and return diffrent values
        if (this.number_of_card < other.number_of_card) {
            return -1;
        }
        else if (this.number_of_card == other.number_of_card){
            return 0;
            }
        else{
            return 1;
        }
    }

    public String toString(){
        // override the toString and will return the number and
        if (this.number_of_card >= 2 && this.number_of_card < 11){
            return this.number_of_card + " of " + this.shape_of_card;
        }
        else{
            switch(this.number_of_card){
                case 1:
                    return "Ace of " + this.shape_of_card;
                case 11:
                    return "Prince of " + this.shape_of_card;
                case 12:
                    return "Queen of " + this.shape_of_card;
                case 13:
                    return "King of " + this.shape_of_card;
            }
            // need to check if we can throw exception that not make us to return a anything
        return "0";
        }

    }
}
