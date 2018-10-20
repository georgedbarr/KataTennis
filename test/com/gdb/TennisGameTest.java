package com.gdb;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.gdb.TennisGame;

class TennisGameTest {

    private TennisGame game;
    private static final String playerOne = "Ezra";
    private static final String playerTwo = "Marvin";

    @BeforeEach
    void setUp() {
        game = new TennisGame(playerOne, playerTwo);
    }

    @Test
    void newGame() {
        Assertions.assertEquals("The score is Love - Love.", game.reportScore());
    }

    @Test
    void fifteenLove() {
        game.incrementScore(playerOne);
        Assertions.assertEquals("The score is Fifteen - Love.", game.reportScore());
    }

    @Test
    void ThirtyLove() {
        game.incrementScore(playerOne);
        game.incrementScore(playerOne);
        Assertions.assertEquals("The score is Thirty - Love.", game.reportScore());
    }

    @Test
    void FortyLove() {
        game.incrementScore(playerOne);
        game.incrementScore(playerOne);
        game.incrementScore(playerOne);
        Assertions.assertEquals("The score is Forty - Love.", game.reportScore());
    }

    @Test
    void loveFifteen() {
        game.incrementScore(playerTwo);
        Assertions.assertEquals("The score is Love - Fifteen.", game.reportScore());
    }

    @Test
    void loveThirty() {
        game.incrementScore(playerTwo);
        game.incrementScore(playerTwo);
        Assertions.assertEquals("The score is Love - Thirty.", game.reportScore());
    }

    @Test
    void loveForty() {
        game.incrementScore(playerTwo);
        game.incrementScore(playerTwo);
        game.incrementScore(playerTwo);
        Assertions.assertEquals("The score is Love - Forty.", game.reportScore());
    }

    @Test
    void fifteenAll() {
        game.incrementScore(playerOne);
        game.incrementScore(playerTwo);
        Assertions.assertEquals("The score is Fifteen - Fifteen.", game.reportScore());
    }

    @Test
    void thirtyFifteen() {
        game.incrementScore(playerOne);
        game.incrementScore(playerOne);
        game.incrementScore(playerTwo);
        Assertions.assertEquals("The score is Thirty - Fifteen.", game.reportScore());
    }

    @Test
    void fortyFifteen() {
        game.incrementScore(playerOne);
        game.incrementScore(playerOne);
        game.incrementScore(playerOne);
        game.incrementScore(playerTwo);
        Assertions.assertEquals("The score is Forty - Fifteen.", game.reportScore());
    }

    @Test
    void fifteenThirty() {
        game.incrementScore(playerOne);
        game.incrementScore(playerTwo);
        game.incrementScore(playerTwo);
        Assertions.assertEquals("The score is Fifteen - Thirty.", game.reportScore());
    }

    @Test
    void fifteenForty() {
        game.incrementScore(playerOne);
        game.incrementScore(playerTwo);
        game.incrementScore(playerTwo);
        game.incrementScore(playerTwo);
        Assertions.assertEquals("The score is Fifteen - Forty.", game.reportScore());
    }

    @Test
    void thirtyAll() {
        game.incrementScore(playerOne);
        game.incrementScore(playerOne);
        game.incrementScore(playerTwo);
        game.incrementScore(playerTwo);
        Assertions.assertEquals("The score is Thirty - Thirty.", game.reportScore());
    }

    @Test
    void fortyThirty() {
        game.incrementScore(playerOne);
        game.incrementScore(playerOne);
        game.incrementScore(playerOne);
        game.incrementScore(playerTwo);
        game.incrementScore(playerTwo);
        Assertions.assertEquals("The score is Forty - Thirty.", game.reportScore());
    }

    @Test
    void thirtyForty() {
        game.incrementScore(playerOne);
        game.incrementScore(playerOne);
        game.incrementScore(playerTwo);
        game.incrementScore(playerTwo);
        game.incrementScore(playerTwo);
        Assertions.assertEquals("The score is Thirty - Forty.", game.reportScore());
    }

    @Test
    void deuce() {
        game.incrementScore(playerOne);
        game.incrementScore(playerOne);
        game.incrementScore(playerOne);
        game.incrementScore(playerTwo);
        game.incrementScore(playerTwo);
        game.incrementScore(playerTwo);
        Assertions.assertEquals("The score is Deuce.", game.reportScore());
    }

    @Test
    void advantagePlayerOne() {
        game.incrementScore(playerOne);
        game.incrementScore(playerOne);
        game.incrementScore(playerOne);
        game.incrementScore(playerTwo);
        game.incrementScore(playerTwo);
        game.incrementScore(playerTwo);
        game.incrementScore(playerOne);
        Assertions.assertEquals("The score is Advantage " + playerOne + ".", game.reportScore());
    }

    @Test
    void advantagePlayerTwo() {
        game.incrementScore(playerOne);
        game.incrementScore(playerOne);
        game.incrementScore(playerOne);
        game.incrementScore(playerTwo);
        game.incrementScore(playerTwo);
        game.incrementScore(playerTwo);
        game.incrementScore(playerTwo);
        Assertions.assertEquals("The score is Advantage " + playerTwo + ".", game.reportScore());
    }

    @Test
    void playerOneWin(){
        game.incrementScore(playerOne);
        game.incrementScore(playerOne);
        game.incrementScore(playerOne);
        game.incrementScore(playerOne);
        Assertions.assertEquals("Game, Set and Match " + playerOne + "!", game.reportScore());
    }

    @Test
    void playerOneWinFromDeuce(){
        game.incrementScore(playerOne);
        game.incrementScore(playerOne);
        game.incrementScore(playerOne);
        game.incrementScore(playerTwo);
        game.incrementScore(playerTwo);
        game.incrementScore(playerTwo);
        game.incrementScore(playerOne);
        game.incrementScore(playerOne);
        Assertions.assertEquals("Game, Set and Match " + playerOne + "!", game.reportScore());
    }

    @Test
    void playerTwoWin() {
        game.incrementScore(playerTwo);
        game.incrementScore(playerTwo);
        game.incrementScore(playerTwo);
        game.incrementScore(playerTwo);
        Assertions.assertEquals("Game, Set and Match " + playerTwo + "!", game.reportScore());
    }

    @Test
    void playerTwoWinFromDeuce(){
        game.incrementScore(playerOne);
        game.incrementScore(playerOne);
        game.incrementScore(playerOne);
        game.incrementScore(playerTwo);
        game.incrementScore(playerTwo);
        game.incrementScore(playerTwo);
        game.incrementScore(playerTwo);
        game.incrementScore(playerTwo);
        Assertions.assertEquals("Game, Set and Match " + playerTwo + "!", game.reportScore());
    }

}