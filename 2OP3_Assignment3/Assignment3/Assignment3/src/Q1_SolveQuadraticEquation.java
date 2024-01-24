/* Assignment 3 (100 marks in total; 5% of the final score of this course)
 *
 * Question 1 (20 marks)
    Write a Java program, use 'subroutine', 'if', 'else if' and 'else' to solve a quadratic equation in the following form:

    a*x^2 + b*x + c = 0

 * INPUT: user input real valued coefficients: a, b, c.
 * These inputs should be fed as parameters into a subroutine that you write.
 *
 * OUTPUT: Output the solutions (i.e., roots) to the quadratic function defined by the coefficients a, b and c.
 * If there is no real roots, output: "The equation has no real roots."
 * The above outputs should be produced as a String variable returned by your subroutine.
 *
 * Note: all values must be displayed using two significant digits after decimal point.

*
* Example:
For a=1, b=5 and c=2, the roots are -0.44 and -4.56
 */

import java.util.Scanner;

import static java.lang.Double.NaN;

public class Q1_SolveQuadraticEquation {
    /* place your subroutine code here */
    public static String findRoots(double a, double b, double c) {
        String roots = "Root(s): ";

        // Calculate roots
        double root1 = (-b+Math.pow((Math.pow(b,2))-4*a*c,0.5))/(2*a);
        double root2 = (-b-Math.pow((Math.pow(b,2))-4*a*c,0.5))/(2*a);

        // 1 root
        if (root1 == root2) {
            roots += String.format("%.2f",root1);
        }
        // No roots
        else if (Double.isNaN(root1) || Double.isNaN(root2)) {
            roots = "The equation has no real roots";
        }
        // 2 roots
        else {
            roots += String.format("%.2f",root1) + " and " + String.format("%.2f",root2);
        }

        return roots;
    }

    public static void main(String[] Strings) {
        /* place your code to run your subroutine here */

        // Setup user input
        Scanner myScanner = new Scanner(System.in);

        // Ask user for inputs
        System.out.print("Enter a: ");
        double a = myScanner.nextDouble();
        System.out.print("Enter b: ");
        double b = myScanner.nextDouble();
        System.out.print("Enter c: ");
        double c = myScanner.nextDouble();

        // Output result of subroutine
        System.out.println(findRoots(a,b,c));

    }
}
