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
public class QuadraticEquation {
	private double a;
	private double b;
	private double c;

	QuadraticEquation(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	//setter methods
	public void setA(double a){
		this.a = a;
	}
	
	public void setB(double b){
		this.b = b;
	}
	
	public void setC(double c){
		this.c = c;
	}
	//getter methods
	public double getA(){
		return a;
	}
	
	public double getB(){
		return b;
	}
	
	public double getC(){
		return c;
	}
	//calculate discriminant
	public double getDiscriminant(){
		double discriminant = (Math.pow(b, 2) - (4 * a * c));
		return discriminant;
	}
	//calculate + root
	public double getRoot1(){
		if (getDiscriminant() < 0)
			return 0;
		else
			return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
	}
	//calculate - root
	public double getRoot2(){
		if (getDiscriminant() < 0)
			return 0;
		else
			return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
	}


}

