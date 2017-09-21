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
        if (playerOne.getBalls() >= 3 && hasTieGame()) return "Deuce";

        if (hasAdvantage()) return "Advantage " + playerWithHighestScore();
        if (hasAdvantage()) return "Advantage " + playerWithHighestScore();
        if (hasWinner()) return playerWithHighestScore() + " Wins";
        if (hasWinner()) return playerWithHighestScore() + " Wins";

        if (hasTieGame()) return calculateScoreFor(playerOne) + " All";

        return calculateScoreFor(playerOne) + ", " + calculateScoreFor(playerTwo);
    }

    public void playerOneScores() {
        playerOne.addBall();
    }

    public void playerTwoScores() {
        playerTwo.addBall();
    }

    private String calculateScoreFor(Player player) {
        return scoreTranslation.get(player.getBalls());
    }

    private boolean hasTieGame() {
        return playerOne.getBalls() == playerTwo.getBalls();
    }

    private boolean hasAdvantage() {
        return atLeastFour(playerTwo) && leadingByOne(playerOne, playerTwo)
                || atLeastFour(playerOne) && leadingByOne(playerTwo, playerOne);
    }

    private boolean leadingByOne(Player player, Player comparisonPlayer) {
        return player.getBalls() == (comparisonPlayer.getBalls() + 1);
    }

    private boolean atLeastFour(Player player) {
        return player.getBalls() >= 4;
    }

    private String playerWithHighestScore() {
        if (ahead(playerOne, playerTwo)) return playerOne.getName();
        return playerTwo.getName();
    }

    private boolean ahead(Player player, Player comparisonPlayer) {
        return player.getBalls() > comparisonPlayer.getBalls();
    }

    private boolean hasWinner() {
        return atLeastFour(playerTwo) && playerTwo.getBalls() >= playerOne.getBalls() + 2
                || atLeastFour(playerOne) && playerOne.getBalls() >= playerTwo.getBalls() + 2;
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
