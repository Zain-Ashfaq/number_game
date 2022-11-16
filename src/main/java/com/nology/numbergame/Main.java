package com.nology.numbergame;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        int upperBound = 100;
        int int_random = rand.nextInt(upperBound);
        //System.out.println("this is the random number " + int_random);


        NumberGame game = new NumberGame(int_random);
        game.play();

    }
}