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
		
		//Enter a credit card number to be evaluated
		System.out.print("Please enter your credit card number: ");
		long cardNumber = input.nextLong();
		
		if (isValid(cardNumber) == true) {
		       System.out.println(cardNumber + " is valid.");
		    } else {
		        System.out.println(cardNumber + " is invalid.");
		    }
		
		input.close();
	}
	
	/** Return true if the card number is valid */
	public static boolean isValid(long number){
		    return ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0) && (prefixMatched(number, 1) == true) && (getSize(number)>=13) && (getSize(number)<=16);
	}
	
	/** Get the result from Step 2 */
	public static int sumOfDoubleEvenPlace(long number){
		int numLength = getSize(number);
		int doubleEvenSum = 0;
		
		for (int i = 0; i < numLength; i++){
			if (i % 2 != 0){
				doubleEvenSum += getDigit((int) (number % 10) * 2);
			}
		number =  number/10;
		}
		return doubleEvenSum;
	}
	
	/** Return this number if it is a single digit, otherwise,
	* return the sum of the two digits */
	public static int getDigit(int number){
		if (number <= 9) {
	        return number;
	    } else {
	        int firstDigit = number % 10;
	        int secondDigit = (int)(number / 10);
	        return firstDigit + secondDigit;
	    }
	}
	
	/** Return sum of odd-place digits in number */
	public static int sumOfOddPlace(long number){
		int numLength = getSize(number);
		int sum = 0;
		
		for (int i = 0; i < numLength; i++){
			if (i % 2 == 0){
				sum += (int)(number % 10);
			}
			number =  number/10;
		}
		return sum;
	}
	
	/** Return true if the digit d is a prefix for number */
	public static boolean prefixMatched(long number, int d){
		if ((getPrefix(number, d) == 4) || (getPrefix(number, d) == 5) || (getPrefix(number, d) == 3)|| (getPrefix(number, d) == 6)) {
	        return true;
	    } else {
	        return false;
	    }
	}
	
	/** Return the number of digits in d */
	public static int getSize(long d){
		int size = (int) Math.log10(d) + 1;
		
		return size;
	}
	
	/** Return the first k number of digits from number. If the
	* number of digits in number is less than k, return number. */
	public static long getPrefix(long number, int k){
		    if (getSize(number) < k) {
			    return number;
			} else {
			    int size = (int)getSize(number);
			
			    for (int i = 0; i < (size - k); i++) {
			        number = number / 10;
			    }
			    return number;
			}
	}
	
	
}
