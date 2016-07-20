/**
 * Created by Obsidian-destroyer on 7/17/2016.
 */

import java.util.ArrayList;
import java.util.*;



public class Main {

    enum suit {HEARTS, DIAMONDS, CLOTHES, PICKS};
    enum value {TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JACK,QUEEN,KING,ACE};


    //1(h)-hearts, 2(d)-diamonds, 3(c)-clothes, 4 (p)-picks


    public static void main(String[] args) {

        Deck deck1 = new Deck();
        deck1.shuffle();

        ArrayList<CardSet> player = new ArrayList<>();
        player.add(new CardSet());
        player.get(0).addaCard(deck1.getNext());
        player.get(0).addaCard(deck1.getNext());
        player.get(0).geet();

        ArrayList<CardSet> computer = new ArrayList<>();
        computer.add(new CardSet());
        computer.get(0).addaCard(deck1.getNext());
        computer.get(0).addaCard(deck1.getNext());
        computer.get(0).geet();

        ArrayList<CardSet> table = new ArrayList<>();
        table.add(new CardSet());
        table.get(0).addaCard(deck1.getNext());
        table.get(0).addaCard(deck1.getNext());
        table.get(0).addaCard(deck1.getNext());
        table.get(0).addaCard(deck1.getNext());
        table.get(0).addaCard(deck1.getNext());
        table.get(0).geet();

        CardSet combination = new CardSet();
        combination = CardSet.merge(player.get(0),table.get(0));
        combination = CardSet.merge(combination,computer.get(0));

        System.out.println("Player's hand \n"+combination.getcard(0).value+" "+combination.getcard(0).suit+" and "+combination.getcard(1).value+" "+combination.getcard(0).suit+"\n");
        System.out.println("Cards on the table \n"+combination.getcard(2).value+" "+combination.getcard(2).suit+" and "+combination.getcard(3).value+" "+combination.getcard(3).suit);
        System.out.println(combination.getcard(4).value+" "+combination.getcard(4).suit+" and "+combination.getcard(5).value+" "+combination.getcard(5).suit);
        System.out.println(combination.getcard(6).value+" "+combination.getcard(6).suit+"\n");
        System.out.println("Computer's hand \n"+combination.getcard(7).value+" "+combination.getcard(7).suit+" and "+combination.getcard(8).value+" "+combination.getcard(8).suit);


        System.out.println("\n Table has "+table.get(0).getsize()+" cards");
        combination = CardSet.merge(player.get(0),table.get(0));


        //System.out.println(combination.checkpair(combination));\
        System.out.println("\n" +
                " Player has the pair: "+Card.Value.values()[combination.checkpair(combination)].name());
        //надо улучшить вывод и причесать комбинации

        combination = CardSet.merge(computer.get(0),table.get(0));
        System.out.println("Computer has the pair: "+Card.Value.values()[combination.checkpair(combination)].name());









       /* for(int i=0;i<=52;i++){
            Card card1=new Card();
            card1=deck1.getNext();
            if(card1!=null)
            {
                System.out.println(i+": "+card1.suit+" "+card1.value);
            }
            else {
                System.out.println("Empty");
            }
        }*/





//берём первые 7 кард

        //ищем комбинации



    }


}



