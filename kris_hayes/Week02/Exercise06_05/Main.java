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
		System.out.print("Enter 3 numbers, seperated by spaces: ");
	
		double x = input.nextDouble();
		double y = input.nextDouble();
		double z = input.nextDouble();
	
		displaySortedNumbers(x, y, z);
		
		input.close();
	}

	public static void displaySortedNumbers(double num1, double num2, double num3){
		if (num1 < num2 && num1 < num3 && num2 < num3){
			System.out.println(num1 + " " + num2 + " " + num3);
		}else if (num1 < num3 && num1 < num2 && num3 < num2){
			System.out.println(num1 + " " + num3 + " " + num2);
		}else if (num2 < num1 && num2 < num3 && num1 < num3){
			System.out.println(num2 + " " + num1 + " " + num3);
		}else if (num2 < num3 && num2 < num1 && num3 < num1){
			System.out.println(num2 + " " + num3 + " " + num1);
		}else if (num3 < num1 && num3 < num2 && num1 < num2){
			System.out.println(num3 + " " + num1 + " " + num2);
		}else {
			System.out.println(num3 + " " + num2 + " " + num1);
		}
			
	}
	
}
