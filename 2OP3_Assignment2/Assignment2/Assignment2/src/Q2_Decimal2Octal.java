/* Assignment 2 (100 marks in total; 5% of the final score of this course)
 *
 * Question 2 (20 marks)
    Write a Java program to convert a decimal number to octal number.

    Decimal number: The decimal numeral system is the standard system for denoting integer and non-integer numbers. It is also called base-ten positional numeral system.
    Octal number: The octal numeral system is the base-8 number system, and uses the digits 0 to 7.


 * INPUT: a user input decimal number x
 * OUTPUT: an octal number y converted from x

* Hint: For a decimal number x=1256, the corresponding octal number is y=2350.
 */

import java.util.Scanner;

public class Q2_Decimal2Octal {
    public static void main(String[] args) {
        /* place your code here */
        // Setup user input and ask for decimal number
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        double x = myScanner.nextDouble();

        // Initialize variables
        String y = "";
        int remainder;

        // Catch the case when x = 0
        if (x == 0) {
            y = "0";
        }
        else {
            // Loop until quotient is less than one
            while (x >= 1) {
                // Concatenate remainder to the front and divide to repeat
                remainder = (int) (x % 8);
                y = remainder + y;
                x = x / 8;
            }
        }

        // Output result
        System.out.println("Octal Number: "+y);

    }
}
