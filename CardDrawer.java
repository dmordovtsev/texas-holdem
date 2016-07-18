import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.IOException;


public class CardDrawer {

	//public enum Suit {HEART, DIAMOND, SPADE, CLUB}; 
	//public enum Value {TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,J,D,K,T};
	
	public final int CARD_WIDTH = 63;
	public final int CARD_HEIGHT = 88;
	private final int CARD_ROUND = 7;
	private final int FONT_SIZE = 40;
	private final int DELTA = (int) (FONT_SIZE / 2.5);
	
	private final String[] valueSymbols = {"1","2","3","4","5","6","7","8","9","10","J","Q","K","A"};
	private final char[] suitSymbols = {'♣', '♦', '♠', '♥'};
	
	Graphics graphics;
	
	public CardDrawer(Graphics g)
	{
		this.graphics = g;
	}
	
	public void DrawCard(int x, int y, Card card, Graphics g)
	{
		Font fontBuffer = g.getFont();
		//drawing card fill
		g.setColor(Color.white);
		g.fillRoundRect(x, y, CARD_WIDTH, CARD_HEIGHT, CARD_ROUND, CARD_ROUND);
		//drawing card outline
		g.setColor(Color.black);
		g.drawRoundRect(x, y, CARD_WIDTH, CARD_HEIGHT, CARD_ROUND, CARD_ROUND);
		//drawing card suit and value
		if(card.suit.ordinal() % 2 == 0) g.setColor(Color.black); else g.setColor(Color.red);
		g.drawString(valueSymbols[card.value.ordinal()], x+5, y+15);
		g.drawString(valueSymbols[card.value.ordinal()], x+CARD_WIDTH-12, y+CARD_HEIGHT-5);
		Font font = new Font(g.getFont().getFontName(), g.getFont().getStyle(), FONT_SIZE);
		g.setFont(font);
		g.drawString(String.valueOf(suitSymbols[card.suit.ordinal()]),x + CARD_WIDTH / 2 - DELTA, y  + CARD_HEIGHT / 2 + DELTA);

		//putting font back
		g.setFont(fontBuffer);
		
	}
	
	public static void main(String[] args) throws IOException {
		TexturedPanel tp = new TexturedPanel(true, "/src/images/texture.jpg", 800, 600);
		CardPanel panel2 = new CardPanel();
		tp.panel.add(panel2);
	}
	
}
