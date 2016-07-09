import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * PlayerManager manages all the NFLPlayer objects for the program.
 * 
 * @author Kris
 * @version 1.1
 * @since 07-02-2016
 */
public class PlayerManager {
	ArrayList<NFLPlayer> players = new ArrayList<NFLPlayer>();
	
	int availablePlayers = 0;
	int selectedPlayers = 0;
	
	//initiate PlayerManager and load players
	PlayerManager(){
		loadPlayers();
	}
	
	PlayerManager(String filePath){
		File playerFile = new File(filePath);
		
		if(playerFile.exists() == true){		
			Scanner file;
			try{
				file = new Scanner(playerFile);
				while(file.hasNextLine()){
					players.add(new OffensivePlayer((file.nextLine())));
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
	
	//load 5 players
	public void loadPlayers(){
		ArrayList<NFLPlayer> players = new ArrayList<NFLPlayer>();
			players.add(new OffensivePlayer("Kris,Hayes,29,78,220,Grand Canyon University,Rookie,458,123,3,1,13.4,1.4,0,false"));
			players.add(new OffensivePlayer("Adrian,Peterson,31,77,245,Harvard,8 years,4598,1245,124,3,99.6,34.7,18,false"));
			players.add(new OffensivePlayer("Jon,Snow,25,71,195,Castle Black,Rookie,0,0,0,0,0.0,0.0,0,true"));
			players.add(new OffensivePlayer("James,Story,29,78,220,Grand Canyon University,Rookie,458,123,3,1,13.4,1.4,0,false"));
			players.add(new OffensivePlayer("David,Johnson,31,77,245,Harvard,8 years,4598,1245,124,3,99.6,34.7,18,false"));
			players.add(new OffensivePlayer("Arya,Stark,25,71,195,Castle Black,Rookie,0,0,0,0,0.0,0.0,0,true"));
			players.add(new OffensivePlayer("White,Walker,29,78,220,Grand Canyon University,Rookie,458,123,3,1,13.4,1.4,0,false"));
			players.add(new OffensivePlayer("Peyton,Manning,31,77,245,Harvard,8 years,4598,1245,124,3,99.6,34.7,18,false"));
			players.add(new OffensivePlayer("Tom,Brady,25,71,195,Castle Black,Rookie,0,0,0,0,0.0,0.0,0,false"));
//			players.add(new DefensivePlayer("Brian,Urlacher,38,81,265,Yale,12 years,1098,1409,35,2,34,8,1.3,7.4"));
//			players.add(new DefensivePlayer("Arya,Stark,31,61,120,Winterfell Elementary,Rookie,0,0,0,0,0,0,0,0"));
		
		
	
	this.players = players;
	}
	
	public ArrayList<NFLPlayer> getArrayList(){
		return players;
	}
	
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
		
	public void saveData(){
		File file = new File(Main.getFilePath());
		if(file.exists() == true)
			file.delete();
		
		File newFile = new File(Main.getFilePath());
		
		PrintWriter writer; 
		try{
			writer = new PrintWriter(newFile);
			for(NFLPlayer i: players){
				writer.print(i.toString() + "\n");
				}
			writer.close();
		}catch (IOException e){
			e.printStackTrace();
		}
		
	}
	
	public String selectPlayer(NFLPlayer player){
		player.setIsSelected(true);
		return player.celebrate();
	}
	
	public String deselectPlayer(NFLPlayer player){
		player.setIsSelected(false);
		return player.lament();
	}
	
	public int getNumSelected(){
		return selectedPlayers;
	}
	
	public int getNumAvailable(){
		return availablePlayers;
	}
}