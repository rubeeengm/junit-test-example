package com.proday.javatest.player;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Ruben Malaga
 */
public class PlayerTest {

    @Test
    public void losesWhenDiceNumberIsTooLow() {
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(2);


        Player player = new Player(dice, 3);

        assertFalse(player.play());
    }

    @Test
    public void winsWhenDiceNumberIsBig() {
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(4);


        Player player = new Player(dice, 3);

        assertTrue(player.play());
    }
}
