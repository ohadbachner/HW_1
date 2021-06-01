public enum Shape {
    /***
     * enum have 4 kind of onject with a symbol
     */
    Spades("♠"),
    Diamonds("♦"),
    Clubs("♣"),
    Hearts("♥");

    private String value;

    private Shape(String value)
    {
        this.value = value;
    }

    public String toString()
    {
        return this.value; //This will return , # or +
    }



}
