/* Assignment 1 (100 marks in total; 5% of the final score of this course) 
 * 
 * Question 3 (20 marks)
 * 
 * Write a Java program to print the result of first user input real number divided by the second user input real number.
 * Also submit a screenshot to demonstrate that you have successfully ran
 * javac and java commandline to compile and run the code of Q1_HelloWorld.java
 *
 * INPUT: user input real number x, and user input real number y
 * OUTPUT: the result of x divided y. (The result should be printed with two significant digits after the decimal point.)
 * 
 * Hint1: you may use java.util.Scanner to take user input real numbers.
 * Hint2: you may use format string of System.out.printf() when printing the result.
 * 
 */

import java.util.Scanner;

public class Q3_DivideTwoNumbers {
	/* Place your code here */
	public static void main(String[] args) {
		// Setup user input
		Scanner myScanner = new Scanner(System.in);

		// Ask user for two numbers
		System.out.print("Enter x: ");
		float x = myScanner.nextFloat();
		System.out.print("Enter y: ");
		float y = myScanner.nextFloat();

		// Divide the numbers
		float quotient = x/y;

		// Output product of numbers rounded to 2 decimals
		System.out.printf("The quotient of the two values is %.2f",quotient);
	}
}
