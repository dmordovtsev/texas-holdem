import java.awt.GridLayout;
import java.io.IOException;
 
import javax.swing.JFrame;
import javax.swing.JPanel;
 
 
public class TexasHoldemUserInterface {
	public JFrame window;
	public JPanel panel;
	private TexturedPanel texturedPanel;
	public CardPanel playerPanel;
	public CardPanel aiPanel;
	public CardPanel tablePanel;
	
	public TexasHoldemUserInterface() throws IOException
	{
		window = new JFrame();
		window.setLayout(new GridLayout(1,3));
		texturedPanel = new TexturedPanel(true, "/images/texture.jpg", 300, 450);
		panel = texturedPanel.panel;
		window.setSize(600, 450);
		window.add(panel);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		////////////////////
		CardSet cardSet = new CardSet();
		playerPanel = new CardPanel(cardSet);
		panel.add(playerPanel);
		//
		
		
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		TexasHoldemUserInterface ui = new TexasHoldemUserInterface();
		Deck deck = new Deck();
		deck.shuffle();
		Thread.sleep(1000);
		ui.playerPanel.cardSet.addACard(new Card(Deck.SUIT.DIAMONDS, Deck.VALUE.KING));
		ui.window.repaint();
		Thread.sleep(1000);
		ui.playerPanel.cardSet.addACard(new Card(Deck.SUIT.HEARTS, Deck.VALUE.FOUR));
		ui.window.repaint();
		Thread.sleep(1000);
		ui.playerPanel.cardSet.addACard(new Card(Deck.SUIT.SPADES, Deck.VALUE.ACE));
		ui.window.repaint();
		
	}
}