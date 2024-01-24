/* Assignment 2 (100 marks in total; 5% of the final score of this course)
 *
 * Question 1 (20 marks)
    Write a Java program to find the value of following expression.
    a) (101 + 0) / 3
    b) 3.0e-6 * 10000000.1
    c) true && true
    d) false && true
    e) (false && false) || (true && true)
    f) (false || false) && (true && true)

 * INPUT: n/a
 * OUTPUT: the value of each of the above expressions.

 */


public class Q1_ExpressionSolution {
    public static void main(String[] args) {
        /* Place your code here */
        // Calculate value of each expression
        double expression1 = (double) (101 + 0) / 3;
        double expression2 = 3.0e-6 * 10000000.1;
        boolean expression3 = true && true;
        boolean expression4 = false && true;
        boolean expression5 = (false && false) || (true && true);
        boolean expression6 = (false || false) && (true && true);

        // Output value of each expression
        System.out.println("The value of (101 + 0) / 3 is "+expression1);
        System.out.println("The value of 3.0e-6 * 10000000.1 is "+expression2);
        System.out.println("The value of true && true is "+expression3);
        System.out.println("The value of false && true is "+expression4);
        System.out.println("The value of (false && false) || (true && true) is "+expression5);
        System.out.println("The value of (false || false) && (true && true) is "+expression6);
    }
}
