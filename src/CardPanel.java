import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

@SuppressWarnings("serial")
class CardPanel extends JPanel {
	
	private CardDrawer cardDrawer;
	
	public CardPanel()
	{
		cardDrawer = new CardDrawer(super.getGraphics());
		super.setPreferredSize(new Dimension(500, 150));
		super.setBackground(new Color(0,0,0,64));
	}
	
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        cardDrawer.DrawCard(20+(cardDrawer.CARD_WIDTH+10)*0, 20, new Card(Deck.SUIT.CLOTHES, Deck.VALUE.FOUR),g);
        cardDrawer.DrawCard(20+(cardDrawer.CARD_WIDTH+10)*1, 20, new Card(Deck.SUIT.DIAMONDS, Deck.VALUE.ACE),g);
        cardDrawer.DrawCard(20+(cardDrawer.CARD_WIDTH+10)*2, 20, new Card(Deck.SUIT.HEARTS, Deck.VALUE.JACK),g);
        cardDrawer.DrawCard(20+(cardDrawer.CARD_WIDTH+10)*3, 20, new Card(Deck.SUIT.SPADES, Deck.VALUE.QUEEN),g);
        cardDrawer.DrawCard(20+(cardDrawer.CARD_WIDTH+10)*4, 20, new Card(Deck.SUIT.HEARTS, Deck.VALUE.SEVEN),g);
        cardDrawer.DrawCard(20+(cardDrawer.CARD_WIDTH+10)*5, 20, new Card(Deck.SUIT.DIAMONDS, Deck.VALUE.JACK),g);
    }
}
