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
        return "";
    }

    public void incrementScore(String player){
        if (player.equals(playerOne)) {
            playerOneScore++;
        }
        else if (player.equals(playerTwo)){
            playerTwoScore++;
        }
    }

}
