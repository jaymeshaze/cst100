/**
 * Main is currently used for testing other class' functionality.
 * 
 * @author Kris
 * @version 2.0
 * @since 07-16-2016
 */

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

	//instantiate the MVC classes
	static public View view;
	static public Controller controller;
	static public PlayerManager testManager;
	
	
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		
		//create specific model, controller and view objects to control
		testManager = new PlayerManager(controller.getFilePath());
		controller = new Controller(testManager);
		view = new View(controller, primaryStage, testManager.getAvailable(), testManager.getSelected());
		
		
	}

	//required for JavaFX in Eclipse IDE
	public static void main(String[] args) {
		Application.launch(args);
		
	}
	
}
