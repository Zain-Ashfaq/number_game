package com.nology.numbergame;
import java.util.Scanner;

public class NumberGame {
    protected int userNumGuess;
    protected boolean isGuessCorrect;
    protected int rightNum;
    protected int totalGuesses=0;

    public NumberGame(int rightNum){
        this.rightNum=rightNum;
    }

    public void play(){
        // play the game
        while (isGuessCorrect==false||totalGuesses>9){
            Scanner myObj = new Scanner(System.in);

            System.out.println("Enter guess number");
            int userNumGuess = myObj.nextInt();
            addTotalGuesses();
            System.out.println("you have made "+totalGuesses+" guesses");

            if (totalGuesses>9) {
                System.out.println("out of guesses, you lost");
                return;

            }

            if(userNumGuess==rightNum){
                System.out.println("You won");
                isGuessCorrect=true;
                break;
            } else if (userNumGuess+3>=rightNum&&userNumGuess-3<=rightNum) {
                System.out.println("Very very warm");
                
            }else if (userNumGuess+6>=rightNum&&userNumGuess-6<=rightNum) {
                System.out.println("very warm");

            }else if (userNumGuess+10>=rightNum&&userNumGuess-10<=rightNum) {
                System.out.println("warm");

            }else if (userNumGuess+16>=rightNum&&userNumGuess-16<=rightNum) {
                System.out.println("cold");

            }else if (userNumGuess+21>=rightNum&&userNumGuess-21<=rightNum) {
                System.out.println("very cold");

            }else if (userNumGuess+25>=rightNum&&userNumGuess-25<=rightNum) {
                System.out.println("freezing");

            }else if (userNumGuess+30>=rightNum&&userNumGuess-30<=rightNum) {
                System.out.println("arctic");

            }

            else {
                System.out.println("no where near");
            }


        }

    }

    public int getUserNumGuess() {
        return userNumGuess;
    }

    public void setUserNumGuess(int userNumGuess) {
        this.userNumGuess = userNumGuess;
    }

    public int addTotalGuesses(){
        return totalGuesses++;

    }
}
