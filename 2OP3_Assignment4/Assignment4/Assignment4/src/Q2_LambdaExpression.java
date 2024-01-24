/* Assignment 4 (100 marks in total; 5% of the final score of this course)
 *
 * Question 2 (20 marks)
 *
 * Use a "subroutine" and a lambda expression to implement function
 * f(x,y) = sqrt(x*x-y*y), both x and y are real numbers.
 * Meanwhile, your code can throw an IllegalException (custom run-time exception,
 * which can be one provided by Java) if the value of (x*x-y*y) is negative.
 *
 * INPUT: the value of x and y (user input)
 * OUTPUT: the value of sqrt(x*x-y*y)
 *
 * Note: output must be displayed using four significant digits after decimal point.
 *
 */

import java.util.Scanner;

public class Q2_LambdaExpression {
    /* place your subroutine code here */

    public interface twoInt{
        double calc(float a, float b);
    }

    static void calcLambda(float a, float b, twoInt function) {
        double result = function.calc(a,b);
        System.out.printf("\nThe value is %.4f",result);
    }

    // Define an object of twoInt that contains a calc subroutine
    static twoInt function = (x,y)->{return Math.sqrt(x*x-y*y);};

    public static void main(String[] args){
        /* place your code to run your subroutine here */

        // Set up and ask for user input
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter x: ");
        float x = myScanner.nextFloat();
        System.out.print("Enter y: ");
        float y = myScanner.nextFloat();

        // Throw exception if inside square root is negative
        if (x*x-y*y < 0) {
            throw new ArithmeticException("ArithmeticException -> The value of (x*x-y*y) is negative.");
        }
        // Otherwise call subroutine
        else {
            calcLambda(x,y,function);
        }
    }
}
