/* Assignment 2 (100 marks in total; 5% of the final score of this course)
 *
 * Question 3 (20 marks)
    Write a Java program that accepts an integer (n, 0 <= n <= 9) and computes the value of n+nn+nnn.

 * INPUT: a user input integer n
 * OUTPUT: the value of n+nn+nnn.

* Hint: For n=2, the output is 2+22+222=246
 */

import java.util.Scanner;

public class Q3_PlayWithInteger {
    public static void main(String[] args) {
        /* place your code here */
        // Setup user input and ask for n
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = myScanner.nextInt();

        // Calculate result
        int value = n + (11*n) + (111*n);

        // Output result
        System.out.println("The result is "+value);





    }
}
