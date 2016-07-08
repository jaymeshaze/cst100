/**
 * 
 */

/**
 * Exercise 3.3:
 * (Algebra: solve 2 * 2 linear equations) A linear equation can be
 * solved using Cramer’s rule given in Programming Exercise 1.13.
 * Write a program that prompts the user to enter a, b, c, d, e, and f
 * and displays the result (x= and y=).
 * If ad - bc is 0, report that “The equation has no solution.”
 * 
 * @author Kris
 * @version 1.0
 * @since 06-21-2016
 */

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create Scanner
		Scanner input = new Scanner(System.in);
		
		//create variables for Cramer's Rule
		double x, y, a, b, c, d, e, f;
		
		//Prompt user to enter variables of linear equation
		System.out.print("Enter a, b, c, d, e, f: ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		d = input.nextDouble();
		e = input.nextDouble();
		f = input.nextDouble();
		
		//check to see if ad - bc is 0, true=display no solution; false=display solution.
		if (((a * d) - (b * c)) == 0){
			System.out.println("The equation has no solution.");
		}else{
			x = (((e * d) - (b * f)) / ((a * d) - (b * c)));
			y = (((a * f) - (e * c)) / ((a * d) - (b * c)));
			
			System.out.printf("x is %4.1f and y is %4.1f", x, y);

		}

		input.close();
	}

}
