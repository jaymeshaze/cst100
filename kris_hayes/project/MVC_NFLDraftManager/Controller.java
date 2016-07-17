/**
 * Controls actions for the program, MVC model
 * 
 * @author Kris
 * @version 2.0
 * @since 07-16-2016
 */

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Controller {
	//player list in .txt
	public static String filePath = "playerlist.csv";
	
	PlayerManager playerManager = new PlayerManager();
	
	Controller(PlayerManager playerManager){
		this.playerManager = playerManager;
	}
	
	public static String getFilePath(){
		return filePath;
	}
	
	public int getNumSelected(){
		return playerManager.selectedPlayers;
	}
	
	public int getNumAvailable(){
		return playerManager.availablePlayers;
	}
	
	public ArrayList<NFLPlayer> getAvailable(){
		return playerManager.getAvailable();
	}
	
	public ArrayList<NFLPlayer> getSelected(){
		return playerManager.getSelected();
	}
	
	public ArrayList<NFLPlayer> getSelectedOffensive(){
		return playerManager.getSelectedOffensive();
	}
	
	public ArrayList<NFLPlayer> getSelectedDefensive(){
		return playerManager.getSelectedDefensive();
	}
	
	public ArrayList<NFLPlayer> getAvailableOffensive(){
		return playerManager.getAvailableOffensive();
	}
	
	public ArrayList<NFLPlayer> getAvailableDefensive(){
		return playerManager.getAvailableDefensive();
	}
	
	public void selectPlayer(NFLPlayer player){
		player.setIsSelected(true);
		Main.view.notificationBox.setText(player.celebrate());
	}
	
	public void deselectPlayer(NFLPlayer player){
		player.setIsSelected(false);
		Main.view.notificationBox.setText(player.lament());
	}
	
	//save user data from selections made and export to csv (filepath in Controller)
	public void saveData(){
		File file = new File(Controller.getFilePath());
		File bakfile = new File(Controller.getFilePath() + ".bak");
		
		//checks if an original file existed, if so, change to .bak
		if(file.exists() == true)
			file.renameTo(bakfile);	
		
		//writes current program data to save file
		PrintWriter writer; 
		try{
			writer = new PrintWriter(file);
			for(NFLPlayer i: playerManager.getArrayList()){
				writer.print(i.toFullString() + "\n");
				}
			writer.close();
		}catch (IOException e){
			e.printStackTrace();
		}

		
	
	}
	
	
}
