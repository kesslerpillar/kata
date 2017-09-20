package com.pillartechnology.kata.tennis.sample;

import com.pillartechnology.kata.romannumerals.sample.RomanNumerals;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TennisScorerTest {

    @Test
    public void testPlaceholder(){
        TennisScorer tennisScorer = new TennisScorer();
        assertEquals("", tennisScorer.score());
    }
}
