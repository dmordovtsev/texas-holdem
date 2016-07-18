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
        cardDrawer.DrawCard(20+(cardDrawer.CARD_WIDTH+10)*0, 20, new Card(Card.Suit.CLUB, Card.Value.FOUR),g);
        cardDrawer.DrawCard(20+(cardDrawer.CARD_WIDTH+10)*1, 20, new Card(Card.Suit.DIAMOND, Card.Value.ACE),g);
        cardDrawer.DrawCard(20+(cardDrawer.CARD_WIDTH+10)*2, 20, new Card(Card.Suit.HEART, Card.Value.JACK),g);
        cardDrawer.DrawCard(20+(cardDrawer.CARD_WIDTH+10)*3, 20, new Card(Card.Suit.SPADE, Card.Value.QUEEN),g);
        cardDrawer.DrawCard(20+(cardDrawer.CARD_WIDTH+10)*4, 20, new Card(Card.Suit.HEART, Card.Value.SEVEN),g);
        cardDrawer.DrawCard(20+(cardDrawer.CARD_WIDTH+10)*5, 20, new Card(Card.Suit.DIAMOND, Card.Value.JACK),g);
    }
}
