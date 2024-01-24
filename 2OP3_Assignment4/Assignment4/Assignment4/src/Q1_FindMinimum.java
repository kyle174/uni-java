/* Assignment 4 (100 marks in total; 5% of the final score of this course)
 *
 * Question 1 (20 marks)
 *
 * Write a Java program, use 'subroutine' to finds the minimum value of
 * the first N elements of an array of type int.
 * Meanwhile, your code can throw an IllegalException (custom run-time
 * exception, which can be one provided by Java) if N is not in the range
 * of the length of input array.
 *
 * Input: user input array and number N.
 * Output: the minimum value of the first N elements of the array.
 *
 * Note: The array and N are parameters to the subroutine.
 * Users will input an array with no specific length.
 *
 */

import java.util.Objects;
import java.util.Scanner;

public class Q1_FindMinimum {
    /* place your subroutine code here */
    public static int findMin(int[] list, int count) {
        int minValue = list[0];
        // Loop through array
        for (int i=1; i<count; i++) {
            // Keep track of lowest value
            if (list[i]<minValue) {
                minValue = list[i];
            }
        }
        return minValue;
    }

    public static void main(String[] args) {
        /* place your code to run your subroutine here */

        // Initialize scanner, array and variables
        Scanner myScanner = new Scanner(System.in);
        int[] myArray = new int[1000];
        boolean done = false;
        int index = 0;
        int counter =0;

        System.out.print("Enter values separated by a space and end with \"end\": ");
        // Loop until user types end
        while (!done) {
            String input = myScanner.next();
            if (input.equals("end")) {
                done = true;
            }
            // Add user input to array
            else {
                myArray[index] = Integer.parseInt(input);
                index++;
                counter++;
            }
        }

        System.out.print("Enter N: ");
        int inputN = myScanner.nextInt();
        // Throw exception if N is out of range
        if (inputN>counter) {
            throw new IndexOutOfBoundsException("IndexOutOfBoundsException -> N is not in the range of the length of input array.");
        }
        // Otherwise call subroutine
        else {
            System.out.println("The minimum value is "+findMin(myArray, inputN));
        }
    }
}


