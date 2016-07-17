/**
 * PlayerManager acts as model to create, manage and store NFLPlayers, MVC model
 * 
 * @author Kris
 * @version 2.0
 * @since 07-16-2016
 */

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PlayerManager {
	ArrayList<NFLPlayer> players = new ArrayList<NFLPlayer>();
	
	//track number of available and selected players to be shown in memobox (View)
	int availablePlayers = 0;
	int selectedPlayers = 0;
	
	//no-arg constrcutor to initiate PlayerManager and load a set of hard-coded players
	PlayerManager(){
		loadPlayers();
	}
	
	//loads PlayerManager with players loaded from specified filepath (filepath set in Controller)
	PlayerManager(String filePath){
		File playerFile = new File(filePath);
		
		if(playerFile.exists() == true){		
			Scanner file;
			try{
				file = new Scanner(playerFile);
				while(file.hasNextLine()){
					String nextPlayer = file.nextLine();	//store nextLine() in variable to prevent skipped lines
					if(nextPlayer.contains("Offense")){		//separate Offensive and Defensive to proper constructors
						players.add(new OffensivePlayer(nextPlayer));
					}else{
						players.add(new DefensivePlayer(nextPlayer));
					}
				}
		}catch (IOException e){
			e.printStackTrace();
		}

		getSelected();
		getAvailable();
		
	}else{
		loadPlayers();
	}
}
	
	//load 5 hard-coded players (3 Offensive and 2 Defensive)
	public void loadPlayers(){
		ArrayList<NFLPlayer> players = new ArrayList<NFLPlayer>();
			players.add(new OffensivePlayer("Adrian,Peterson,31,73,220,Oklahoma,10 years,Offense,1485,222,11,0,4.5,7.4,7,327,30,FALSE"));
			players.add(new OffensivePlayer("Le'Veon,Bell,24,73,244,Michigan State,4 years,Offense,556,136,3,0,4.9,5.7,0,113,24,FALSE"));
			players.add(new OffensivePlayer("Doug,Martin,27,69,223,Boise State,5 years,Offense,1402,271,6,1,4.9,8.2,5,288,33,FALSE"));
			players.add(new DefensivePlayer("NaVorro,Bowman,28,72,242,Penn State,7 years,Defense,116,38,2.5,0,0,2,0,0,FALSE"));
			players.add(new DefensivePlayer("D'Qwell,Jackson,32,72,242,Maryland,11 years,Defense,89,61,3,1,6,10,6,0,FALSE"));
			
	this.players = players;
	}
	
	public ArrayList<NFLPlayer> getArrayList(){
		return players;
	}
	
	//retrieve list of just offensive players/defensive players
	public ArrayList<NFLPlayer> getSelectedOffensive(){
		ArrayList<NFLPlayer> selectedOffensivePlayers = new ArrayList<NFLPlayer>();
		
		for(NFLPlayer i: players){
			if(i.getIsSelected() == true && i.playerPosition.contains("Offense")){
				selectedOffensivePlayers.add(i);
			}
		}
		return selectedOffensivePlayers;
	}
	
	public ArrayList<NFLPlayer> getSelectedDefensive(){
		ArrayList<NFLPlayer> selectedDefensivePlayers = new ArrayList<NFLPlayer>();
		
		for(NFLPlayer i: players){
			if(i.getIsSelected() == true && i.playerPosition.contains("Defense")){
				selectedDefensivePlayers.add(i);
			}
		}
		return selectedDefensivePlayers;
	}
	
	public ArrayList<NFLPlayer> getAvailableOffensive(){
		ArrayList<NFLPlayer> availableOffensivePlayers = new ArrayList<NFLPlayer>();
		
		for(NFLPlayer i: players){
			if(i.getIsSelected() == false && i.playerPosition.contains("Offense")){
				availableOffensivePlayers.add(i);
			}
		}
		return availableOffensivePlayers;
	}
	
	public ArrayList<NFLPlayer> getAvailableDefensive(){
		ArrayList<NFLPlayer> availableDefensivePlayers = new ArrayList<NFLPlayer>();
		
		for(NFLPlayer i: players){
			if(i.getIsSelected() == false && i.playerPosition.contains("Defense")){
				availableDefensivePlayers.add(i);
			}
		}
		return availableDefensivePlayers;
	}
	
	//retrieves lists of selected or available
	public ArrayList<NFLPlayer> getSelected(){
		ArrayList<NFLPlayer> selectedPlayers = new ArrayList<NFLPlayer>();
		
		for(NFLPlayer i: players){
			if(i.getIsSelected() == true){
				selectedPlayers.add(i);
			}
		}
		this.selectedPlayers = selectedPlayers.size();
		return selectedPlayers;
	}
	
	public ArrayList<NFLPlayer> getAvailable(){
		ArrayList<NFLPlayer> availablePlayers = new ArrayList<NFLPlayer>();
		
		for(NFLPlayer i: players){
			if(i.getIsSelected() == false){
				availablePlayers.add(i);
			}
		}
		this.availablePlayers = availablePlayers.size();
		return availablePlayers;
	}	
		
	//getters for number of players selected and available
	public int getNumSelected(){
		return selectedPlayers;
	}
	
	public int getNumAvailable(){
		return availablePlayers;
	}
}