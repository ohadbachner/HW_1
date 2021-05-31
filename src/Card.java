public class Card {
    // int of the number of the card
    private int numberOfCard;
    // shape of the card have 4 options
    private Shape shapeOfCard;

    public Card(int numberOfCard, Shape shapeOfCard) {
        // Will get the number and the shape
        this.numberOfCard = numberOfCard;
        this.shapeOfCard = shapeOfCard;
    }

    public Card() {
    }


    public int getNumberOfCard() {
        return numberOfCard;
    }

    public Shape getShapeOfCard() {
        return shapeOfCard;
    }

    public void setNumberOfCard(int number_of_card) {
        this.numberOfCard = number_of_card;
    }

    public void setShapeOfCard(Shape shape_of_card) {
        this.shapeOfCard = shape_of_card;
    }

    public int compare(Card other) {
        // will compare between 2 cards and return diffrents values
        if (this.getNumberOfCard() < other.getNumberOfCard()) {
            return -1;
        } else if (this.getNumberOfCard() == other.getNumberOfCard()) {
            return 0;
        } else {
            return 1;
        }
    }

    public String toString() {
        // override the toString and will return the number and
        if (this.numberOfCard >= 2 && this.numberOfCard < 11) {
            return this.numberOfCard + " of " + this.shapeOfCard;
        }
        else {
            switch (this.numberOfCard) {
                case 1:
                    return "Ace of " + this.shapeOfCard;
                case 11:
                    return "jack of " + this.shapeOfCard;
                case 12:
                    return "Queen of " + this.shapeOfCard;
                case 13:
                    return "King of " + this.shapeOfCard;
            }
            // need to check if we can throw exception that not make us to return a anything

        }
        return "will not get here";
    }
}
