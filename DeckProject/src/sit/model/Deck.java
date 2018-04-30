package sit.model;

public class Deck {

    private int size;
    private Card[] cards;

    public Deck() {
        size = 52;
        cards = new Card[size];
        int a = 0;
        
        for(int i = 0; i < 4; i++){
            for(int j  = 1; j<14; j++){
                cards[a] = new Card(j, i);
                a++;
            }
        }
    
    }

    /**
     * Return the number of Cards currently in the Deck.
     */
    public int size() {
        return size;
    }

    /**
     * Remove one Card from the Deck and return it.
     */
    public Card deal() {
        size--;
        return cards[size];
    }

    /**
     * Return true if the Deck contains no Cards.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    public Card[] getCards() {
        return cards;
    }

    @Override
    public String toString() {
        String cardInDecks = "";
        for (Card c : cards) {
            cardInDecks += c + "\n";
        }
        return cardInDecks;
    }

    /**
     * Randomly rearrange the Cards in the Deck.
     */
    public void shuffle() {
        int index = (int)(Math.random()*52);
        swap(0,index);
    }

    /**
     * Swap the Cards at indices i and j.
     */
    public void swap(int i, int j) {
        Card c1 = cards[i];
        Card c2 = cards[j];

        cards[i] = c2;
        cards[j] = c1;
    }

    public Card getMaxCard() { 
        Card maxCard = cards[0];
        
        if(isEmpty()){
            maxCard = null;
        }
        
        for(int i = 0; i< size-1; i++){
            if(cards[i+1].getSuit() > cards[i].getSuit()){
                maxCard = cards[i+1];
            }else if(cards[i+1].getSuit() == cards[i].getSuit()){
                if(cards[i+1].getRank() > cards[i].getRank()){
                    maxCard = cards[i+1];
                }else{
                    maxCard = cards[i];
                }
            }else{
                maxCard = cards[i];
            }
        }
        return maxCard;
    }

}
