import java.util.ArrayList;

/**
 * Created by fa1th on 19.07.2016.
 */
public class Table {
    ArrayList<Player> players = new ArrayList<>();
    Deck deck = new Deck();
    ArrayList<Card> tableCards = new ArrayList<>();
    Table(){
        players.add(new MoneyMaker());
        players.add(new AI());
        deck.shuffle();
    }
}
