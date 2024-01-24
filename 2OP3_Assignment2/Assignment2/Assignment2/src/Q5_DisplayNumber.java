/* Assignment 2 (100 marks in total; 5% of the final score of this course)
 *
 * Question 5 (20 marks)
    Write a program in Java to display (i.e. print) the pattern like right angle triangle with a number.

 * INPUT: an integer number n
 * OUTPUT: print a right angle triangle corresponding to n

 * Example1: for n=3, the right angle triangle should be:
    1
    12
    123

 * Example2: for n=5, the right angle triangle should be:
    1
    12
    123
    1234
    12345

 */

import java.util.Scanner;

public class Q5_DisplayNumber {
    public static void main(String[] args) {
        /* place your code here */
        // Setup user input and ask for n
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = myScanner.nextInt();

        // Loop n times for each row
        for (int i=1; i<=n; i++) {
            // Go to new line for each new row
            if (i>1) {
                System.out.println();
            }
            // Output the numbers 1 to k
            for (int k=1; k<=i; k++) {
                System.out.print(k);
            }
        }

    }
}
