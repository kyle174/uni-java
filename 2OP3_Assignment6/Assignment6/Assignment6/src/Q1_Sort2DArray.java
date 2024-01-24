/* Assignment 6 (100 marks in total; 5% of the final score of this course)
 *
 * Question 1 (20 marks)
 *
 * Write a java program, use "subroutine" to finish sorting a 2-dimension array.
 *
 * User input a 2-dimension array of double type, return it in non-decreasing
 * order according to values in the first raw, if there are two or more same
 * element in the first raw, keep the original sequence.
 *
 * INPUT: a user input 2-dimension array.
 * OUTPUT: sorted input array in non-decreasing order according to values in the first row.
 *
 * Note: considering how to take users' input, you can set some rules (give users some hints)
 * to make your code user-friendly.
 * User will follow your instruction to input test example.
 *
 * Example 1
 * INPUT: if user input array (Order 2*4) is
 *        1.45  0.25  8.95  0.99
 *        2.56  5.67  0.47  2.65
 *
 * OUTPUT: 0.25  0.99  1.45  8.95
 *         5.67  2.65  2.56  0.47
 *
 * Example 2
 * INPUT: if user input array (Order 5*5) is
 *        0.95  0.23  0.95  0.95  0.65
 *        2.56  5.67  0.47  2.65  0.47
 *        1.45  0.25  8.95  0.99  0.67
 *        5.67  2.65  0.25  8.95  0.99
 *        1.23  4.21  0.97  7.64  8.52
 *
 * OUTPUT: 0.23  0.65  0.95  0.95  0.95
 *         5.67  0.47  2.56  0.47  2.65
 *         0.25  0.67  1.45  8.95  0.99
 *         2.65  0.99  5.67  0.25  8.95
 *         4.21  8.52  1.23  0.97  7.64
 *
 */

import java.util.Arrays;
import java.util.Scanner;

public class Q1_Sort2DArray {
    /* place your subroutine code here */
    public static double[][] sortArr(double[][] array) {
        // Initialize variables
        int rows = array.length;
        int cols = array[0].length;
        boolean done = false;
        double temp;

        // Loop while not sorted
        while (!done) {
            done = true;
            // Loop through every element
            for (int i = 0; i < cols-1; i++) {
                // Check if "neighbouring" elements are incorrectly placed
                if (array[0][i] > array[0][i + 1]) {
                    // Switch positions in every row if so
                    for (int j=0; j<rows; j++) {
                        temp = array[j][i];
                        array[j][i] = array[j][i + 1];
                        array[j][i + 1] = temp;
                    }
                    done = false;
                }
            }
        }
        return array;
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
        double[][] array = new double[rows][cols];

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
                    array[i][index] = Double.parseDouble(input);
                    index++;
                }
            }
        }
        // Display input array
        System.out.println("INPUT: ");
        for (int k=0; k<rows; k++) {
            System.out.println(Arrays.toString(array[k]));
        }
        // Call subroutine
        double[][] result = sortArr(array);
        // Display sorted array
        System.out.println("\nOUTPUT: ");
        for (int k=0; k<rows; k++) {
            System.out.println(Arrays.toString(result[k]));
        }

    }
}
