/* Assignment 1 (100 marks in total; 5% of the final score of this course) 
 * 
 * Question 4 (20 marks)
 * 
 * Write a Java program to print the area and perimeter of a circle.
 * Also submit a screenshot to demonstrate that you have successfully ran
 * javac and java commandline to compile and run the code of Q1_HelloWorld.java
 * 
 * INPUT: radius input by a user.
 * OUTPUT: the area and the perimeter of the circle defined by the radius. All results must use two significant digits after decimal point.
 * 
 * Hint: you may use java.util.Scanner to take user input real valued radius.
 * 
 */

import java.util.Scanner;

public class Q4_AreaOfCircle {
	/* Place your code here */
	public static void main(String[] args) {
		// Setup user input
		Scanner myScanner = new Scanner(System.in);

		// Ask user for radius
		System.out.print("Enter radius: ");
		double radius = myScanner.nextDouble();

		// Calculate area and circumference
		double pi = 3.14159;
		double area = pi*radius*radius;
		double circumference = 2*pi*radius;

		// Output area and circumference
		System.out.printf("The area of the circle is %.2f \n",area);
		System.out.printf("The circumference of the circle is %.2f",circumference);







	}
}
