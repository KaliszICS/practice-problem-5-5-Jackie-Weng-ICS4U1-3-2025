//import java.util.ArrayList;
//card with a name and suit. they are all worth different values. 

//* Jackie Weng */
//J.Kalizs
public class Card implements Comparable<Card> {
    
    private String suit; // like heart king 

    private String name; // like 2,5,2,3,1
    // actually creating the card
    public Card(String name, String suit) {
        this.name = name;
        this.suit = suit;
    }
    //return suit. so repetive
    public String getSuit() {
        return this.suit;
    }
    //return name
    public String getName() {
        return this.name;
    }

    // set the name to smth else
    public void setName(String name) {
        this.name = name;
    }
// repetive. set suit to smth else
    public void setSuit(String suit) {
        this.suit = suit;
    }

    
// compare the cards
    @Override
    public int compareTo(Card card) {
        String[] cardName = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"}; // must be in this order. i had to learn this the hard way
        String[] suitName = {"Hearts", "Clubs", "Diamonds", "Spades"}; // the array order actually matters
        // finding the index of the card name and other card name in array
        int cardNameIndex = -1;
        int suitNameIndex = -1;
        int otherCardNameIndex = -1;
        int otherSuitNameIndex = -1;
        for (int i = 0; i < cardName.length; i++) {
            if (name.equals(cardName[i])) {
                cardNameIndex = i;
            }
            if (card.name.equals(cardName[i])) {
                otherCardNameIndex = i;
            }
        }
        for (int i = 0; i < suitName.length; i++) {
            if (suit.equals(suitName[i])) {
                suitNameIndex = i;
            }// comparing by suit first
            if (card.suit.equals(suitName[i])) {
                otherSuitNameIndex = i;
            }
        }// if their suits are the same, compare name
        if (suitNameIndex != otherSuitNameIndex) {
            return suitNameIndex - otherSuitNameIndex;
        }
        return cardNameIndex - otherCardNameIndex;



    } // they always have of in the middle "ace of hearts"
    @Override
    public String toString() {
        return this.name + " of " + this.suit;
    }
}
