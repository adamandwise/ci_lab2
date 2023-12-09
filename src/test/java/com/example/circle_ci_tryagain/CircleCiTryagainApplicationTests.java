package com.example.circle_ci_tryagain;

import objects.Dice;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class CircleCiTryagainApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testRollReturnsValueWithinRange(){
        Dice dice = new Dice(6,"red");
        int roll = dice.roll();
        assertTrue(roll >= 1 && roll <= 6);
    }

    @Test
    void testRollManyReturnsCorrectArrayLength(){
        Dice dice = new Dice(6,"red");
        int[] rolls = dice.rollMany(5);
        assertEquals(5,rolls.length);
        for (int roll : rolls) {
            assertTrue(roll >= 1 && roll <= 6);
        }
    }
}
