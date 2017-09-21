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

    private Player playerOne;
    private Player playerTwo;

    public TennisGame(String playerOneName, String playerTwoName) {
        playerOne = new Player(playerOneName);
        playerTwo = new Player(playerTwoName);
    }

    public String calculateScore() {
        if (playerOne.getBalls() == 4) return playerOne.getName() + " Wins";
        if (playerTwo.getBalls() == 4) return playerTwo.getName() + " Wins";

        if (playerOne.getBalls() == 3 && playerTwo.getBalls() == 3) return "Deuce";

        if (playerOne.getBalls() == playerTwo.getBalls()) return calculateScore(playerOne.getBalls()) + " All";

        return calculateScore(playerOne.getBalls()) + ", " + calculateScore(playerTwo.getBalls());
    }

    public void playerOneScores() {
        playerOne.addBall();
    }

    public void playerTwoScores() {
        playerTwo.addBall();
    }

    private String calculateScore(int balls){
        return scoreTranslation.get(balls);
    }

    private class Player {

        private String name;
        private int balls;

        Player(String name) {
            this.name = name;
            balls = 0;
        }

        private String getName() {
            return name;
        }

        private int getBalls() {
            return balls;
        }

        private void addBall() {
            balls++;
        }
    }
}
