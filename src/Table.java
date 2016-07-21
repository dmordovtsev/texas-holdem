import java.util.ArrayList;

/**
 * Created by fa1th on 19.07.2016.
 */
public class Table {
    enum power {ONE_PAIR, TWO_PAIR, SET, STRAIGH, FLUSH, FULL_HOUSE, QUADS, STRAIGHT_FLUSH, FLUSH_ROYAL}
    ArrayList<Player> players = new ArrayList<>();
    Deck deck = new Deck();
    ArrayList<Card> tableCards = new ArrayList<>();
    Table(){
        players.add(new MoneyMaker());
        players.add(new AI());
        deck.shuffle();
    }
    void dealTheCard(){
        for (int i = 0; i < 5; i++) {
            tableCards.add(deck.getNext());
        }
        for (int i = 0; i < players.size(); i++) {
            for (int j = 0; j < 2; j++) {
                Card card = deck.getNext();
                players.get(i).cardSet.addACard(card);
            }
        }
    }
    /*
    Этот метод проверяет есть ли пара (или две пары) в кардсете
    На вход подается кардсет, состоящий минимум из 5 карт, максимум из 7
    На выходе, должна быть установлена сила кардсета в переменную power класса CardSet
    И запомнить старшую карту


    Как проверять: На вход можно подать заранее правильный кардсет,
    Для проверки можно даже из двух одинковых карт - пары, или четыре карты - две пары
    Для двух пары, cardSet.power должен быть - 0, для двух пар - 1
    Должно проходить, а для кардсетов, которые не содержат одинаковые карты не должно проходить
     */

    void isPairOrTwoPair(CardSet cardSet){
        int coast = 0;
        outer:for (int i = 0; i < cardSet.cards.size(); i++) {
            for (int j = i+1; j < cardSet.cards.size()-1; j++) {
                if(cardSet.cards.get(i).VALUE.equals(cardSet.cards.get(j).VALUE)){
                    coast ++;
                    if(cardSet.cards.get(i).VALUE.ordinal()>cardSet.hightCardOfCombination.ordinal()){
                        cardSet.lowCardOfCombination = cardSet.hightCardOfCombination;
                        cardSet.hightCardOfCombination = cardSet.cards.get(i).VALUE;
                    } else {
                        if(cardSet.cards.get(i).VALUE.ordinal()>cardSet.lowCardOfCombination.ordinal()){
                            cardSet.lowCardOfCombination = cardSet.cards.get(i).VALUE;
                        }
                    }
                    continue outer;
                }
            }
        }
        if(coast == 1){
            cardSet.power = power.ONE_PAIR.ordinal();
        } else {
            cardSet.power = power.TWO_PAIR.ordinal();
        }
    }

     /*
    Этот метод проверяет есть ли сэт(3 одинаковые карты) или карэ (4 одинаковые карты) в кардсете
    На вход подается кардсет, состоящий минимум из 5 карт, максимум из 7
    На выходе, должна быть установлена сила кардсета в переменную power класса CardSet
    И запомнить старшую карту


    Как проверять: На вход можно подать заранее правильный кардсет,
    Для проверки можно даже из 3 одинаковых карт - пары, или 4 карты одинаковые
    Для сэта cardSet.power должен быть - 2, для карэ - 6
    Должно проходить, а для кардсетов, которые не содержат одинаковые карты не должно проходить
     */

    void isSetOrQuad(CardSet cardSet){
        int coast;
        for (int i = 0; i < cardSet.cards.size(); i++) {
            coast = 0;
            for (int j = i+1; j < cardSet.cards.size()-1; j++) {
                if(cardSet.cards.get(i).VALUE.equals(cardSet.cards.get(j).VALUE)){
                    coast++;
                    if (coast == 3){
                        cardSet.power = power.SET.ordinal();
                    } else {
                        if (coast == 4){
                            cardSet.power = power.QUADS.ordinal();
                        }
                    }
                }
            }
        }
    }

    void getAResult(){
        for (int i = 0; i < players.size(); i++) {
            CardSet tempCardSet = players.get(i).cardSet;
            for (int j = 0; j < tempCardSet.cards.size(); j++) {
                System.out.print(tempCardSet.cards.get(j).VALUE);
                System.out.println(tempCardSet.cards.get(j).SUIT);
            }
        }
        for (int i = 0; i < tableCards.size(); i++) {
            System.out.print(tableCards.get(i).VALUE);
            System.out.println(tableCards.get(i).SUIT);
        }
    }

    public static void main(String[] args) {
        Table table = new Table();
        table.dealTheCard();
        table.getAResult();
    }
}
