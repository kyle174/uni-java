/* Assignment 3 (100 marks in total; 5% of the final score of this course)
 *
 * Question 3 (30 marks)

Many companies use telephone numbers like 555-GET-Food so the number is easier for their customers to remember.
On a standard telephone, the alphabetic letters are mapped to numbers in the following fashion:

A, B, and C = 2
D, E, and F = 3
G, H, and I = 4
J, K, and L = 5
M, N, and O = 6
P, Q, R, and S = 7
T, U, and V = 8
W, X, y, and Z = 9
Write an application that asks the user to enter a 10-character telephone number in the format XXX-XXX-XXXX.
The application should display the telephone number with any alphabetic characters that appeared in the original
translated to their numeric equivalent.

Example: if the user enters 555GETFOOD the application should display 555-438-3663.
*

 */

import java.util.Scanner;

public class Q3_AlphabeticPhoneNumber {
    private static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        System.out.print("Enter The Phone Number (With Letters): ");
        String initial_phone_number = input.nextLine();

        initial_phone_number = initial_phone_number.toUpperCase();
        long phone_number_final = full_number(initial_phone_number);

        System.out.printf("%nOutput phone number for '%s' is '%s'",
                initial_phone_number, phone_number_final);
    }

    public static long full_number(String initial_phone_number)
    {
        // Use long instead of int for 'number' if the string will be longer than max int value
        // 2147483647, which is '10 digits'
        long number = 0; // 'number' is the digital phone number to compute from the initial alphabetic phone number.

        /* place your code here */

        // Initialize variable
        String newNumber = "";

        // Loop through each letter/number
        for (int i=0; i<initial_phone_number.length(); i++) {
            char value = initial_phone_number.charAt(i);

            // Convert corresponding letters to numbers
            if (value == 'A' || value == 'B' || value == 'C') {
                newNumber += 2;
            }
            else if (value == 'D' || value == 'E' || value == 'F') {
                newNumber += 3;
            }
            else if (value == 'G' || value == 'H' || value == 'I') {
                newNumber += 4;
            }
            else if (value == 'J' || value == 'K' || value == 'L') {
                newNumber += 5;
            }
            else if (value == 'M' || value == 'N' || value == 'O') {
                newNumber += 6;
            }
            else if (value == 'P' || value == 'Q' || value == 'R' || value == 'S') {
                newNumber += 7;
            }
            else if (value == 'T' || value == 'U' || value == 'V') {
                newNumber += 8;
            }
            else if (value == 'W' || value == 'X' || value == 'Y' || value == 'Z') {
                newNumber += 9;
            }
            // Keep the same if it is already a number
            else {
                newNumber += value;
            }
        }
        // Convert string to long
        number = Long.parseLong(newNumber);

        // Return actual number only at the end of the function
        return number;

    }// End of full_number function
}
