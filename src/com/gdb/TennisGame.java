package com.gdb;

public class TennisGame {

    private String playerOne;
    private int playerOneScore;
    private String playerTwo;
    private int playerTwoScore;


    public TennisGame() {
        this("Ricky", "Bubbles");
    }

    public TennisGame(String playerOne, String playerTwo){
        this.playerOne = playerOne;
        playerOneScore = 0;
        this.playerTwo = playerTwo;
        playerTwoScore = 0;
    }

    public String reportScore(){
        if(((playerOneScore >= 4) || (playerTwoScore >= 4)) && (Math.abs(playerOneScore - playerTwoScore) >= 2)) { // Check Win
            return (playerOneScore > playerTwoScore) ? "Game, Set and Match " + playerOne + "!"
                    : "Game, Set and Match " + playerTwo + "!";
        }
        else if ((playerOneScore == playerTwoScore) && (playerOneScore == 3)) { // Check Deuce.
            return "The score is Deuce.";
        }
        else if (playerOneScore + playerTwoScore == 7) { // Check Advantage.
            return (playerOneScore > playerTwoScore) ? "The score is Advantage " + playerOne + "."
                    : "The score is Advantage " + playerTwo + ".";
        }
        else { // Game is still in progress.
            String score[] = {"Love", "Fifteen", "Thirty", "Forty"};
            return "The score is " + score[playerOneScore] + " - " + score[playerTwoScore] + ".";
        }
        // Could poss refactor to have just one return statement.
    }

    public void incrementScore(String player){
        if (player.equals(playerOne)) {
            playerOneScore++;
        }
        else if (player.equals(playerTwo)){
            playerTwoScore++;
        }
        // Should raise an error if name is not recognised.
    }
}
