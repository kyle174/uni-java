/* Assignment 5 (100 marks in total; 5% of the final score of this course)
 *
 * Question 2 (30 marks)
 *
 * Write a subroutine, user input an 1D array of integers and an integer target,
 * return indices of the two numbers such that they add up to target.
 *
 * INPUT: user input array and target
 * OUTPUT: the indices of the two numbers such that they add up to target.
 *
 * The array and target are parameters to the subroutine.
 * User can get hint to input array and target number, respectively.
 *
 * Keep the input format in the example and make your code user-friendly.
 *
 * Example:
 * INPUT: [2,7,11,15], 9
 * OUTPUT: [0,1]
 *
 */

import java.util.*;

public class Q2_TwoSum {
    /* place your subroutine code here */
    public static int[] findSum(int[] list, int target, int count) {
        int[] twoSum = new int[2];
        // Loop through array to check every combination of numbers
        for (int i=0; i<count; i++) {
            for (int j=1; j<count; j++) {
                // Found two valid numbers
                if (list[i]+list[j]==target && i != j) {
                    twoSum[0] = i;
                    twoSum[1] = j;
                }
            }
        }
        return twoSum;
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
        // Ask user for target sum
        System.out.print("Enter target: ");
        int target = myScanner.nextInt();

        // Call subroutine and print array of result
        int[] result = findSum(myArray, target, counter);
        if (result[0] == 0 && result[1] == 0) {
            System.out.print("No valid result!");
        }
        else {
            Arrays.sort(result);
            System.out.print("Result: "+Arrays.toString(result));
        }
    }
}
