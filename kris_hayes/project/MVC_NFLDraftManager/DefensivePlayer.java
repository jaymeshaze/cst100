/**
 * Defensive Player object extended from NFLPlayer
 * 
 * @author Kris
 * @version 2.0
 * @since 07-16-2016
 */
public class DefensivePlayer extends NFLPlayer implements Celebrator{

	//stats
	private int tackles;				//index 8
	private int assistedTackles;		//index 9
	private double sacks;				//index 10
	private int interceptions;			//index 11
	private int returnYards;			//index 12
	private int passesDefensed;			//index 13
	private double averageReturnYards;	//index 14
	private double safety;		//index 15

	//no-arg constructor
	DefensivePlayer(){
	}
	//constructor for DefensivePlayer, parses String to individual stats
	DefensivePlayer(String player){
		super(player);
		
		//split string to an array
		String[] playerStats = player.split(",");
		
		//assign values based on split string array
		this.tackles = Integer.parseInt(playerStats[8]);
		this.assistedTackles = Integer.parseInt(playerStats[9]);
		this.sacks = Double.parseDouble(playerStats[10]);
		this.interceptions = Integer.parseInt(playerStats[11]);
		this.returnYards = Integer.parseInt(playerStats[12]);
		this.passesDefensed = Integer.parseInt(playerStats[13]);
		this.averageReturnYards = Double.parseDouble(playerStats[14]);
		this.safety = Double.parseDouble(playerStats[15]);
		super.isSelected = Boolean.parseBoolean(playerStats[16]);
	}
	
	//setter methods for each variable
	public void setTackles(int tackles){
		this.tackles = tackles;
	}
	
	public void setAssistedTackles(int tackles){
		this.assistedTackles = tackles;
	}
		
	public void setSacks(int sacks){
		this.sacks = sacks;
	}

	public void setInterceptions(int interceptions){
		this.interceptions = interceptions;
	}
	
	public void setReturnYards(int yards){
		this.returnYards = yards;
	}
	
	public void setPassesDefensed(int passdef){
		this.passesDefensed = passdef;
	}
	
	public void setAverageReturnYards(double yards){
		this.averageReturnYards = yards;
	}
	
	public void setSafety(double tackles){
		this.safety = tackles;
	}

	
	//getter methods for each variable
	public int getTackles(){
		return this.tackles;
	}
	
	public int getAssistedTackles(){
		return this.assistedTackles;
	}
		
	public double getSacks(){
		return this.sacks;
	}

	public int getInterceptions(){
		return this.interceptions;
	}
	
	public int getReturnYards(){
		return this.returnYards;
	}
	
	public int getPassesDefensed(){
		return this.passesDefensed;
	}
	
	public double getAverageReturnYards(){
		return this.averageReturnYards;
	}
	
	public double getSafety(){
		return this.safety;
	}
	
	//basic method, used by ListView for proper display
	public String toString(){
		return (super.getFirstName() + " " + super.getLastName());
	}
	
	//String output with delimiter for storing full stats
	public String toFullString(){
		return (super.toString() + "," + tackles + "," + assistedTackles + "," + sacks + "," + interceptions + "," + returnYards + "," + passesDefensed + "," + averageReturnYards  + "," + safety + "," + super.getIsSelected());
	}
	
	//String to be shown with formatting for Notification box
	public String toNotificationString(){
		return (super.toNotificationString() + 
					"\n" + 
					"\nTackles:      " + tackles + "                          Assissted Tackles: " + assistedTackles + "                    Sacks: " + sacks +
					"\nSafety: " + safety + "              Interceptions: " + interceptions + "                       Return Yards: " + returnYards + 
					"\nPasses Defensed: " + passesDefensed + "                    Avg. Return Yards: " + averageReturnYards);
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
