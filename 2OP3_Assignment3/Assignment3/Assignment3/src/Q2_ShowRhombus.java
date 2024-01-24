/* Assignment 3 (100 marks in total; 5% of the final score of this course)
 *
 * Question 2 (20 marks)
    Write a java program to display the number rhombus structure.

 * INPUT: user input integer value: n
 * The input should be fed into a subroutine as parameter.
 *
 * OUTPUT: the rhombus structure corresponding to n. (see the following example)
 * Your subroutine should directly print the result and do not return anything.

*
* Example:
* For n=7, the rhombus structure is:
      1
     212
    32123
   4321234
  543212345
 65432123456
7654321234567
 65432123456
  543212345
   4321234
    32123
     212
      1

* For n=3, the rhombus structure is:
  1
 212
32123
 212
  1

 */

import java.util.Scanner;

public class Q2_ShowRhombus {
    /* place your subroutine code here */
    public static void createRhombus(int n) {
        // Initialize number of spaces
        int spcs = n-1;

        // Upper half of rhombus
        for (int i=1; i<=n; i++) {

            // Add spaces before, decrement each time
            for (int k=spcs; k>0; k--) {
                System.out.print(" ");
            }
            spcs--;

            // Output numbers counting down
            for (int k=i; k>0; k--) {
                System.out.print(k);
            }
            // Output numbers counting up
            for (int j=2; j<=i; j++) {
                System.out.print(j);
            }
            // Go to new line
            System.out.println();
        }

        // Reset number of spaces
        spcs = 1;

        // Lower half of rhombus
        for (int i=n-1; i>0; i--) {

            // Add spaces before, increment each time
            for (int k=spcs; k>0; k--) {
                System.out.print(" ");
            }
            spcs++;

            // Output numbers counting down
            for (int k=i; k>0; k--) {
                System.out.print(k);
            }
            // Output numbers counting up
            for (int j=2; j<=i; j++) {
                System.out.print(j);
            }
            // Go to new line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        /* place your code to run your subroutine here */

        // Setup user input
        Scanner myScanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter n: ");
        int n = myScanner.nextInt();

        // Call subroutine
        createRhombus(n);
    }
}
