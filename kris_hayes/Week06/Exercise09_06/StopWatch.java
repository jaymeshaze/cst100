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
 *
 */
public class StopWatch {

	/**
	 * @param args
	 */
	private long startTime;
	private long endTime;

	
	//constructor, records 'start time'
	StopWatch(){
		this.startTime = System.currentTimeMillis();
	}
	//getter methods
	public long getStartTime(){
		return this.startTime;
	}
	
	public long getEndTime(){
		return this.endTime;
	}
	//records 'start time'
	public void start(){
		this.startTime = System.currentTimeMillis();
	}
	//records 'stop time'
	public void stop(){
		this.endTime = System.currentTimeMillis();
	}
	//calculates elapsed time using start and stop times
	public long getElapsedTime(){
		return (endTime - startTime);

	}

}
