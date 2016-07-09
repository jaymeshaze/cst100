/**
 * 
 */

/**
 * (Stopwatch) Design a class named StopWatch. The class contains:
 * 		-Private data fields startTime and endTime with getter methods.
 * 		-A no-arg constructor that initializes startTime with the current time.
 * 		-A method named start() that resets the startTime to the current time.
 * 		-A method named stop() that sets the endTime to the current time.
 * 		-A method named getElapsedTime() that returns the elapsed time for
 * 			the stopwatch in milliseconds.
 * 
 * Draw the UML diagram for the class and then implement the class.
 * Write a test program that measures the execution time of sorting
 * 100,000 numbers using selection sort.
 * 
 * Hint: No UML required.
 * 
 * @author Kris
 * @version 1.0
 * @since 07-04-2016
 */
public class Main {

	public static void main(String[] args) {
		//create StopWatch object
		StopWatch time = new StopWatch();
		//randomly generate 100000 integers in an array
		int[] list = new int[100000];
		for(int i = 0; i < list.length-1; i++){
			list[i] = (int)(Math.random() * 100000);
		}
		//start time, sort array, stop time
		time.start();
		selectionSort(list);
		time.stop();
		//display time to sort array
		System.out.println("The elapsed time is: " + time.getElapsedTime() + " milliseconds.");

	}
	
	// LISTING 7.8 SelectionSort.java
	// pg. 270
	public static void selectionSort(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			// Find the minimum in the list[i..list.length-1]
			int currentMin = list[i];
			int currentMinIndex = i;

			for (int j = i + 1; j < list.length; j++) {
				if (currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}

			// Swap list[i] with list[currentMinIndex] if necessary
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}

}
