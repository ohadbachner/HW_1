/**
 * this is the card Class
 * <p>
 * In this class we will make all the cards to go into a the deck
 * </p>
 *
 * @author Ohad Bachner & shir Geisler
 */
public class Card {
    // int of the number of the card
    private int numberOfCard;
    // shape of the card have 4 options
    private Shape shapeOfCard;

    /**
     * Class constructor is getting the number and the shape into the class
     * @param numberOfCard the value of the card
     * @param shapeOfCard will get the shape for the enum Shape
     */
    public Card(int numberOfCard, Shape shapeOfCard) {
        // Will get the number and the shape
        this.numberOfCard = numberOfCard;
        this.shapeOfCard = shapeOfCard;
    }

    /**
     * default Class constructor help to solve problem in @Deck class
     constructor
     */
    public Card() {
    }

    /**
     *
     * @return numberOfCard
     */
    public int getNumberOfCard() {
        return numberOfCard;
    }

    /**
     *
     * @return shapeOfCard
     */
    public Shape getShapeOfCard() {
        return shapeOfCard;
    }

    /**
     *
     * @param number_of_card set the value of the card
     */
    public void setNumberOfCard(int number_of_card) {
        this.numberOfCard = number_of_card;
    }

    /**
     *
     * @param shape_of_card set the shape of the card
     */
    public void setShapeOfCard(Shape shape_of_card) {
        this.shapeOfCard = shape_of_card;
    }

    /**
     * this method will get other Card and will compare who is bigger
     * @param other Card for compering
     * @return -1 if the other card higher than this card, @ 0 if they are the
    same and will return 1 if this card higher than the other card
     */
    public int compare(Card other) {
        // will compare between 2 cards and return different values
        return Integer.compare(this.getNumberOfCard(), other.getNumberOfCard());
    }

    /**
     * @return each card with is symbol and his number and shape
     */
    public String toString() {
        // override the toString and will return the number and
        if (this.numberOfCard >= 2 && this.numberOfCard < 11) {
            return this.numberOfCard + " of " + this.shapeOfCard;
        } else {
            switch (this.numberOfCard) {
                case 1:
                    return "Ace of " + this.shapeOfCard;
                case 11:
                    return "Jack of " + this.shapeOfCard;
                case 12:
                    return "Queen of " + this.shapeOfCard;
                case 13:
                    return "King of " + this.shapeOfCard;
            }
        }
        return "will not get here";
    }
}
