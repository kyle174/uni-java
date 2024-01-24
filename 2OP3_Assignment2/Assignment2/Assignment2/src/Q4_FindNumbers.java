/* Assignment 2 (100 marks in total; 5% of the final score of this course)
 *
 * Question 4 (20 marks)
    Write a Java program to print integer numbers between 1 to a user input integer n, which are divisible by 3, 5 and by both.

 * INPUT: a user input integer n
 * OUTPUT: all the integer numbers between 1 and n that are either divisible by 3 or by 5 or by both.

* Hint: For n=16, the output should be as follows.
    Divided by 3 -> 3, 6, 9, 12, 15.
    Divided by 5 -> 5, 10, 15.
    Divided by 3 and 5 -> 15.
 */

import java.util.Scanner;

public class Q4_FindNumbers {
    public static void main(String[] args) {
        /* place your code here */
        // Setup user input and ask for n
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = myScanner.nextInt();

        // Loop through 1 to n and check if divisible by 3
        System.out.print("Divided by 3 ->");
        for (int i=1; i<=n; i++) {
            if (i%3 == 0) {
                // Output all possible values
                if (i+3 >= n) {
                    System.out.print(" "+i+".");
                }
                else {
                    System.out.print(" "+i+",");
                }
            }
        }

        // Loop through 1 to n and check if divisible by 5
        System.out.print("\nDivided by 5 ->");
        for (int i=1; i<=n; i++) {
            if (i%5 == 0) {
                // Output all possible values
                if (i+5 >= n) {
                    System.out.print(" "+i+".");
                }
                else {
                    System.out.print(" "+i+",");
                }
            }
        }

        // Loop through 1 to n and check if divisible by 3 and 5
        System.out.print("\nDivided by 3 and 5 ->");
        for (int i=1; i<=n; i++) {
            if (i%3 == 0 && i%5 == 0) {
                // Output all possible values
                if (i+15 >= n) {
                    System.out.print(" "+i+".");
                }
                else {
                    System.out.print(" "+i+",");
                }
            }
        }


    }
}
