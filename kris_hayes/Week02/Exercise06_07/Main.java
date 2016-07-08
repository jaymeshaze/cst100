/**
 * 
 */

/**
 * @author Kris
 *
 */
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
		//request amount invested
		System.out.print("The amount invested: ");
		double amountInvested = input.nextDouble();
		//request whole interest rate and convert to usable number
		System.out.print("Annual interest rate: ");
		double annualInterestRate = (input.nextDouble() / 100);
		//request years to calculate
		System.out.print("Enter number of years: ");
		double totalYears = input.nextDouble();
		
		//calculate monthly rate from annual rate
		double monthlyInterestRate = (annualInterestRate / 12);
		//use to start the while loop from 1 year to totalYears
		int year = 1;
		
		//headers of table
		System.out.println("Years       Future Value");
		System.out.println("------------------------");
		
		//loop to calculate each year using method and print result into the table
		while (year <= totalYears){
			System.out.printf("%-12d$%-12.2f\n", year, futureInvestmentValue(amountInvested, monthlyInterestRate, year));
			year++; //increase year by 1
		}
	
		input.close();
	}

	
	 
	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){
		//calculates investment using monthly interest rate to a specific number of years
		double futureValue = investmentAmount * Math.pow((1 + monthlyInterestRate), (years * 12));
		return futureValue;
	}
}
