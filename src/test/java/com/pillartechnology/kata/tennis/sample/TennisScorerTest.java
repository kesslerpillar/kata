package com.pillartechnology.kata.tennis.sample;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TennisScorerTest {

    private TennisGame game;

    @Before
    public void setUp(){
        game = new TennisGame("Player 1" , "Player 2");
    }

    @Test
    public void testNewGameShouldReturnLoveAll() {
        assertEquals("Love all", game.calculateScore());
    }

    @Test
    public void testPlayerOneWinsFirstBall() {
        game.playerOneScores();
        assertEquals("Fifteen, Love", game.calculateScore());
    }
}
