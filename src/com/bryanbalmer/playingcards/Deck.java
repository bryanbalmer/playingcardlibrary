package com.bryanbalmer.playingcards;



/**
 * A Deck class to create and handle each card combination of
 * Ranks and Suits.  Creates a standard 52 card deck.
 * @author Bryan
 */

import java.util.*;

public class Deck {
    // A set to hold each unique card.
    private final LinkedHashSet<Card> cards;
    private boolean isShuffled;

    public Deck() {
        cards = new LinkedHashSet<>();
        isShuffled = false;
        makeDeck();
    }
    
    // Make a card and add it to deck's cards for every combination
    // of ranks and suits
    private void makeDeck() {
        for (Suit s : Suit.values())
            for (Rank r : Rank.values())
                cards.add(new Card(r, s));
    }
    
    // Randomize order of cards in a temporary list
    // Replace current cards with new randomized cards
    public void shuffleDeck() {
        List<Card> tempCards = new ArrayList<>(cards);
        Collections.shuffle(tempCards);

        cards.clear();
        cards.addAll(tempCards);

        isShuffled = true;
    }

    public boolean isDeckShuffled() { return isShuffled; }

    public int cardsLeft() { return cards.size(); }

    // Remove a card from the set and return it
    public Card drawNextCard() throws NoSuchElementException {
        Iterator<Card> i = cards.iterator();
        if (!(i.hasNext())) {
            throw new NoSuchElementException("No more cards left");
        }

        Card tempCard = i.next();
        i.remove();
        return tempCard;
    }
}
