/**
 * 
 */

/**
 * @author jayme
 *
 */
public class DefensivePlayer extends NFLPlayer implements Celebrator{

	//stats  (not currently in use)
	private int tackles;				//index 7
	private int assistedTackles;		//index 8
	private int sacks;					//index 9
	private int interceptions;			//index 10
	private int returnYards;			//index 11
	private int passesDefensed;			//index 12
	private double averageReturnYards;	//index 13
	private double averageTackles;		//index 14

	
	DefensivePlayer(){
	}
	
	DefensivePlayer(String player){
		//split string to an array
		String[] playerStats = player.split(",");
		
		//assign values based on split string array
		super.firstName = playerStats[0];
		super.lastName = playerStats[1];
		super.age = Integer.parseInt(playerStats[2]);
		super.height = Integer.parseInt(playerStats[3]);
		super.weight = Integer.parseInt(playerStats[4]);
		super.college = playerStats[5];
		super.experience = playerStats[6];
		this.tackles = Integer.parseInt(playerStats[7]);
		this.assistedTackles = Integer.parseInt(playerStats[8]);
		this.sacks = Integer.parseInt(playerStats[9]);
		this.interceptions = Integer.parseInt(playerStats[10]);
		this.returnYards = Integer.parseInt(playerStats[11]);
		this.passesDefensed = Integer.parseInt(playerStats[12]);
		this.averageReturnYards = Double.parseDouble(playerStats[13]);
		this.averageTackles = Double.parseDouble(playerStats[14]);
		super.playerPosition = "Defense";
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
	
	public void setAverageTackles(double tackles){
		this.averageTackles = tackles;
	}

	
	
	//getter methods for each variable
	public int getTackles(){
		return this.tackles;
	}
	
	public int getAssistedTackles(){
		return this.assistedTackles;
	}
		
	public int getSacks(){
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
	
	public double getAverageTackles(){
		return this.averageTackles;
	}
	
	public String toString(){
		return (super.toString() + "," + tackles + "," + assistedTackles + "," + sacks + "," + interceptions + "," + returnYards + "," + passesDefensed + "," + averageReturnYards  + "," + averageTackles + "," + super.getIsSelected());
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
