package lab11;

//Piper Howell
//ITEC 119 section 3
//lab 9

//Class to create a card

//initialize suit and rank
public class Card {
    private int suit;
    private int rank;

    //new card method
    public Card(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    
    //getter
    public int getSuit() {
        return suit;
    }

    //getter
    public int getRank() {
        return rank;
    }

    //returns string rep of the cards 
    public String toString() {
    	
    	//string arrays to map their numbers
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        String rankString = ranks[rank - 1];
        String suitString = suits[suit - 1];

        //combine into one string
        return rankString + " of " + suitString;
    }


    public int compareTo(Card other) {
        if (this.rank > other.rank) {
            return 1;
        } else if (this.rank < other.rank) {
            return -1;
        } else {
            if (this.suit > other.suit) {
                return 1;
            } else if (this.suit < other.suit) {
                return -1;
            } else {
                return 0;
            }
        }
}
}

