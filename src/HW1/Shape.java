package HW1;

public enum Shape {
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
