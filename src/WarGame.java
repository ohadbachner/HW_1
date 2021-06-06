
/**
 * initializing and starting the war game
 * @author Ohad Bachner & Shir Geisler
 */
public class WarGame {
    static final int PLAYER1_WON = 1;
    static final int PLAYER2_WON = -1;


    private Player player1;
    private Player player2;
    private Deck player1Deck;
    private Deck player2Deck;

    /**
     * Class constructor
     *
     * @param player1 name of player1
     * @param player2 name of player2
     */
    public WarGame(String player1, String player2) {

        this.player1 = new Player(player1);
        this.player2 = new Player(player2);
        this.player1Deck = new Deck(false);
        this.player2Deck = new Deck(false);
    }

    /**
     * @return player1
     */
    public Player getPlayer1() {
        return this.player1;
    }

    /**
     * @return player2
     */
    public Player getPlayer2() {

        return player2;
    }

    /**
     * @return player1 deck
     */
    public Deck getPlayer1Deck() {

        return player1Deck;
    }

    /**
     * @return player2 deck
     */
    public Deck getPlayer2Deck() {
        return player2Deck;
    }

    /**
     * @param player1 will set the player1
     */
    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    /**
     * @param player1Deck will set the player1Deck
     */
    public void setPlayer1Deck(Deck player1Deck) {

        this.player1Deck = player1Deck;
    }

    /**
     * @param player2 will set the player2
     */
    public void setPlayer2(Player player2) {

        this.player2 = player2;
    }

    /**
     * @param player2Deck will set the player2Deck deck
     */
    public void setPlayer2Deck(Deck player2Deck) {

        this.player2Deck = player2Deck;
    }

    /**
     * splits all cards into two equal decks
     */
    public void initializeGame() {
        Deck allCards = new Deck(true);
        allCards.shuffle();
        Player savePlayer;
        int startingOne = this.player1.getName().
                compareTo(this.player2.getName());
        if (startingOne > 0) {
            savePlayer = this.player1;
            this.player1 = this.player2;
            this.player2 = savePlayer;
        }
        while (!allCards.isEmpty()) {
            this.player1.addCardGameDeck(allCards.removeTopCard());
            this.player2.addCardGameDeck(allCards.removeTopCard());
        }
    }

    /**
     * checks if gameDeck is empty. if it is, moves all cards in the winning
     * deck to the game deck
     */
    private void checkIfEmpty() {

        if (this.player1.gameDeck.isEmpty()) {
            this.player1.winningDeck.shuffle();
            while (!this.player1.winningDeck.isEmpty()) {
                this.player1.gameDeck.addCard(this.player1.winningDeck.
                        removeFirstCard());
            }
        }
        if (this.player2.gameDeck.isEmpty()) {
            this.player2.winningDeck.shuffle();
            while (!this.player2.winningDeck.isEmpty()) {
                this.player2.gameDeck.addCard(player2.winningDeck.
                        removeFirstCard());
            }
        }
        this.player1Deck.addCard(this.player1.drawCard());
    }

    /**
     * starring the war game
     */
    public String start() {
        System.out.println("Initializing the game...");
        int roundNumber = 1;
        initializeGame();
        boolean flag = true;
        while (true) {
            if (this.player1.outOfCards()) {
                return this.player2.getName();
            }
            if (this.player2.outOfCards()) {
                return this.player1.getName();
            }

            if (flag) {

                System.out.println("------------------------- Round number" +
                        " " + roundNumber + " -------------------------");
            }
            if (this.player1.gameDeck.isEmpty()) {
                this.player1.winningDeck.shuffle();
                while (!this.player1.winningDeck.isEmpty()) {
                    this.player1.gameDeck.addCard(this.player1.winningDeck.
                            removeFirstCard());
                }
            }
            checkIfEmpty();
            System.out.println(this.player1 + " drew " + this.player1Deck.
                    getCardDeck());
            this.player2Deck.addCard(this.player2.drawCard());
            System.out.println(this.player2 + " drew " + this.player2Deck.
                    getCardDeck());
            int result = this.player1Deck.getCardDeck().compare(this.
                    player2Deck.getCardDeck());
            if (result == PLAYER1_WON) {

                while (!this.player1Deck.isEmpty() && !this.player2Deck.
                        isEmpty()) {
                    this.player1.winningDeck.addCard(this.player2Deck.
                            removeTopCard());
                    this.player1.winningDeck.addCard(this.player1Deck.
                            removeTopCard());
                }
                if (!flag) {
                    System.out.println(this.player1 + " won the war");
                } else {
                    System.out.println(this.player1 + " won");
                }
            } else if (result == PLAYER2_WON) {
                while (!this.player1Deck.isEmpty() && !this.
                        player2Deck.isEmpty()) {
                    this.player2.winningDeck.addCard(this.
                            player2Deck.removeTopCard());
                    this.player2.winningDeck.addCard(this.
                            player1Deck.removeTopCard());
                }
                if (!flag) {
                    System.out.println(this.player2 + " won the war");
                } else {
                    System.out.println(this.player2 + " won");
                }

            } else { //Tie-starting a war
                flag = false;
                System.out.println("Starting a war...");
                for (int j = 0; j < 2; j++) {
                    if (this.player1.outOfCards()) {
                        return this.player2.getName();
                    }
                    if (this.player2.outOfCards()) {
                        return this.player1.getName();
                    }
                    checkIfEmpty();
                    System.out.println(this.player1 + " drew a war card");
                    this.player2Deck.addCard(this.player2.drawCard());
                    System.out.println(this.player2 + " drew a war card");
                }
            }
            if (result != 0 && !(this.player1.outOfCards() ||
                    this.player2.outOfCards())) {
                flag = true;
                roundNumber++;
            }
        }
    }
}







