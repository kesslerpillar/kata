package com.pillartechnology.kata.tennis.initial;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TennisGameTest {

    @Test
    public void testPlaceholder(){
        TennisGame tennisScorer = new TennisGame();
        assertEquals("", tennisScorer.calculateScore());
    }
}
