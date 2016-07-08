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
		
		double[] myList = new double[10];
		
		System.out.print("Enter ten numbers (seperated by spaces): ");
		
		for (int i = 0; i < myList.length; i++)
			myList[i] = input.nextDouble();
			
		System.out.printf("The minimum number is: %4.2f", min(myList));
		
		input.close();
	}
	
	public static double min(double[] array){
		double min = array[0];
		
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) min = array[i];
		}
		
		return min;
	}

}
