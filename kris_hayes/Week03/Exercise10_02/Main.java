/**
 * 
 */

/**
 * @author Kris
 *
 */
public class Main {

	/**
	Hints for 10.2: The BMI class MUST be in a separate file
	from the main program, and MUST follow exactly the public
	interface conventions used in the book!  I will be testing
	YOUR class with MY main program (which is typical in a large
	project for one person to write a class and another to write
	the class that uses the class).  Use the code on pages 371
	and 372 of your text and DO NOT make gratuitous changes!
	 */
	public static void main(String[] args) {
		BMI bmi = new BMI( "Orville", 63, 185, 5, 6 );
		System.out.printf( "Ht=%3.1f feet, Wt=%2.0f pounds, Age=%1d years, BMI=%4.1f; %s is %s.%n", 
			bmi.getHeight(), bmi.getWeight(), bmi.getAge(), bmi.getBMI(), bmi.getName(), bmi.getStatus() );

		bmi = new BMI( "Princess", 60, 149, 4, 11 );
		System.out.printf( "Ht=%3.1f feet, Wt=%2.0f pounds, Age=%1d years, BMI=%4.1f; %s is %s.%n", 
			bmi.getHeight(), bmi.getWeight(), bmi.getAge(), bmi.getBMI(), bmi.getName(), bmi.getStatus() );

		bmi = new BMI( "Kim", 29, 130, 5, 1 );
		System.out.printf( "Ht=%3.1f feet, Wt=%2.0f pounds, Age=%1d years, BMI=%4.1f; %s is %s.%n", 
			bmi.getHeight(), bmi.getWeight(), bmi.getAge(), bmi.getBMI(), bmi.getName(), bmi.getStatus() );

		bmi = new BMI( "Adam", 19, 117, 5, 7 );
		System.out.printf( "Ht=%3.1f feet, Wt=%2.0f pounds, Age=%1d years, BMI=%4.1f; %s is %s.%n", 
			bmi.getHeight(), bmi.getWeight(), bmi.getAge(), bmi.getBMI(), bmi.getName(), bmi.getStatus() );

		bmi = new BMI( "Zachariah", 19, 119, 5, 7 );
		System.out.printf( "Ht=%3.1f feet, Wt=%2.0f pounds, Age=%1d years, BMI=%4.1f; %s is %s.%n", 
			bmi.getHeight(), bmi.getWeight(), bmi.getAge(), bmi.getBMI(), bmi.getName(), bmi.getStatus() );

	}
}
