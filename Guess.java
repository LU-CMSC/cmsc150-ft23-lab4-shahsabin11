import java.util.Scanner;
import java.util.Random;
public class Guess {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int random = rand.nextInt(100)+1;
        int number;

        System.out.println("I am guessing a number between 1 and 100");
        System.out.println("Guess the Number");
        System.out.println("Enter your guess number:");
        number = in.nextInt();
        System.out.println("Your guess is:" + number); 
        if (number > random) { 
            GuessHighNumber(number, random);
            System.out.println("That is incorrect. You have made three guesses");


        } else if (number < random) {
            GuessLowNumber(number, random);

        } else if (number == random);{
            System.out.println("Your guess is correct.");
        }



    }
     public static void GuessHighNumber(int number, int random){
        Scanner in = new Scanner(System.in);
        System.out.println("Your Guess is too high");
        System.out.println("Please enter another number");
        number = in.nextInt();

    } public static void GuessLowNumber(int number, int random) {
        Scanner in = new Scanner(System.in);
        System.out.println("Your number is too low");
        System.out.println("Please enter another number");
        number = in.nextInt();
    } 

}



    