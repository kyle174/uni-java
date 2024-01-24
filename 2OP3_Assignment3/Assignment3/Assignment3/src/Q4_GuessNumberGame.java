/* Assignment 3 (100 marks in total; 5% of the final score of this course)
 *
 * Question 4 (30 marks)

Write a program that generates a random number y and asks the user to guess what the number is.
If the user's guess x is higher than y,the program should display "The number is lower than x." and asks the user to guess again.
If the user's guess x is lower than y, the program should display "The number is higher than x." and asks the user to guess again.
If the user exceed a certain times of trails (i.e., 10 times), then the program should display "You have exhausted your trials" and stop.
If the user successfully guess the number, then the program should display "You successfully guessed the number!".
 */

import java.util.Scanner;

public class Q4_GuessNumberGame {

    // Function that implements the number guessing game
    public static void guessingNumberGame(int number_to_guess, int number_of_trials) {
        /* place your code here */

        // Setup user input
        Scanner myScanner = new Scanner(System.in);

        // Initialize variables
        boolean correct = false;

        // Keep guessing until correct or until user runs out of trials
        while (number_of_trials > 0 && !correct){
            // Get user guess
            System.out.print("Enter guess: ");
            int guess = myScanner.nextInt();

            // Guess too high
            if (guess > number_to_guess) {
                System.out.println("The number is lower than x.\n");
            }
            // Guess too low
            else if (guess < number_to_guess) {
                System.out.println("The number is greater than x.\n");
            }
            // Correct guess
            else {
                System.out.println("\nYou successfully guessed the number!");
                correct = true;
            }
            number_of_trials--;
        }
        // Output if out of trials
        if (!correct) {
            System.out.println("You have exhausted your trials.");
        }
    }

    public static void main(String[] arg) {
        // Generate the numbers
        int number_to_guess = 1 + (int)(50 * Math.random()); // the random number y to guess
        int number_of_trials = 10; // the total times of trials

        // start guessing
        guessingNumberGame(number_to_guess, number_of_trials);
    }
}