
public class Time {
	private double userTime;
	private int hour;
	private int minute;
	
	//math.round((userInput * 60)) - (math.floor(userInput)*60) = minutes
	
	Time(){
	}
	
	Time(double time){
		userTime = time;
	}
	
	public void convertFromDecimal(){
		hour = (int)Math.floor(userTime);
		minute = (int)Math.round((userTime * 60)) - (int)(Math.floor(userTime)*60);
		
		if (minute >= 60){
			minute = minute - 60;
			hour++;
		}else{
			//do nothing
		}
	}
	
	public void printTime(){
		System.out.print("The converted time is " + hour + " hours and " + minute + " minutes");
	}

}