package lab11;
//Piper Howell
//ITEC 119 section 3

import java.util.Random;

public class Deck {
    private Card[] cards;
    private int size;

    public Deck() {
        this.cards = new Card[52];
        this.size = 0;
        for (int suit = 1; suit <= 4; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                this.cards[size] = new Card(suit, rank);
                this.size++;
            }
        }
    }

    public void printDeck() {
        for (Card card : this.cards) {
            System.out.println(card);
        }
    }

    public void shuffle() {
        Random rand = new Random();
        for (int i = 0; i < this.size; i++) {
            int randomIndex = rand.nextInt(this.size);
            swapCards(i, randomIndex);
        }
    }

    private void swapCards(int i, int j) {
        Card temp = this.cards[i];
        this.cards[i] = this.cards[j];
        this.cards[j] = temp;
    }

    public int sequentialSearch(Card card) {
        for (int i = 0; i < this.size; i++) {
            if (this.cards[i].equals(card)) {
                return i;
            }
        }
        return -1; // card not found
    }

    public int binarySearch(Card card) {
        int low = 0;
        int high = this.size - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = this.cards[mid].compareTo(card);
            if (cmp < 0) {
                low = mid + 1;
            } else if (cmp > 0) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1; // card not found
    }

    public Card getCard(int index) {
        if (index >= 0 && index < this.size) {
            return this.cards[index];
        } else {
            return null;
        }
    }
}
