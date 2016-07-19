import java.util.*;

public class DeckTest {

    public static boolean uniquenessTest() {
        Deck d = new Deck();
        d.shuffle();
        ArrayList <Card> lst = new ArrayList<>();
        Card c = new Card();
        for (int i = 0; i < 52; i++){
            c = d.getNext();
            if (c != null){
                for (int j = 0; j < lst.size(); j++){
                    if ((lst.get(j).suit==c.suit) && (lst.get(j).value==c.value)) return false;
                }
                lst.add(c);
            } else return false;
        }
        return true;
    }
    public static boolean randomnessTest(){
        ArrayList <Card> lst1 = new ArrayList<>();
        ArrayList <Card> lst2 = new ArrayList<>();
        Deck d = new Deck();
        int equalities = 0;
        d.shuffle();
        for (int i = 0; i < 52; i++){
            lst1.add(d.getNext());
        }
        d.shuffle();
        for (int i = 0; i < 52; i++){
            lst2.add(d.getNext());
        }
        for (int i = 0; i < 52; i++){
            if ((lst1.get(i).value==lst2.get(i).value) && (lst1.get(i).suit==lst2.get(i).suit)){
                equalities++;
            }

        }
        if (equalities < 52) return true;
        else return false;
    }
}
