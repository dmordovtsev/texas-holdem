import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class CardDrawer {

	public final int CARD_WIDTH = 63;
	public final int CARD_HEIGHT = 88;
	private final int CARD_ROUND = 7;
	private final int FONT_SIZE = 40;
	private final int DELTA = (int) (FONT_SIZE / 2.5);
	
	private final String[] valueSymbols = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
	private final char[] suitSymbols = {'♣', '♦', '♠', '♥'};
	
	Graphics graphics;
	
	public CardDrawer(Graphics g)
	{
		this.graphics = g;
	}
	
	public void DrawCardDeck(Deck deck, int x, int y, Graphics g) throws IOException
	{
		int dx = 0;
		int dy = 0;
		for(int i=0; i<deck.getCardCount(); i=i+6){
			DrawCardShirt(true, "/images/shirt.png", x+dx, y-dy, g);
			dx+=1;
			if( i % 18 == 0) dy+=1;
		}
	}
	
	public void DrawCardShirt(boolean relativePath, String imagePath, int x, int y, Graphics g) throws IOException
	{
		String path = "";
		if(relativePath)
		{
			path = new File(".").getCanonicalPath();
		}
		Image cardShirt = ImageIO.read(new File(path + imagePath));
		g.drawImage(cardShirt, x, y, CARD_WIDTH, CARD_HEIGHT, null);
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
		if(card.SUIT.ordinal() % 2 == 0){
            g.setColor(Color.black);
        } else {
            g.setColor(Color.red);
        }
        System.out.println("card.value.ordinal: " + card.VALUE.ordinal());
        System.out.println("x: " + x + " y: " + y);
        g.drawString(valueSymbols[card.VALUE.ordinal()], x+5, y+15);
		g.drawString(valueSymbols[card.VALUE.ordinal()], x+CARD_WIDTH-12, y+CARD_HEIGHT-5);
		Font font = new Font(g.getFont().getFontName(), g.getFont().getStyle(), FONT_SIZE);
		g.setFont(font);
		g.drawString(String.valueOf(suitSymbols[card.SUIT.ordinal()]),x + CARD_WIDTH / 2 - DELTA, y  + CARD_HEIGHT / 2 + DELTA);
		//putting font back
		g.setFont(fontBuffer);
	}
}
