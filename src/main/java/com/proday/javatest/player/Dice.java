package com.proday.javatest.player;

import java.util.Random;

/**
 * @author Ruben Malaga
 */
public class Dice {
    private int sides;

    public Dice(int sides) {
        this.sides = sides;
    }

    public int roll() {
        return new Random().nextInt(sides) + 1;
    }
}
