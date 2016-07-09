/**
 * 
 */

/**
 * (Algebra: quadratic equations) Design a class named
 * QuadraticEquation for a quadratic equation ax2 + bx + c = 0.
 * The class contains:
 * 		-Private data fields a, b, and c that represent three coefficients.
 * 		-A constructor for the arguments for a, b, and c.
 * 		-Three getter methods for a, b, and c.
 * 		-A method named getDiscriminant() that returns the discriminant,
 * 			which is b2 - 4ac.
 * 		-The methods named getRoot1() and getRoot2() for returning
 * 			two roots of the equation
 * 
 * These methods are useful only if the discriminant is nonnegative.
 * Let these methods return 0 if the discriminant is negative.
 * Draw the UML diagram for the class and then implement the class.
 * Write a test program that prompts the user to enter values for a, b, and c
 * and displays the result based on the discriminant.
 * If the discriminant is positive, display the two roots.
 * If the discriminant is 0, display the one root.
 * Otherwise, display “The equation has no roots.”
 * See Programming Exercise 3.1 for sample runs.
 * 
 * Hint: No UML required.
 * 
 * @author Kris
 * @version 1.0
 * @since 07-04-2016
 *
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//prompt user for a, b, c values of quadratic equation, record as variables
		System.out.print("(Quadratic Calculator) Enter values for a, b and c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		//create QuadraticEquation object
		QuadraticEquation equation = new QuadraticEquation(a, b, c);
		
		//display result with correct logic and roots.
		if(equation.getDiscriminant() > 0){
			System.out.printf("This equation has 2 roots. Root 1 is %.5f and Root 2 is %.5f\n", equation.getRoot1(), equation.getRoot2());
		}else if(equation.getDiscriminant() == 0){
			System.out.printf("This equation has 1 root. Root 1 is %.5f\n", equation.getRoot1());
		}else{
			System.out.println("The equation has no roots.");
		}
		
		input.close();
	}

}
