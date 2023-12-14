import java.util.*;
public class Card {
    //card class, Ace low

    private int value;
    private int suit;
    private String cardName;    //three 
    private String suitName;    //hearts
    private static Random rnd = new Random();
    //static means I build ONE for all instantiations of Card
    
    public Card(int value, int suit, String cardName, String suitName) {
        this.value = value;
        this.suit = suit;
        this.cardName = cardName;
        this.suitName = suitName;
    }

    public Card() {
        pickACard();
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getSuit() {
        return suit;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getSuitName() {
        return suitName;
    }

    public void setSuitName(String suitName) {
        this.suitName = suitName;
    }

    @Override
    public String toString() {
        return cardName + " of " + suitName;
    }

  
    public String pickACard(){
        int value = rnd.nextInt(13) + 1;
        int suit = rnd. nextInt(4) + 1;

        switch(value){
            case 1:
                cardName = "Ace";
                break;
            case 2:
                cardName = "Two";
                break;
            case 3:
                cardName = "Three";
                break;
            case 4:
                cardName = "Four";
                break;
            case 5:
                cardName = "Five";
                break;
            case 6:
                cardName = "Six";
                break;
            case 7:
                cardName = "Seven";
                break;
            case 8:
                cardName = "Eight";
                break;
            case 9:
                cardName = "Nine";
                break;
            case 10:
                cardName = "Ten";
                break;
            case 11:
                cardName = "Jack";
                break;
            case 12:
                cardName = "Queen";
                break;
            case 13:
                cardName = "King";
                break;
            default:
                cardName = "invalid";
                value =0;
                break;
        };//end of switch value

        switch(suit){
            case 1:
                suitName = "Hearts";
                break;
            case 2:
                suitName = "Spades";
                break;
            case 3:
                suitName = "Diamonds";
                break;
            case 4:
                suitName = "Clubs";
                break;
            default:
                suitName = "invalid";
                break;
        }
       /*  if(value == 1){
            cardName = "Ace";
        }
        else if(value == 2){
            cardName = "Deuce";
        }
        */

        return toString();
    }

    

}
