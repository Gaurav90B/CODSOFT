package com.company;
import java.util.Scanner;
import java.util.Random;
class Game1{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;
    public static int Max_Guesses = 7;
    public int getNoOfGuesses() {
        return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }
    Game1(){
        Random rm = new Random();
        this.number = rm.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber =  sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if (inputNumber==number){
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number,noOfGuesses);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("Too low...");
        }
        else if(inputNumber>number){
            System.out.println("Too high...");
        }
        return false;
    }

}
public class NumberGame {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;

        while (!b && g.getNoOfGuesses() < Game1.Max_Guesses) {
            g.takeUserInput();
            b = g.isCorrectNumber();
        }

        if (!b) {
            System.out.format("Sorry, you've used all %d attempts. The number was %d.\n", Game1.Max_Guesses, g.number);
        }

    }
}
