/**
 * 
 */

/**
 * @author Kris
 * @version 1.1
 * @since 07-02-2016
 */
public class OffensivePlayer extends NFLPlayer implements Celebrator{

	//stats  (not currently in use)
	private int yardsRushing; 				//index 7
	private int yardsReceiving; 			//index 8
	private int touchdownsRushing; 			//index 9
	private int touchdownsReceiving; 		//index 10
	private double averageYardsRushing; 	//index 11
	private double averageYardsReceiving; 	//index 12
	private int fumbles; 					//index 13

	
	OffensivePlayer(){
		
	}
	
	OffensivePlayer(String player){
		//create NFLPlayer
		super(player);
		
		//split string to an array
		String[] playerStats = player.split(",");
				
		//assign values based on split string array
//		super.firstName = playerStats[0];
//		super.lastName = playerStats[1];
//		super.age = Integer.parseInt(playerStats[2]);
//		super.height = Integer.parseInt(playerStats[3]);
//		super.weight = Integer.parseInt(playerStats[4]);
//		super.college = playerStats[5];
//		super.experience = playerStats[6];
		this.yardsRushing = Integer.parseInt(playerStats[7]);
		this.yardsReceiving = Integer.parseInt(playerStats[8]);
		this.touchdownsRushing = Integer.parseInt(playerStats[9]);
		this.touchdownsReceiving = Integer.parseInt(playerStats[10]);
		this.averageYardsRushing = Double.parseDouble(playerStats[11]);
		this.averageYardsReceiving = Double.parseDouble(playerStats[12]);
		this.fumbles = Integer.parseInt(playerStats[13]);
		super.isSelected = Boolean.parseBoolean(playerStats[14]);
		super.playerPosition = "Offense";
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
	
	public String toString(){
		return (super.toString() + "," + yardsRushing + "," + yardsReceiving + "," + touchdownsRushing + "," + touchdownsReceiving + "," + averageYardsRushing + "," + averageYardsReceiving + "," + fumbles  + "," + super.getIsSelected());
	}
	
	public String celebrate(){
		int i = (int)(Math.random() * 5);
		String celebration;
		
		switch(i){
		case 1: celebration = " jumps for joy!"; break;
		case 2: celebration = " casually combs his hair back with a comb and winks at the camera."; break;
		case 3: celebration = " hugs his mom and dad and yells 'Yes!'"; break;
		case 4: celebration = " falls to his knees in praise!"; break;
		case 5: celebration = " stands and yells 'Show Me The Money!'"; break;
		default: celebration = " is happy to be drafted!"; break;
		}
	
		return celebration;
	}
	
	public String lament(){
		int i = (int)(Math.random() * 5);
		String lamentation;
		
		switch(i){
		case 1: lamentation = " begins to question all of his life choices."; break;
		case 2: lamentation = " walks backj to his seat in a heap of tears and sadness."; break;
		case 3: lamentation = " waves his fist in teh air and yells 'No!!'"; break;
		case 4: lamentation = " falls to his knees sobbing."; break;
		case 5: lamentation = " is overtaken with sadness that he cannot even speak."; break;
		default: lamentation = " is sad to be cut."; break;
		}
	
		return lamentation;
	}
	
}
