/**
 * 
 */

/**
 * (Write/read data) Write a program to create a file named
 * Exercise12_15.txt if it does not exist. Write 100 integers
 * created randomly into the file using text I/O. Integers are
 * separated by spaces in the file. Read the data back from the
 * file and display the data in increasing order.
 * 
 * @author Kris
 * @version 1.0
 * @since 06-21-2016
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) throws Exception {
		//Create an array and assign a random number for each index
		int[] numArray = new int[100];
		for (int i = 0; i < numArray.length - 1; i++){
			numArray[i] = (int)(Math.random() * 100);
		}		
		//create txt file
		java.io.File exercise = new java.io.File("Exercise12_15.txt");
		//check to see if file exists, and terminate if exists
		if (exercise.exists()) {
			System.out.println("File already exists");
			System.exit(0);
		}
		//write array into txt file, separated by 1 space
		try (java.io.PrintWriter output = new java.io.PrintWriter(exercise);) {
			// Write formatted output to the file
			for (int i = 0; i < numArray.length - 1; i++){
				output.print(numArray[i]);
				output.print(" ");
			}
		}
		
		// Create a Scanner for the file
		Scanner input = new Scanner(exercise);
		
		//create a new array to import txt file contents
		int[] fileArray = new int[numArray.length];
		int arrayCounter = 0;
		//loop to read each Int from txt file and input into new array
		do{
			fileArray[arrayCounter] = input.nextInt();
			arrayCounter++;
		}while(input.hasNext());
		//sort the array in increasing order	
		Arrays.sort(fileArray);
		//print array
		for (int i = 0; i < fileArray.length - 1; i++){
			System.out.print(fileArray[i] + " ");
		}
		
		input.close();
	}

}