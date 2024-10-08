package com.pluralsight;

import java.util.Random;

public class Dice {

    public int roll() {
        int[] diceNum = {1,2,3,4,5,6};
        int minDice = diceNum[0];
        int maxDice = diceNum[5];

        return (int) (Math.random() * maxDice) + minDice;
    }
}
