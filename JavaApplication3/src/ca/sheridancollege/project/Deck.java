package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<Card>(52);
        for (Value value : Value.values()) {
            for (Suit suit : Suit.values()) {
                cards.add(new Card(value, suit));
            }
        }
        this.shuffle();
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void removeCard() {
        this.cards.remove(0);
    }

    
}
