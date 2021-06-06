public enum Shape {
    /***
     * enum has 4 kind of objects with a symbol
     */
    Spades("♠"),
    Diamonds("♦"),
    Clubs("♣"),
    Hearts("♥");

    private final String value;

    /**
     * @param value value of the card
     */
    Shape(String value) {
        this.value = value;
    }

    /**
     * @return  value of the card
     */
    public String toString() {
        return this.value;
    }
}
