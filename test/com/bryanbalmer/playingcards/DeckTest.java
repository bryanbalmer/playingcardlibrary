/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bryanbalmer.playingcards;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bryan
 */
public class DeckTest {
    
    public DeckTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of shuffleDeck method, of class Deck.
     */
    @Test
    public void testShuffleDeck() {
        Deck shuffledDeck = new Deck();
        shuffledDeck.shuffleDeck();

        Deck deck = new Deck();


        assertFalse((shuffledDeck.drawNextCard() == deck.drawNextCard()) &&
                    (shuffledDeck.drawNextCard() == deck.drawNextCard()) &&
                    (shuffledDeck.drawNextCard() == deck.drawNextCard()) &&
                    (shuffledDeck.drawNextCard() == deck.drawNextCard())) ;
    }

    /**
     * Test of isDeckShuffled method, of class Deck.
     */
    @Test
    public void testIsDeckShuffled() {
        Deck testDeck = new Deck();
        assertFalse(testDeck.isDeckShuffled());

        testDeck.shuffleDeck();
        assertTrue(testDeck.isDeckShuffled());
    }

    /**
     * Test of cardsLeft method, of class Deck.
     */
    @Test
    public void testCardsLeft() {
        Deck testDeck = new Deck();
        
        ArrayList<Card> discard = new ArrayList<>();
        for (int i = 52; i>0; i--) {
            assertTrue(i == testDeck.cardsLeft());
            discard.add(testDeck.drawNextCard());
        }   
    }

    /**
     * Test of drawNextCard method, of class Deck.
     */
    @Test
    public void testDrawNextCard() {
        Deck testDeck = new Deck();

        Card testCard;
        testCard = testDeck.drawNextCard();
        assertTrue(testCard.getName().equals("Ace of Clubs"));

        testCard = testDeck.drawNextCard();
        assertTrue(testCard.getName().equals("Two of Clubs"));

        testCard = testDeck.drawNextCard();
        assertTrue(testCard.getName().equals("Three of Clubs"));

        testCard = testDeck.drawNextCard();
        assertTrue(testCard.getName().equals("Four of Clubs"));
    }
    
}
