package com.pillartechnology.kata.tennis.sample;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TennisScorerTest {

    @Test
    public void testNewGameShouldReturnLoveAll() {
        TennisGame game = new TennisGame("Player 1" , "Player 2");
        assertEquals("Love all", game.calculateScore());
    }
}
