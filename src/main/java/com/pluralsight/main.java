package com.pluralsight;

public class main {

    public static void main(String[] args) {

        //Created instance of Dice named dice
        Dice dice = new Dice();

         //Declare variables
        int roll1;
        int roll2;
        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;

        //Declared Variables
        //Loop for 100 times
        for (int i = 1; i < 101 ; i++) {
            roll1 = dice.roll();
            roll2 = dice.roll();
            int sum = roll1 + roll2;

        // Printing Roll1 and Roll2 with Sum
            System.out.println("Roll " + i + ": " + roll1 + " - " + roll2 + " Sum: " + sum);

        //Incrementing Counters
            if (sum == 2) {
                twoCounter = sum + 1;
            }
            if (sum == 4) {
                fourCounter =  sum + 1;
            }
            if (sum == 6) {
                sixCounter = sum + 1;
            }
            if (sum == 7) {
                sevenCounter = sum + 1;
            }

         }
         //Print display final totals
        if (twoCounter == 0){
            System.out.println("No rolls sum was 2");
        }else {
            System.out.println("Two Counter: " + twoCounter);
        }
        System.out.println("Four Counter: " + fourCounter);
        System.out.println("Six Counter: " + sixCounter);
        System.out.println("Seven Counter: " + sevenCounter);
    }

}
