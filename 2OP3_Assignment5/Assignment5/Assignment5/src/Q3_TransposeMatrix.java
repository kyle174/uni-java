/* Assignment 5 (100 marks in total; 5% of the final score of this course)
 *
 * Question 3 (30 marks)
 *
 * Write a java program to compute the transpose of a user input matrix,
 * whose elements are all integers.
 *
 * Converting rows of a matrix into columns and columns of a matrix into
 * row is called transpose of a matrix.
 *
 * INPUT: user input matrix (2D array).
 * OUTPUT: the transpose of input matrix.
 *
 * Note: considering how to take users' input, you can set some rules
 * (give users some hints) to make your code user-friendly.
 * User will follow your instruction to input test example.
 *
 * Example:
 * INPUT: 4  6  8
 *        5  8  9
 *        2  1  8
 *
 * OUTPUT: 4  5  2
 *         6  8  1
 *         8  9  8
 *
 */
import java.util.*;

public class Q3_TransposeMatrix {
    /* place your subroutine code here */
    public static int[][] transpose(int[][] matrix) {
        // Initialize transpose matrix and variables
        int transRows = matrix[0].length;
        int transCols = matrix.length;
        int [][] transpose = new int[transRows][transCols];

        // Loop through original matrix
        for (int i=0; i<transRows; i++) {
            for (int j=0; j<transCols; j++) {
                // Swap rows and columns in transpose matrix
                transpose[i][j] = matrix[j][i];
            }
        }
        return transpose;
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
        int[][] matrix = new int[rows][cols];

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
                    matrix[i][index] = Integer.parseInt(input);
                    index++;
                }
            }
        }
        // Display input matrix
        System.out.println("INPUT: ");
        for (int k=0; k<rows; k++) {
            System.out.println(Arrays.toString(matrix[k]));
        }
        // Call subroutine
        int[][] result = transpose(matrix);
        // Display transpose of matrix
        System.out.println("\nOUTPUT: ");
        for (int k=0; k<cols; k++) {
            System.out.println(Arrays.toString(result[k]));
        }
    }
}
