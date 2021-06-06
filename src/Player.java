/**
 * player class is using 3 variables 1 String and 2 Decks
 * <p>
 * this class will create a new Player and 2 cards of decks.
 * </p>
 *
 * @author Ohad Bachner & shir Geisler
 */


public class Player {
    private String name;
    public Deck gameDeck;
    public Deck winningDeck;

    /**
     * Class constructor will get the name and opened 2 new decks
     *
     * @param name will get String name of the player
     */
    public Player(String name) {
        this.name = name;
        this.gameDeck = new Deck(false);
        this.winningDeck = new Deck(false);
    }

    /**
     * @return gameDeck
     */
    public Deck getGameDeck() {
        return gameDeck;
    }

    /**
     * @return winningDeck
     */
    public Deck getWiningDeck() {
        return winningDeck;
    }

    /**
     * @return name of the player
     */
    public String getName() {
        return name;
    }

    /**
     * @param gameDeck will set the gameDeck
     */
    public void setGameDeck(Deck gameDeck) {
        this.gameDeck = gameDeck;
    }

    /**
     * @param name will set a new name for the player
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param winningDeck will set a new winning deck
     */
    public void setWiningDeck(Deck winningDeck) {
        this.winningDeck = winningDeck;
    }

    /**
     * @param card will add card to the game deck
     */
    public void addCardGameDeck(Card card) {
        this.gameDeck.addCard(card);
    }

    /**
     * @return the card in the last index in the game deck
     */
    public Card drawCard() {
        return this.gameDeck.removeTopCard();
    }

    /**
     * @return True if both of the decks are empty else will return false
     */
    public boolean outOfCards() {
        return this.gameDeck.isEmpty() && this.winningDeck.isEmpty();
    }

    /**
     * @return name of the player
     */
    public String toString() {
        return this.name;
    }
}
