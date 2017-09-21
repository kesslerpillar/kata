package com.pillartechnology.kata.tennis.sample;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TennisGame {

    private static Map<Integer, String> scoreTranslation;

    static{
        scoreTranslation = Collections.unmodifiableMap(new HashMap<Integer, String>() {
            {
                put(0, "Love");
                put(1, "Fifteen");
                put(2, "Thirty");
                put(3, "Forty");
            }
        });
    }

    private int playerOneScore;
    private int playerTwoScore;

    public TennisGame(String playerOneName, String playerTwoName) {
        playerOneScore = 0;
        playerTwoScore = 0;
    }

    public String calculateScore() {
        if (playerOneScore == 3 && playerTwoScore == 3) return "Deuce";
        if(playerOneScore == playerTwoScore) return calculateScore(playerOneScore) + " All";
        return calculateScore(playerOneScore) + ", " + calculateScore(playerTwoScore);
    }

    public void playerOneScores() {
        playerOneScore++;
    }

    public void playerTwoScores() {
        playerTwoScore++;
    }

    private String calculateScore(int balls){
        return scoreTranslation.get(balls);
    }
}
