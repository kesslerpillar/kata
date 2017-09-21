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
        setupScore(0, 0);
        assertEquals("Love All", game.calculateScore());
    }

    @Test
    public void testPlayerOneWinsFirstBall() {
        setupScore(1, 0);
        assertEquals("Fifteen, Love", game.calculateScore());
    }

    @Test
    public void testFifteenAll() {
        setupScore(1, 1);
        assertEquals("Fifteen All", game.calculateScore());
    }

    @Test
    public void testPlayerTwoWinsFirstTwoBalls() {
        setupScore(0, 2);
        assertEquals("Love, Thirty", game.calculateScore());
    }

    @Test
    public void testPlayerOneWinsFirstThreeBalls() {
        setupScore(3, 0);
        assertEquals("Forty, Love", game.calculateScore());
    }

    @Test
    public void testPlayersAreDeuce() {
        setupScore(3, 3);
        assertEquals("Deuce", game.calculateScore());
    }

    @Test
    public void testPlayerOneWinsGame() {
        setupScore(4, 0);
        assertEquals("Player 1 Wins", game.calculateScore());
    }

    @Test
    public void testPlayerTwoWinsGame() {
        setupScore(0, 4);
        assertEquals("Player 2 Wins", game.calculateScore());
    }

    @Test
    public void testPlayersAreDuce4() {
        setupScore(4, 4);
        assertEquals("Deuce", game.calculateScore());
    }

    @Test
    public void testPlayerTwoAdvantage() {
        setupScore(4, 5);
        assertEquals("Advantage Player 2", game.calculateScore());
    }

    @Test
    public void testPlayerOneAdvantage() {
        setupScore(5, 4);
        assertEquals("Advantage Player 1", game.calculateScore());
    }

    @Test
    public void testPlayerTwoWinsAfterAdvantage() {
        setupScore(6, 8);
        assertEquals("Player 2 Wins", game.calculateScore());
    }

    @Test
    public void testPlayerOneWinsAfterAdvantage() {
        setupScore(8, 6);
        assertEquals("Player 1 Wins", game.calculateScore());
    }

    private void setupScore(int playerOneBalls, int playerTwoBalls) {
        for (int i = 0; i < playerOneBalls; i++) {
            game.playerOneScores();
        }

        for (int i = 0; i < playerTwoBalls; i++) {
            game.playerTwoScores();
        }
    }
}
