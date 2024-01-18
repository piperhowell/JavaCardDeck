package lab11;
//Piper Howell
//ITEC 119 section 3

public class driver {

    public static void main(String[] args) {
        Deck deck = new Deck();

        // Print the unshuffled deck
        deck.printDeck();

        // Shuffle the deck
        deck.shuffle();

        // Print the shuffled deck
        deck.printDeck();

        // Get the card at index 26 and print it
        Card card26 = deck.getCard(26);
        System.out.println("Card at index 26: " + card26);

        // Search for a card using sequential search
        Card searchCard1 = new Card(1, 11); // Jack of Clubs
        int searchIndex1 = deck.sequentialSearch(searchCard1);
        if (searchIndex1 == -1) {
            System.out.println("Card not found in deck.");
        } else {
            System.out.println(searchCard1 + " found at index " + searchIndex1 + ".");
        }

        // Search for a card using binary search
        Card searchCard2 = new Card(3, 5); // Five of Hearts
        int searchIndex2 = deck.binarySearch(searchCard2);
        if (searchIndex2 == -1) {
            System.out.println("Card not found in deck.");
        } else {
            System.out.println(searchCard2 + " found at index " + searchIndex2 + ".");
        }
    }

}



