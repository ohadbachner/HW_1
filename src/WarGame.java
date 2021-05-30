public class WarGame {
    private Player player1;
    private Player player2;
    private Deck player1Deck;
    private Deck player2Deck;

    public WarGame(String player1, String player2) {
        this.player1 = new Player(player1);
        this.player2 = new Player(player2);
        this.player1Deck = new Deck(false);
        this.player2Deck = new Deck(false);
    }

    public Player getPlayer1() {
        return this.player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public Deck getPlayer1Deck() {
        return player1Deck;
    }

    public Deck getPlayer2Deck() {
        return player2Deck;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public void setPlayer1Deck(Deck player1Deck) {
        this.player1Deck = player1Deck;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public void setPlayer2Deck(Deck player2Deck) {
        this.player2Deck = player2Deck;
    }

    public void initializeGame() {
        Deck allCards = new Deck(true);
        allCards.shuffle();
        Player savePlayer;
        int startingOne = this.player1.getName().compareTo(this.player2.getName());
        if (startingOne > 0) {
            savePlayer = player1;
            this.player1 = player2;
            this.player2 = savePlayer;
        }
            for (int i = 0; i < allCards.cardDeck.size(); i += 2) {
                this.player1.addCardGameDeck(allCards.removeTopCard());
                this.player2.addCardGameDeck(allCards.removeTopCard());
            }

    }


    public String start() {
        System.out.println("Initializing the game...");
        int roundNumber = 1;
        boolean firstRound = true;
        initializeGame();
        boolean flag = true;
        //while (!player1.outOfCards() || !player2.outOfCards()) {
        while (true) {
            if(flag) {
                System.out.println("-------------------------Round number" +
                        " " + roundNumber + " -------------------------");
            }
            if (firstRound){
                    this.player1Deck.addCard(player1.drawCard());
                    this.player2Deck.addCard(player2.drawCard());
                firstRound = false;
            }

            if (player1.outOfCards()) {
                roundNumber = 0;
                flag = true;
                firstRound = true;
                return player2.getName();
            }
            if (player2.outOfCards()) {
                roundNumber = 0;
                flag = true;
                firstRound = true;
                return player1.getName();
            }

            if (player1.gameDeck.isEmpty()) {
                player1.winningDeck.shuffle();
                while (!player1.winningDeck.isEmpty()) {
                    this.player1.gameDeck.addCard(player1.winningDeck.removeTopCard());
                }
            }
            if (player2.gameDeck.isEmpty()) {
                player2.winningDeck.shuffle();
                while (!player2.winningDeck.isEmpty()) {
                    this.player2.gameDeck.addCard(player2.winningDeck.removeTopCard());
                }
            }


            this.player1Deck.addCard(player1.drawCard());
            System.out.println(player1 + " drew " + player1Deck.getCardDeck());
            this.player2Deck.addCard(player2.drawCard());
            System.out.println(player2 + " drew " + player2Deck.getCardDeck());
            int result = player1Deck.getCardDeck().compare(player2Deck.getCardDeck());
            if (result == 1) {
                for (int i = 0; i < player1Deck.cardDeck.size(); i++) {
                    this.player1.winningDeck.addCard(player1Deck.removeTopCard());
                    this.player1.winningDeck.addCard(player2Deck.removeTopCard());
                }
                System.out.println(player1 + " won");
            } else if (result == -1) {
                for (int i = 0; i < player1Deck.cardDeck.size(); i++) {
                    this.player2.winningDeck.addCard(player1Deck.removeTopCard());
                    this.player2.winningDeck.addCard(player2Deck.removeTopCard());
                }
                System.out.println(player2 + " won");
            }
            else {
                    flag = false;
                    System.out.println("Starting a war...");
                    for (int j = 0; j < 2; j++) {
                        if (player1.outOfCards()) {
                            return player2.getName();
                        }
                        if (player2.outOfCards()) {
                            return player1.getName();
                        }
                        if (player1.gameDeck.isEmpty()) {
                            player1.winningDeck.shuffle();
                            while (!player1.winningDeck.isEmpty()) {
                                this.player1.gameDeck.addCard(player1.winningDeck.removeTopCard());
                            }
                        }
                        if (player2.gameDeck.isEmpty()) {
                            player2.winningDeck.shuffle();
                            while (!player2.winningDeck.isEmpty()) {
                                this.player2.gameDeck.addCard(player2.winningDeck.removeTopCard());
                            }
                        }
                        this.player1Deck.addCard(player1.drawCard());
                        System.out.println(player1 + " drew a war card");
                        this.player2Deck.addCard(player2.drawCard());
                        System.out.println(player2 + " drew a war card");
                    }


                }
            if (result != 0){
                flag = true;
            roundNumber++;
        }
        }
    }
}

