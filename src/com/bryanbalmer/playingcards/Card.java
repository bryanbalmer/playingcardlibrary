package com.bryanbalmer.playingcards;

/**
 * A playing card that has one Rank and one Suit.
 * @author Bryan
 */
public class Card {
    Rank rank;
    Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }
    
    // Return string name for card, ex "Ace of Spades"
    public String getName() {
        return rank.getName() + " of " + suit.getName();
    }
    
    public Rank getRank() { return rank; }
    
    public Suit getSuit() { return suit; }
}
