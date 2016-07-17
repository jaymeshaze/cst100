/**
 * Offensive Player object extended from NFLPlayer
 * 
 * @author Kris
 * @version 2.0
 * @since 07-16-2016
 */
public class OffensivePlayer extends NFLPlayer implements Celebrator{

	//stats
	private int yardsRushing; 				//index 8
	private int yardsReceiving; 			//index 9
	private int touchdownsRushing; 			//index 10
	private int touchdownsReceiving; 		//index 11
	private double averageYardsRushing; 	//index 12
	private double averageYardsReceiving; 	//index 13
	private int fumbles;					//index 14
	private int rushingAttempts;			//index 15
	private int receptions;					//index 16

	//no-arg constructor
	OffensivePlayer(){
		
	}
	
	//constructor for OffensivePlayer, parses String to individual stats
	OffensivePlayer(String player){
		//create NFLPlayer
		super(player);
		
		//split string to an array
		String[] playerStats = player.split(",");
				
		//assign values based on split string array
		this.yardsRushing = Integer.parseInt(playerStats[8]);
		this.yardsReceiving = Integer.parseInt(playerStats[9]);
		this.touchdownsRushing = Integer.parseInt(playerStats[10]);
		this.touchdownsReceiving = Integer.parseInt(playerStats[11]);
		this.averageYardsRushing = Double.parseDouble(playerStats[12]);
		this.averageYardsReceiving = Double.parseDouble(playerStats[13]);
		this.fumbles = Integer.parseInt(playerStats[14]);
		this.rushingAttempts = Integer.parseInt(playerStats[15]);
		this.receptions = Integer.parseInt(playerStats[16]);
		super.isSelected = Boolean.parseBoolean(playerStats[17]);
		
	}
	
	//setter methods for each variable
	public void setYardsRushing(int yards){
		this.yardsRushing = yards;
	}
	
	public void setYardsReceiving(int yards){
		this.yardsReceiving = yards;
	}
	
	public void setTouchdownsRushing(int tds){
		this.touchdownsRushing = tds;
	}
	
	public void setTouchdownsReceiving(int tds){
		this.touchdownsReceiving = tds;
	}
	
	public void setAverageYardsRushing(double yards){
		this.averageYardsRushing = yards;
	}
	
	public void setAverageYardsReceiving(double yards){
		this.averageYardsReceiving = yards;
	}
	
	public void setFumbles(int fumbles){
		this.fumbles = fumbles;
	}
	
	public void setRushingAttempts(int rushingAttempts){
		this.rushingAttempts = rushingAttempts;
	}
	
	public void setReceptions(int receptions){
		this.receptions = receptions;
	}
	
	//getter methods for each variable
	public int getYardsRushing(){
		return this.yardsRushing;
	}
	
	public int getYardsReceiving(){
		return this.yardsReceiving;
	}
	
	public int getTouchdownsRushing(){
		return this.touchdownsRushing;
	}
	
	public int getTouchdownsReceiving(){
		return this.touchdownsReceiving;
	}
	
	public double getAverageYardsRushing(){
		return this.averageYardsRushing;
	}
	
	public double getAverageYardsReceiving(){
		return this.averageYardsReceiving;
	}
	
	public int getFumbles(){
		return this.fumbles;
	}
	
	public int getRushingAttempts(int rushingAttempts){
		return this.rushingAttempts;
	}
	
	public int getReceptions(int receptions){
		return this.receptions;
	}
	
	//basic method, used by ListView for proper display
	public String toString(){
		return (super.getFirstName() + " " + super.getLastName());
	}
	
	//String output with delimiter for storing full stats
	public String toFullString(){
		return (super.toString() + "," + yardsRushing + "," + yardsReceiving + "," + touchdownsRushing + "," + touchdownsReceiving + "," + averageYardsRushing + "," + averageYardsReceiving + "," + fumbles  + "," + rushingAttempts  + "," + receptions  + "," + super.getIsSelected());
	}
	
	//String to be shown with formatting for Notification box
	public String toNotificationString(){
		return (super.toNotificationString() + 
					"\n" + 
					"\nYards Rushing:      " + yardsRushing + "                    Yards Receiving: " + yardsReceiving + "                    Fumbles: " + fumbles +
					"\nTouchdowns Rushing: " + touchdownsRushing + "                    Touchdowns Receiving: " + touchdownsReceiving + "                Rushing Attempts: " + rushingAttempts +
					"\nAvg. Yards Rushing: " + averageYardsRushing + "                    Avg. Yards Receiving: " + averageYardsReceiving + "                Receptions: " + receptions);
	}
	
	//Overridden from Celebrator interface
	public String celebrate(){
		int i = (int)(Math.random() * 5);
		String celebration;
		
		switch(i){
		case 0: celebration = (firstName + " " + lastName + " jumps for joy!"); break;
		case 1: celebration = (firstName + " " + lastName + " casually combs his hair back with a comb and winks at the camera."); break;
		case 2: celebration = (firstName + " " + lastName + " hugs his mom and dad and yells 'Yes!'"); break;
		case 3: celebration = (firstName + " " + lastName + " falls to his knees in praise!"); break;
		case 4: celebration = (firstName + " " + lastName + " stands and yells 'Show Me The Money!'"); break;
		default: celebration = (firstName + " " + lastName + " is happy to be drafted!"); break;
		}
	
		return celebration;
	}
	
	//Overridden from Celebrator interface
	public String lament(){
		int i = (int)(Math.random() * 5);
		String lamentation;
		
		switch(i){
		case 0: lamentation = (firstName + " " + lastName + " begins to question all of his life choices."); break;
		case 1: lamentation = (firstName + " " + lastName + " walks back to his seat in a heap of tears and sadness."); break;
		case 2: lamentation = (firstName + " " + lastName + " waves his fist in the air and yells 'No!!'"); break;
		case 3: lamentation = (firstName + " " + lastName + " falls to his knees sobbing."); break;
		case 4: lamentation = (firstName + " " + lastName + " is overtaken with sadness that he cannot even speak."); break;
		default: lamentation = (firstName + " " + lastName + " is sad to be cut."); break;
		}
	
		return lamentation;
	}
	
}
