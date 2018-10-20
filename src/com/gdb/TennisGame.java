package com.gdb;

/**
 *  A class to model the scoring of a game of tennis between two players.
 */
public class TennisGame {

    private String playerOne;
    private int playerOneScore;
    private String playerTwo;
    private int playerTwoScore;


    /**
     * Default constructor - passes in two names to main constructor.
     */
    public TennisGame() {
        this("Barack Obama", "Donald Trump");
    }

    /**
     * Constructor - initialises scores to zero and initialises names with the given String values.
     * @param playerOne Name of player one.
     * @param playerTwo Name of player two.
     */
    public TennisGame(String playerOne, String playerTwo){
        this.playerOne = playerOne;
        playerOneScore = 0;
        this.playerTwo = playerTwo;
        playerTwoScore = 0;
    }

    /**
     * Uses the rules of tennis to determine the correct score to report. Initially checks for win,
     * then checks for deuce followed by checking for advantage. If none of these cases are matched then
     * the game is still in progress. Score is reported as [Player One Score] - [Player Two Score].
     * @return A String describing the current score of the game.
     */
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

    /**
     * Increments the score of the given player.
     * @param name Name of the player whose score will be implemented.
     * @throws IllegalArgumentException If the given name does not match that of playerOne or playerTwo.
     */
    public void incrementScore(String name){
        // Could refactor to use enum rather than string to save on string comparison.
        if (name.equals(playerOne)) {
            playerOneScore++;
        }
        else if (name.equals(playerTwo)){
            playerTwoScore++;
        }
        else { // Name is not recognised so throw exception.
            throw new IllegalArgumentException("Name not recognised!");
        }
    }
}
