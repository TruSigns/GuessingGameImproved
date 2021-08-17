import java.util.Random;
import java.util.Scanner;

public class GuessingGame {


    public static void main(String[] args) {

        //creating a random class that'll get a number between 1-100
        Random rand = new Random();
        int randomNumber = rand.nextInt(100);
        System.out.println(randomNumber);

        //prompt the user to enter a number between 1-100
        //Create a scanner for the user to input a number

        int numberOfAttempts = 0; //

        while (true){
            System.out.println("Enter your guess! (choose between 1-100)");
            Scanner sc = new Scanner(System.in);

            int playerGuess = sc.nextInt();
            numberOfAttempts++;


            if (playerGuess == randomNumber) {
                System.out.println("Correct!");//message if the user got the input correct
                System.out.println("The number of tries were: " + numberOfAttempts);
            } else if (playerGuess > randomNumber) {
                System.out.println("Your number is higher than the Random number");//message if user number is higher than the correct number
            } else if (playerGuess < randomNumber) {
                System.out.println("Your Number is lower than the Random number");// Message if user number is lower than the correct number
            }


        }
    }
}
