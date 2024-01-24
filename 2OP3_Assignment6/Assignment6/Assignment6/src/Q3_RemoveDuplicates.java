/* Assignment 6 (100 marks in total; 5% of the final score of this course)
 *
 * Question 3 (20 marks)
 *
 * Write a Java program, user input a 1-dimension array of integers, firstly
 * sorting it in non-increasing order, and then remove the duplicates in the
 * array (if exists).
 *
 * INPUT: user input a 1-dimension array.
 * OUTPUT: sorted array in non-increasing order, and without any repeating element.
 *
 * Note: You must write sort algorithm by yourself, you are not supposed to
 * use Arrays.sort() to output the result directly.
 *
 * Hint: you can use bubble sorting algorithm or other sorting algorithms.
 *
 * Keep the input format in the example and make your code user-friendly.
 *
 * Example 1:
 * INPUT: [0, 1, 1, 0, 1, 2, 2, 3, 3, 4]
 * OUTPUT: [4, 3, 2, 1, 0]
 *
 * Example 2:
 * INPUT: [7, 0, 4, 2, 9]
 * OUTPUT: [9, 7, 4, 2, 0]
 *
 */

import java.util.*;

public class Q3_RemoveDuplicates {
    /* place your subroutine code here */
    public static ArrayList<Integer> remDupes(ArrayList<Integer> intArr) {
        // Initialize variables
        boolean done = false;
        int temp;
        ArrayList<Integer> newArr = new ArrayList<Integer>();

        // Loop while not sorted
        while (!done) {
            done = true;
            // Loop through every number
            for (int i = 0; i < intArr.size()-1; i++) {
                // Check if "neighbouring" numbers are incorrectly placed
                if (intArr.get(i) < intArr.get(i + 1)) {
                    temp = intArr.get(i);
                    intArr.set(i, intArr.get(i+1));
                    intArr.set(i+1, temp);
                    done = false;
                }
            }
        }
        // Add non-duplicates to new list
        for (Integer num : intArr) {
            if (!newArr.contains(num)) {
                newArr.add(num);
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        /* place your code to run your subroutine here */
        // Initialize scanner, array and variables
        Scanner myScanner = new Scanner(System.in);
        ArrayList<Integer> intArr = new ArrayList<Integer>();
        boolean done = false;

        System.out.print("Enter values separated by a space and end with \"end\": ");
        // Loop until user types end
        while (!done) {
            String input = myScanner.next();
            if (input.equals("end")) {
                done = true;
            }
            // Add user input to array
            else {
                intArr.add(Integer.parseInt(input));
            }
        }
        // Display input array
        System.out.println("INPUT: ");
        for (int num : intArr) {
            System.out.print(num + " ");
        }
        // Call subroutine
        ArrayList<Integer> result = remDupes(intArr);
        // Display output array
        System.out.println("\nOUTPUT: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
