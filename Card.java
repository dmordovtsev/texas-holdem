


public class Card {
    public enum Suit {HEARTS, DIAMONDS, CLOTHES, SPADES};
    public enum Value {ZERO,ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JACK,QUEEN,KING,ACE};

    public Suit suit;
    public Value value;

    public Card( Value value, Suit suit)
    {
        this.suit = suit;
        this.value = value;
    }
    public Card(){

    }
}