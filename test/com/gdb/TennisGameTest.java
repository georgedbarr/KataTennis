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
        Assertions.assertEquals("The score is Love - Love", game.reportScore());
    }

    @Test
    void fifteenLove() {
        Assertions.assertEquals("The score is Fifteen - Love.", game.reportScore());
    }

    @Test
    void loveFifteen() {
        Assertions.assertEquals("The score is Love - Fifteen.", game.reportScore());
    }

    @Test
    void fifteenAll() {
        Assertions.assertEquals("The score is Fifteen - Fifteen.", game.reportScore());
    }

    @Test
    void thirtyFifteen() {
        Assertions.assertEquals("The score is Thirty - Fifteen.", game.reportScore());
    }

    @Test
    void fifteenThirty() {
        Assertions.assertEquals("The score is Fifteen - Thirty.", game.reportScore());
    }

    @Test
    void thirtyAll() {
        Assertions.assertEquals("The score is Thirty - Thirty.", game.reportScore());
    }

    @Test
    void fortyThirty() {
        Assertions.assertEquals("The score is Forty - Thirty.", game.reportScore());
    }

    @Test
    void thirtyForty() {
        Assertions.assertEquals("The score is Thirty - Forty.", game.reportScore());
    }

    @Test
    void deuce() {
        Assertions.assertEquals("The score is Deuce.", game.reportScore());
    }

    @Test
    void advantagePlayerOne() {
        Assertions.assertEquals("The score is Advantage " + playerOne + ".", game.reportScore());
    }

    @Test
    void advantagePlayerTwo() {
        Assertions.assertEquals("The score is Advantage " + playerTwo + ".", game.reportScore());
    }

    @Test
    void playerOneWin() {
        Assertions.assertEquals("Game, Set and Match " + playerOne + "!", game.reportScore());
    }

    @Test
    void playerTwoWin() {
        Assertions.assertEquals("Game, Set and Match " + playerTwo + "!", game.reportScore());
    }

}