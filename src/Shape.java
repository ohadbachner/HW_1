public enum Shape {
    Clubs("♠"),
    Diamonds("♦"),
    Spades("♣"),
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
