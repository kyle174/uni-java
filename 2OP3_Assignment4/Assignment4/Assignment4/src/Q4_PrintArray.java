/* Assignment 4 (100 marks in total; 5% of the final score of this course)
 *
 * Question 4 (20 marks)
 *
 * Write a java program to use Method Overloading for printing three types of array:
 * Integer[], Character[] and Double[].
 *
 * Input: None.
 * Output: print out different types of array.
 *
 * There is no specific format as long as printed arrays are neatly and cleanly.
 *
 */
public class Q4_PrintArray {
    // creating a method for printing integer array
    /* place your code here */
    public static void printArr(Integer[] intArr) {
        System.out.print("Integer Array: ");
        // Loop through array
        for (int i=0; i<intArr.length; i++) {
            System.out.print(intArr[i]);
            // Add commas between and end with period
            if (i==(intArr.length-1)) {
                System.out.print(".\n");
            }
            else {
                System.out.print(", ");
            }
        }
    }
    // overloading the above created method with different parameter method
    // contains a character parameter
    /* place your code here */
    public static void printArr(Character[] intArr) {
        System.out.print("Character Array: ");
        // Loop through array
        for (int i=0; i<intArr.length; i++) {
            System.out.print(intArr[i]);
            // Add commas between and end with period
            if (i==(intArr.length-1)) {
                System.out.print(".\n");
            }
            else {
                System.out.print(", ");
            }
        }
    }
    // overloading the above created method with different parameter method
    // contains a double parameter
    /* place your code here */
    public static void printArr(Double[] intArr) {
        System.out.print("Double Array: ");
        // Loop through array
        for (int i=0; i<intArr.length; i++) {
            System.out.print(intArr[i]);
            // Add commas between and end with period
            if (i==(intArr.length-1)) {
                System.out.print(".\n");
            }
            else {
                System.out.print(", ");
            }
        }
    }
    public static void main(String[] args) {
        Integer[] iarr = {1,2,3,4,5};
        Character[] carr = {'A','B','C','D','E'};
        Double[] darr = {1.234, 2.345, 3.456, 4.567};

        // calling the methods and printing the arrays
        /* place your code here */

        // Call overloaded subroutine
        printArr(iarr);
        printArr(carr);
        printArr(darr);
    }
}
