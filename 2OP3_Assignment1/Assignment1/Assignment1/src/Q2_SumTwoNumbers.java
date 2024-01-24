/* Assignment 1 (100 marks in total; 5% of the final score of this course) 
 * 
 * Question 2 (20 marks)
 * 
 * Write a Java program to print the sum of two user input integer numbers.
 * Also submit a screenshot to demonstrate that you have successfully ran
 * javac and java commandline to compile and run the code of Q1_HelloWorld.java
 * 
 * INPUT: two user input integer numbers
 * OUTPUT: the sum of the two user input integer numbers
 * 
 * Hint1: you may use java.util.Scanner to take user input numbers.
 * 
 */

import java.util.Scanner;

public class Q2_SumTwoNumbers {
	/* Place your code here */
	public static void main(String[] args) {
		// Setup user input
		Scanner myScanner = new Scanner(System.in);

		// Ask user for two numbers
		System.out.print("Enter the first number: ");
		int num1 = myScanner.nextInt();
		System.out.print("Enter the second number: ");
		int num2 = myScanner.nextInt();

		// Sum the numbers
		int sum = num1+num2;

		// Output sum of numbers
		System.out.println("The sum of the two numbers is "+sum);

	}
}
