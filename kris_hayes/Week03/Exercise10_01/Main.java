/**
 * 
 */

/**
 * @author Kris
 *
 */
public class Main {

	/**
	 * Hints 10.1: Beware of time zone – report correct time in MST!
	 * Test your program!!!
	 */
	public static void main(String[] args) {
		Time t1 = new Time();
		Time t2 = new Time(555550000);
		
		System.out.println("The time for t1 is " + t1.getHour() + ":" + t1.getMinute() + ":" + t1.getSecond() + " MST");
		System.out.println("The time for t2 is " + t2.getHour() + ":" + t2.getMinute() + ":" + t2.getSecond() + " MST");
	}

}

class Time {
	private long hour;
	private long minute;
	private long second;
	
	//no-arg constructor, uses currentTimeMillis() method to set Time
	Time(){	
		long totalMilliseconds = System.currentTimeMillis();
		long totalSeconds = totalMilliseconds / 1000;
		long currentSecond = totalSeconds % 60;
		this.second = currentSecond;
		
		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;
		this.minute = currentMinute;
		
		long totalHours = totalMinutes / 60;
		long currentHour = (totalHours - 6) % 24;
		this.hour = currentHour;
	}
	
	//constructor to set time based on elapsed milliseconds
	Time(long elapsedTime){
		long totalSeconds = elapsedTime / 1000;
		this.second = (totalSeconds % 60);
		long totalMinutes = totalSeconds / 60;
		this.minute = (totalMinutes % 60);
		long totalHours = (totalMinutes / 60);
	    this.hour = ((totalHours - 6) % 24);
	}
	
	//constructor to set time based on hour:minute:second input
	Time(int newHour, int newMinute, int newSecond){
		this.hour = newHour;
		this.minute = newMinute;
		this.second = newSecond;
	}
	
	//3 getter methods for hour, minute and second
	public long getHour(){
		return hour;
	}
	
	public long getMinute(){
		return minute;
	}
	
	public long getSecond(){
		return second;
	}
	
	//method to set time for an already existing Time object
	public void setTime(long elapsedTime){
		long totalSeconds = elapsedTime / 1000;
		this.second = (totalSeconds % 60);
		long totalMinutes = totalSeconds / 60;
		this.minute = (totalMinutes % 60);
		long totalHours = (totalMinutes / 60);
	    this.hour = ((totalHours - 6) % 24);
	}
	
	
}