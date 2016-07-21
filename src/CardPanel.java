import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.io.IOException;

import javax.swing.JPanel;

@SuppressWarnings("serial")
class CardPanel extends JPanel {
	
	private CardDrawer cardDrawer;
	public CardSet cardSet;
	
	public CardPanel(CardSet cardSet)
	{
		this.cardSet = cardSet;
		cardDrawer = new CardDrawer(super.getGraphics());
		super.setPreferredSize(new Dimension(500, 150));
		super.setBackground(new Color(0,0,0,64));
	}

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Deck deck = new Deck();
        deck.shuffle();
        try {
			cardDrawer.DrawCardDeck(deck, 20, 20, g);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        for (int i = 0; i < cardSet.getCards().size(); i++) {
            cardDrawer.DrawCard(30+(20+cardDrawer.CARD_WIDTH+10)*(i+1), 20, cardSet.getCards().get(i), g);
        }
        /*try {
			cardDrawer.DrawCardShirt(true, "/images/shirt.png", 10+(20+cardDrawer.CARD_WIDTH+10)*0, 20, g);
			cardDrawer.DrawCardShirt(true, "/images/shirt.png", 10+(20+cardDrawer.CARD_WIDTH+10)*1, 20, g);
			cardDrawer.DrawCardShirt(true, "/images/shirt.png", 10+(20+cardDrawer.CARD_WIDTH+10)*2, 20, g);
			cardDrawer.DrawCard( 10+(20+cardDrawer.CARD_WIDTH+10)*3, 20, new Card(Deck.SUIT.SPADES,  Deck.VALUE.ACE), g);
			cardDrawer.DrawCard( 10+(20+cardDrawer.CARD_WIDTH+10)*4, 20, new Card(Deck.SUIT.HEARTS,  Deck.VALUE.NINE), g);
		} catch (IOException e) {
			e.printStackTrace();
		}*/
    }
}
