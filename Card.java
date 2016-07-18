
public class Card {
	public enum Suit {CLUB, DIAMOND, SPADE, HEART}; 
	public enum Value {ONE, TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JACK,QUEEN,KING,ACE};
	
	public Suit suit;
	public Value value;
	
	public Card(Suit suit, Value value)
	{
		this.suit = suit;
		this.value = value;
	}
	
	public Card() { }
	
}
