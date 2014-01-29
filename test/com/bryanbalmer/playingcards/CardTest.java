/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bryanbalmer.playingcards;

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
public class CardTest {
    
    public CardTest() {
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
     * Test of getName method, of class Card.
     */
    @Test
    public void testGetName() {
        Card testCard1 = new Card(Rank.ACE, Suit.SPADES);
        assertTrue(testCard1.getName().equals("Ace of Spades"));

        Card testCard2 = new Card(Rank.EIGHT, Suit.CLUBS);
        assertTrue(testCard2.getName().equals("Eight of Clubs"));

        Card testCard3 = new Card(Rank.KING, Suit.HEARTS);
        assertTrue(testCard3.getName().equals("King of Hearts"));

        Card testCard4 = new Card(Rank.TEN, Suit.DIAMONDS);
        assertTrue(testCard4.getName().equals("Ten of Diamonds"));
    }
    
}
