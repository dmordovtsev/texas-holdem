/**
 * Created by Obsidian-destroyer on 7/20/2016.
 */
import java.util.ArrayList;

public class CardSet {


    private ArrayList<Card> cards = new ArrayList<>();


    public void addaCard(Card card1){
        this.cards.add(card1);
    }

    public ArrayList<Card> geet(){
        return cards;
    }


    int cardSetPower = 0;

    public int getsize(){
        return cards.size();
    }

    public static CardSet merge(CardSet Cardset1, CardSet Cardset2){
        CardSet CardSet3 = new CardSet ();
        for(int i=0;i<Cardset1.getsize();i++)
        {

            CardSet3.addaCard(Cardset1.getcard(i));
        }
        for(int i=0;i<Cardset2.getsize();i++)
        {
            CardSet3.addaCard(Cardset2.getcard(i));
        }
        return CardSet3;
    }

    /*public static ArrayList<CardSet> merge(CardSet Cardset1, CardSet Cardset2){
        for(int i=0;i<Cardset1.getcard(i);i++)
        {
            if(CardSet1.get(0).getCard(i)!=null)
            {

            }
        }

        return CardSet3;
    }*/

    public int Power(CardSet combimation){
        int power=0;


        return power;
    }

    public Card getcard(int i){
        return cards.get(i);
    }

    public void setCardSetPower(int cardSetPower){
        this.cardSetPower = cardSetPower;
    }

    public int checkpair(CardSet Hand)
    {
        int strength=0;
        //Yet a moronic hardcode....has to be changed. 7 cards, starts from 0.
        if(Hand.getcard(0).value==Hand.getcard(1).value)
        {
            strength=Hand.getcard(0).value.ordinal();
        }
        if(Hand.getcard(0).value==Hand.getcard(2).value)
        {
            strength=Hand.getcard(0).value.ordinal();
        }
        if(Hand.getcard(0).value==Hand.getcard(3).value)
        {
            strength=Hand.getcard(0).value.ordinal();
        }
        if(Hand.getcard(0).value==Hand.getcard(4).value)
        {
            strength=Hand.getcard(0).value.ordinal();
        }
        if(Hand.getcard(0).value==Hand.getcard(5).value)
        {
            strength=Hand.getcard(0).value.ordinal();
        }
        if(Hand.getcard(0).value==Hand.getcard(6).value)
        {
            strength=Hand.getcard(0).value.ordinal();
        }
        if(Hand.getcard(1).value==Hand.getcard(2).value)
        {
            strength=Hand.getcard(1).value.ordinal();
        }
        if(Hand.getcard(1).value==Hand.getcard(3).value)
        {
            strength=Hand.getcard(1).value.ordinal();
        }
        if(Hand.getcard(1).value==Hand.getcard(4).value)
        {
            strength=Hand.getcard(1).value.ordinal();
        }
        if(Hand.getcard(1).value==Hand.getcard(5).value)
        {
            strength=Hand.getcard(1).value.ordinal();
        }
        if(Hand.getcard(1).value==Hand.getcard(6).value)
        {
            strength=Hand.getcard(1).value.ordinal();
        }
        if(Hand.getcard(2).value==Hand.getcard(3).value)
        {
            strength=Hand.getcard(2).value.ordinal();
        }
        if(Hand.getcard(2).value==Hand.getcard(4).value)
        {
            strength=Hand.getcard(2).value.ordinal();
        }
        if(Hand.getcard(2).value==Hand.getcard(5).value)
        {
            strength=Hand.getcard(2).value.ordinal();
        }
        if(Hand.getcard(2).value==Hand.getcard(6).value)
        {
            strength=Hand.getcard(2).value.ordinal();
        }
        if(Hand.getcard(3).value==Hand.getcard(4).value)
        {
            strength=Hand.getcard(3).value.ordinal();
        }
        if(Hand.getcard(3).value==Hand.getcard(5).value)
        {
            strength=Hand.getcard(3).value.ordinal();
        }
        if(Hand.getcard(3).value==Hand.getcard(6).value)
        {
            strength=Hand.getcard(3).value.ordinal();
        }
        if(Hand.getcard(4).value==Hand.getcard(5).value)
        {
            strength=Hand.getcard(4).value.ordinal();
        }
        if(Hand.getcard(4).value==Hand.getcard(6).value)
        {
            strength=Hand.getcard(4).value.ordinal();
        }
        if(Hand.getcard(5).value==Hand.getcard(6).value)
        {
            strength=Hand.getcard(5).value.ordinal();
        }

        return strength;
    }


}
