
public class Card {
	
	public Enum SUIT;
	public Enum VALUE;
	
	public Card(Enum SUIT, Enum VALUE)
	{
		this.SUIT = SUIT;
		this.VALUE = VALUE;
		System.out.println("SUIT: " + SUIT + " VALUE: " + VALUE);
	}
	
	public Card() { }
	
}
