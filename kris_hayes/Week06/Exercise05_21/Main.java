/**
 * 
 */

/**
 * (Financial application: compare loans with various interest rates)
 * Write a program that lets the user enter the loan amount and
 * loan period in number of years and displays the monthly and
 * total payments for each interest rate starting from 5% to 8%,
 * with an increment of 1/8.
 * 
 * Hint:  Print $ where appropriate, include commas in numbers
 * when appropriate, and make sure money has two digits after
 * the decimal place!
 * 
 * @author Kris
 * @version 1.0
 * @since 07-04-2016
 *
 */
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Enter loan amount
		System.out.print("Enter loan amount, e.g., 120000.95: ");
		double loanAmount = input.nextDouble();
		
		// Enter number of years
		System.out.print("Enter number of years as an integer, e.g., 5: ");
		int numberOfYears = input.nextInt();
		
		System.out.println("");
		
		//print header for table
		System.out.println("Interest Rate     Monthly Payment    Total Payment");
		System.out.println("--------------------------------------------------");
				
		//i represents interest rate from 5% to 8%, incremented by 0.125%
		for (double i = 5.0; i <= 8.0; i += 0.125){
			// Obtain monthly interest rate
			double monthlyInterestRate = i / 1200;
			
			// Calculate payment, code from book, listing 2.9 pg 61
			double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
			double totalPayment = monthlyPayment * numberOfYears * 12;
			
			//print result for current interest rate
			System.out.printf("%-1.3f%%            $%,-18.2f$%,-18.2f\n", i, monthlyPayment, totalPayment);
		}

		input.close();
	}

}
