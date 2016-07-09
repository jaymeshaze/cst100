import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Main is currently used for testing other class' functionality.
 * 
 * @author Kris
 * @version 1.1
 * @since 07-02-2016
 */
public class Main extends Application {

	//player list in .txt
	static String filePath = "playerlist.txt";
	
	
	//create text fields and buttons to be used
	Label logo = new Label("              KH DRAFT CENTRAL");
	
	TextField filepath = new TextField();
	Label memo = new Label("Memo:");
	TextArea memoBox = new TextArea();
	TextArea notificationBox = new TextArea();
	Label selectedPlayersLabel = new Label("Selected Players:");
	Button btSelect = new Button("Select");
	Button btDeselect = new Button("Deselect");
	Button btSave = new Button("Save");
	Button btSaveAndExit = new Button("Save and Exit");
	Label availablePlayersLabel = new Label("Available Players:");
	
	PlayerManager testManager = new PlayerManager(filePath);
	
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		
		ListView<NFLPlayer> playerList = new ListView<>(FXCollections.observableArrayList(testManager.getAvailable()));
		playerList.setPrefSize(400, 200);
		playerList.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
		
		ListView<NFLPlayer> SelectedList = new ListView<>(FXCollections.observableArrayList(testManager.getSelected()));
		SelectedList.setPrefSize(400, 200);
		SelectedList.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

		HBox centerButtons = new HBox();
		centerButtons.setSpacing(10);
		centerButtons.getChildren().add(btSelect);
		centerButtons.getChildren().add(btDeselect);
		centerButtons.getChildren().add(btSave);
		centerButtons.getChildren().add(btSaveAndExit);
		centerButtons.setAlignment(Pos.BOTTOM_CENTER);
		
		
		VBox leftPanel = new VBox();
//		leftPanel.getChildren().add(memo);
		leftPanel.getChildren().add(memoBox);
		leftPanel.getChildren().add(selectedPlayersLabel);
		leftPanel.getChildren().add(SelectedList);
		memoBox.setPrefWidth(200);
		memoBox.setEditable(false);
		memoBox.setText(testManager.getNumSelected() + " selected players. \n" + testManager.getNumAvailable() + " available players.");
		SelectedList.setPrefWidth(200);
		
		VBox centralArea = new VBox();
		centralArea.getChildren().add(notificationBox);
		notificationBox.setPrefWidth(400);
		notificationBox.setPrefHeight(150);
		centralArea.getChildren().add(centerButtons);
		centralArea.getChildren().add(playerList);
		
//		BorderPane centerPane = new BorderPane();
//		centerPane.setBottom(playerList);
//		centerPane.setCenter(centralArea);
		
		
		btSave.setOnAction(e -> testManager.saveData());
		btSelect.setOnAction(e -> testManager.selectPlayer(playerList.getSelectionModel().getSelectedItem()));
		btDeselect.setOnAction(e -> testManager.deselectPlayer(SelectedList.getSelectionModel().getSelectedItem()));
		
		
		BorderPane userPane = new BorderPane();
		userPane.setTop(logo);
		logo.setStyle("-fx-font-size: 48");
		userPane.setLeft(leftPanel);
		userPane.setCenter(centralArea);
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(userPane, 800, 400);
		primaryStage.setTitle("KH Draft Central"); // Set title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

		
	public static void main(String[] args) {
		Application.launch(args);
		
	}
	
	public static String getFilePath(){
		return filePath;
	}
	
}
		
//		
//		//test toString() before setters
//		System.out.println(testOffense1.toString());
//		
//		//test setters and getters in OffensivePlayer
//		testOffense1.setFirstName("Carson");
//		System.out.println(testOffense1.getFirstName());
//		
//		testOffense1.setLastName("Palmer");
//		System.out.println(testOffense1.getLastName());
//		
//		testOffense1.setAge(36);
//		System.out.println(testOffense1.getAge());
//		
//		testOffense1.setHeight(81);
//		System.out.println(testOffense1.getHeight());
//		
//		testOffense1.setWeight(245);
//		System.out.println(testOffense1.getWeight());
//		
//		testOffense1.setCollege("University of Southern California");
//		System.out.println(testOffense1.getCollege());
//		
//		testOffense1.setExperience("13 years");
//		System.out.println(testOffense1.getExperience());
//		
//		//test toString() for each remaining player
//		System.out.println(testOffense2.toString());
//		System.out.println(testOffense3.toString());
//		System.out.println(testDefense2.toString());
//		System.out.println(testDefense3.toString());
//		
//		//test PlayerManager
//		PlayerManager manager = new PlayerManager();
//		
//		for(int i = 0; i < 3; i++){
//			System.out.println(manager.get_player()[i]);
//		}
//	
//	}
//
//}
