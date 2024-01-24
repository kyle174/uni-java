/* Assignment 4 (100 marks in total; 5% of the final score of this course)
 *
 * Question 5 (20 marks)
 *
 * Write a java program to convert Roman numbers to integer.
 * Roman numerals are represented by seven different symbols:
 * I, V, X, L, C, D and M
 *
 * Symbol   Value
 *   I        1
 *   V        5
 *   X        10
 *   L        50
 *   C        100
 *   D        500
 *   M        1000
 *
 * For example, 2 is written as II in Roman numeral, just two one's added together.
 * 12 is written as XII, which is simply X + II.
 * The number 27 is written as XXVII, which is XX + V + II.
 *
 * Roman numerals are usually written largest to smallest from left to right.
 * However, the numeral for four is not IIII. Instead, the number four is written
 * as IV. Because the one is before the five we subtract it making four.
 * The same principle applies to the number nine, which is written as IX.
 * There are six instances where subtraction is used:
 *  I can be placed before V (5) and X (10) to make 4 and 9.
 *  X can be placed before L (50) and C (100) to make 40 and 90.
 *  C can be placed before D (500) and M (1000) to make 400 and 900.
 *
 * Input: Roman number (user input, string type)
 * Output: print out corresponding integer
 *
 * Example: if the user enters 'LVIII', the program should output 'LVIII -> 58'
 *
 */

import java.util.Scanner;
public class Q5_Roman2Integer {
    /* place your subroutine code here */
    public static int calcValue(String romanVal) {

        // Initialize variables
        char[] romanArr = new char[romanVal.length()];
        int result = 0;

        // Add each letter to its own array element
        for (int i=0; i<romanVal.length(); i++) {
            romanArr[i] = romanVal.charAt(i);
        }

        // Loop through array of letters
        for (int j=0; j<romanArr.length; j++) {
            if (romanArr[j] == 'I') {
                result+=1;
            }
            else if (romanArr[j] == 'V') {
                // If there was an I before, result is +4 (1 from before + 3 now)
                if (j>0 && romanArr[j-1] == 'I') {
                    result+=3;
                }
                // Otherwise +5
                else {
                    result+=5;
                }
            }
            else if (romanArr[j] == 'X') {
                // If there was an I before, result is +9 (1 from before + 8 now)
                if (j>0 && romanArr[j-1] == 'I') {
                    result+=8;
                }
                // Otherwise +10
                else {
                    result+=10;
                }
            }
            else if (romanArr[j] == 'L') {
                // If there was an X before, result is +40 (10 from before + 30 now)
                if (j>0 && romanArr[j-1] == 'X') {
                    result+=30;
                }
                // Otherwise +50
                else {
                    result+=50;
                }
            }
            else if (romanArr[j] == 'C') {
                // If there was an X before, result is +90 (10 from before + 80 now)
                if (j>0 && romanArr[j-1] == 'X') {
                    result+=80;
                }
                // Otherwise +100
                else {
                    result+=100;
                }
            }
            else if (romanArr[j] == 'D') {
                // If there was a C before, result is +400 (100 from before + 300 now)
                if (j>0 && romanArr[j-1] == 'C') {
                    result+=300;
                }
                // Otherwise +500
                else {
                    result+=500;
                }
            }
            else if (romanArr[j] == 'M') {
                // If there was a C before, result is +900 (100 from before + 800 now)
                if (j>0 && romanArr[j-1] == 'C') {
                    result+=800;
                }
                // Otherwise +1000
                else {
                    result+=1000;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        /* place your code to run your subroutine here */

        // Set up and ask for user input
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter roman numeral: ");
        String romanInput = myScanner.next().toUpperCase();

        // Call subroutine and print result
        System.out.println(romanInput+" -> "+calcValue(romanInput));
    }
}
