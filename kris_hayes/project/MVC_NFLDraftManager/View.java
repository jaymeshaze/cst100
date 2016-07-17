import java.util.ArrayList;
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
 * Handles drawing and event handling, MVC model
 * 
 * @author Kris
 * @version 1.1
 * @since 07-02-2016
 */
public class View {

	private Stage stage;
	private Controller controller;
	
	//player list in .txt
	static String filePath = "playerlist.csv";
	
	
	//create text fields and buttons to be used
	Label logo = new Label("              KH DRAFT CENTRAL");
	
	//create UI elements
	TextField filepath = new TextField();
	TextArea memoBox = new TextArea();
	TextArea notificationBox = new TextArea();
	Label selectedPlayersLabel = new Label("Selected Players:");
	Button btAllPlayers = new Button("Show All Players");
	Button btOffense = new Button("Show Offense Only");
	Button btDefense = new Button("Show Defense Only");
	Button btSelect = new Button("Select");
	Button btDeselect = new Button("Deselect");
	Button btSave = new Button("Save");
	Button btSaveAndExit = new Button("Save and Exit");
	Label availablePlayersLabel = new Label("Available Players:");
	ListView<NFLPlayer> playerList;
	ListView<NFLPlayer> selectedList;
	
	public View(Controller controller, Stage primaryStage, ArrayList<NFLPlayer> availablePlayers, ArrayList<NFLPlayer> selectedPlayers){
		this.controller = controller;
		stage = primaryStage;
		
		//create ListVIews to hold available and selected lists
		playerList = new ListView<>(FXCollections.observableList(availablePlayers));
		playerList.setPrefSize(400, 300);
		playerList.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
		
		selectedList = new ListView<>(FXCollections.observableList(selectedPlayers));
		selectedList.setPrefSize(400, 300);
		selectedList.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
		
		//create buttons
		HBox filterButtons = new HBox();
		filterButtons.setSpacing(10);
		filterButtons.getChildren().add(btAllPlayers);
		filterButtons.getChildren().add(btOffense);
		filterButtons.getChildren().add(btDefense);
		filterButtons.setAlignment(Pos.CENTER);
		
		HBox manipulateButtons = new HBox();
		manipulateButtons.setSpacing(10);
		manipulateButtons.getChildren().add(btSelect);
		manipulateButtons.getChildren().add(btDeselect);
		manipulateButtons.getChildren().add(btSave);
		manipulateButtons.getChildren().add(btSaveAndExit);
		manipulateButtons.setAlignment(Pos.CENTER);
		
		VBox centerButtons = new VBox();
		centerButtons.setSpacing(15);
		centerButtons.getChildren().add(manipulateButtons);
		centerButtons.getChildren().add(filterButtons);
		
		//create UI elements to be arranged appropriately
		VBox availableLabelAndBox = new VBox();
		availableLabelAndBox.getChildren().add(availablePlayersLabel);
		availableLabelAndBox.getChildren().add(playerList);
		playerList.setPrefWidth(400);
		availablePlayersLabel.setAlignment(Pos.CENTER);
		
		VBox selectedLabelAndBox = new VBox();
		selectedLabelAndBox.getChildren().add(selectedPlayersLabel);
		selectedLabelAndBox.getChildren().add(selectedList);
		selectedList.setPrefWidth(400);
		selectedPlayersLabel.setAlignment(Pos.CENTER);
		
		HBox selectionLists = new HBox();
		selectionLists.getChildren().add(availableLabelAndBox);
		selectionLists.getChildren().add(selectedLabelAndBox);

		HBox memoAndNotifications = new HBox();
		memoAndNotifications.getChildren().add(memoBox);
		memoBox.setPrefWidth(200);
		memoBox.setEditable(false);
		memoBox.setText(controller.getNumSelected() + " selected players. \n" + controller.getNumAvailable() + " available players." + 
				"\n\nPlease select a player.\nUse filter buttons to view only\nOffensive or Defensive Players.");
		memoAndNotifications.getChildren().add(notificationBox);
		notificationBox.setPrefWidth(600);
		notificationBox.setPrefHeight(150);
		notificationBox.setEditable(false);
		
		
		VBox centralArea = new VBox();
		centralArea.getChildren().add(memoAndNotifications);
		centralArea.getChildren().add(centerButtons);
		centralArea.getChildren().add(selectionLists);
		
		BorderPane userPane = new BorderPane();
		userPane.setTop(logo);
		logo.setStyle("-fx-font-size: 48");
		userPane.setCenter(centralArea);
		
		//Event handlers for buttons
		playerList.setOnMouseClicked(e -> notificationBox.setText(playerList.getSelectionModel().getSelectedItem().toNotificationString()));
		selectedList.setOnMouseClicked(e -> notificationBox.setText(selectedList.getSelectionModel().getSelectedItem().toNotificationString()));
		
		btAllPlayers.setOnAction(e -> {
			playerList.getItems().clear();
			selectedList.getItems().clear();
			playerList.getItems().addAll(controller.getAvailable());
			selectedList.getItems().addAll(controller.getSelected());
			memoBox.setText(controller.getNumSelected() + " selected players. \n" + controller.getNumAvailable() + " available players." + 
					"\n\nPlease select a player.\nUse filter buttons to view only\nOffensive or Defensive Players.");
		});
		
		btOffense.setOnAction(e -> {
			playerList.getItems().clear();
			selectedList.getItems().clear();
			playerList.getItems().addAll(controller.getAvailableOffensive());
			selectedList.getItems().addAll(controller.getSelectedOffensive());
			memoBox.setText(controller.getNumSelected() + " selected players. \n" + controller.getNumAvailable() + " available players." + 
					"\n\nPlease select a player.\nUse filter buttons to view only\nOffensive or Defensive Players.");
		});
		
		btDefense.setOnAction(e -> {
			playerList.getItems().clear();
			selectedList.getItems().clear();
			playerList.getItems().addAll(controller.getAvailableDefensive());
			selectedList.getItems().addAll(controller.getSelectedDefensive());
			memoBox.setText(controller.getNumSelected() + " selected players. \n" + controller.getNumAvailable() + " available players." + 
					"\n\nPlease select a player.\nUse filter buttons to view only\nOffensive or Defensive Players.");
		});
		
		
		btSave.setOnAction(e -> controller.saveData());
		
		btSaveAndExit.setOnAction(e -> {
			controller.saveData();
			System.exit(0);
		});
		
		btSelect.setOnAction(e -> {
			controller.selectPlayer(playerList.getSelectionModel().getSelectedItem());
			playerList.getItems().clear();
			selectedList.getItems().clear();
			playerList.getItems().addAll(controller.getAvailable());
			selectedList.getItems().addAll(controller.getSelected());
			memoBox.setText(controller.getNumSelected() + " selected players. \n" + controller.getNumAvailable() + " available players." + 
					"\n\nPlease select another player.\nUse filter buttons to view only\nOffensive or Defensive Players.");
		});
		
		btDeselect.setOnAction(e -> {
			controller.deselectPlayer(selectedList.getSelectionModel().getSelectedItem());
			selectedList.getItems().clear();
			playerList.getItems().clear();
			selectedList.getItems().addAll(controller.getSelected());
			playerList.getItems().addAll(controller.getAvailable());
			memoBox.setText(controller.getNumSelected() + " selected players. \n" + controller.getNumAvailable() + " available players." + 
					"\n\nPlease select another player.\nUse filter buttons to view only\nOffensive or Defensive Players.");
		});
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(userPane, 800, 600);
		primaryStage.setTitle("KH Draft Central"); // Set title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
	
}
