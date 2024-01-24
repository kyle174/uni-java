/* Assignment 6 (100 marks in total; 5% of the final score of this course)
 *
 * Question 4 (20 marks)
 *
 * Write a complete static method that finds the largest value in a 2-dimension array of ints.
 * The method should have one parameter, which is a 2d array of type int. The largest number
 * in the array should be returned as the value of the method.
 *
 * INPUT: user input a 2-dimension array of type int
 * OUTPUT: the largest number in input array
 *
 * Note: considering how to take users' input, you can set some rules (give users some hints)
 * to make your code user-friendly.
 * User will follow your instruction to input test example.
 *
 * Example:
 * Input: 4  6  8
 *        5  8  9
 *        2  1  8
 * Output: 9
 *
 */

import java.util.Arrays;
import java.util.Scanner;

public class Q4_GetMax {
    /* place your code here */
    public static int findMax(int[][] array) {
        // Initialize variables
        int rows = array.length;
        int cols = array[0].length;
        int max = array[0][0];
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        /* place your code to run your subroutine here */
        // Initialize scanner and variables
        boolean done;
        int index;
        Scanner myScanner = new Scanner(System.in);

        // Ask user for number of rows/cols and initialize array
        System.out.print("Enter number of rows: ");
        int rows = myScanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = myScanner.nextInt();
        int[][] array = new int[rows][cols];

        // Ask user for every row
        for (int i=0; i<rows; i++) {
            System.out.print("Enter values of row "+(i+1)+" separated by a space and end with \"end\": ");
            done = false;
            index = 0;
            // Loop until user types end
            while (!done) {
                String input = myScanner.next();
                if (input.equals("end")) {
                    done = true;
                }
                // Add user input to array
                else {
                    array[i][index] = Integer.parseInt(input);
                    index++;
                }
            }
        }
        // Display input array
        System.out.println("INPUT: ");
        for (int j=0; j<rows; j++) {
            System.out.println(Arrays.toString(array[j]));
        }
        // Call subroutine
        int result = findMax(array);
        // Display max value
        System.out.println("OUTPUT: \n"+result);
    }
}
