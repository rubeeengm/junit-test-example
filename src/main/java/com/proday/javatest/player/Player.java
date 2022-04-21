package com.proday.javatest.player;

/**
 * @author Ruben Malaga
 */
public class Player {
    private Dice dice;
    private int minNumberToWin;

    public Player(Dice dice, int minNumberToWin) {
        this.dice = dice;
        this.minNumberToWin = minNumberToWin;
    }

    public boolean play() {
        int diceNumber = dice.roll();

        return diceNumber > minNumberToWin;
    }
}
