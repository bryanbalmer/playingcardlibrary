package com.bryanbalmer.playingcards;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 * Enum for each card Suit.
 * @author Bryan
 */
public enum Suit {
    CLUBS    ("Clubs"),
    DIAMONDS ("Diamonds"),
    HEARTS   ("Hearts"),
    SPADES   ("Spades");

    private final String name;

    Suit(String name) {
        this.name = name;
    }

    public String getName() { return name; }
}

