package com.bryanbalmer.playingcards;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 * Enum for each card Rank.
 * @author Bryan
 */
public enum Rank {
    ACE   ("Ace"),
    TWO   ("Two"),
    THREE ("Three"),
    FOUR  ("Four"),
    FIVE  ("Five"),
    SIX   ("Six"),
    SEVEN ("Seven"),
    EIGHT ("Eight"),
    NINE  ("Nine"),
    TEN   ("Ten"),
    JACK  ("Jack"),
    QUEEN ("Queen"),
    KING  ("King");

    private final String name;

    Rank(String name) {
        this.name = name;
    }
    
    public String getName() { return name; }
}
