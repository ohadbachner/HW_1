package HW1;

public class Player {
    private String name;
    public Deck gameDeck;
    public Deck winningDeck;

    public Player(String name, Deck gameDeck, Deck winningDeck){
        this.name = name;
        this.gameDeck = new Deck(false);
        this.winningDeck = new Deck(false);
    }

    public Deck getGameDeck() {
        return gameDeck;
    }

    public Deck getWiningDeck() {
        return winningDeck;
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

    public void setWiningDeck(Deck winningDeck) {
        this.winningDeck = winningDeck;
    }

    public void addCardGameDeck(Card card){
        this.gameDeck.addCard(card);
    }

    public void addCardWiningDeck(Card card) {
        this.winningDeck.addCard(card);
    }

    public Card drawCard(){
        return this.gameDeck.removeTopCard();
    }

    public boolean outOfCards(){
        return this.gameDeck.isEmpty() && this.winningDeck.isEmpty();
    }

    public String toString(){
        return this.name;
    }
}
