package HW1;

public class Player {
    private String name;
    public Deck gameDeck;
    public Deck winingDeck;

    public Player(String name, Deck gameDeck, Deck winingDeck){
        this.name = name;
        this.gameDeck = new Deck(false);
        this.winingDeck = new Deck(false);
    }

    public Deck getGameDeck() {
        return gameDeck;
    }

    public Deck getWiningDeck() {
        return winingDeck;
    }

    public String getName() {
        return name;
    }

    public void setGameDeck(Deck gameDeck) {
        this.gameDeck = gameDeck;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWiningDeck(Deck winingDeck) {
        this.winingDeck = winingDeck;
    }

    public void addCardGameDeck(Card card){
        this.gameDeck.addCard(card);
    }

    public void addCardWiningDeck(Card card) {
        this.winingDeck.addCard(card);
    }

    public Card drawCard(){
        return this.gameDeck.removeTopCard();
    }

    public boolean outOfCards(){
        return this.gameDeck.isEmpty() && this.winingDeck.isEmpty();
    }

    public String toString(){
        return this.name;
    }
}
