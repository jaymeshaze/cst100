import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * 
 */

/**
 * (Text viewer) Write a program that displays a text file
 * in a text area, as shown in Figure 16.40a. The user enters
 * a file name in a text field and clicks the View button;
 * the file is then displayed in a text area.
 * 
 * Hint: This is an important exercise – you will need this skill to
 * complete your project next week!
 * 
 * @author Kris
 * @version 1.0
 * @since 07-04-2016
 *
 */
public class Main extends Application{
	//create text fields and buttons to be used
	private TextField filepath = new TextField();
	private Button btView = new Button("View");
	TextArea fileToText = new TextArea();
	Label label1 = new Label("Filepath:");
	
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		
		//create scrollbar
		ScrollBar sbHorizontal = new ScrollBar();
		ScrollBar sbVertical = new ScrollBar();
		sbVertical.setOrientation(Orientation.VERTICAL);
		
		//create HBox for bottom layer
		HBox hboxBottom = new HBox();
		hboxBottom.setSpacing(10);
		hboxBottom.setAlignment(Pos.CENTER);
		hboxBottom.getChildren().add(label1);
		hboxBottom.getChildren().add(filepath);
		hboxBottom.getChildren().add(btView);
		
		//create file text pane
		BorderPane textPane = new BorderPane();
		textPane.setCenter(fileToText);
		textPane.setBottom(sbHorizontal);
		textPane.setRight(sbVertical);
		
		
		//create pane and set elements to appropriate location
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(textPane);
		borderPane.setBottom(hboxBottom);
		
		// Listener for horizontal scroll bar value change
		sbHorizontal.valueProperty().addListener(ov ->
		fileToText.setLayoutX(sbHorizontal.getValue() * textPane.getWidth() /
		sbHorizontal.getMax()));
		
		// Listener for vertical scroll bar value change
		sbVertical.valueProperty().addListener(ov ->
		fileToText.setLayoutY(sbVertical.getValue() * textPane.getHeight() /
		sbVertical.getMax()));
		
		// Process methods per button (shortened version)
		btView.setOnAction(e -> viewFile());
		
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(borderPane, 500, 350);
		primaryStage.setTitle("FileViewer"); // Set title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
	
	public void viewFile(){
		File fileInput = new File(filepath.getText());
		//create Scanner to read file and StringBuilder to help write
		Scanner file;
		StringBuilder fileReader = new StringBuilder();
		
		//loop to write each line of the file to TextArea
		try{
			file = new Scanner(fileInput);
			while(file.hasNextLine()){
				fileReader.append(file.nextLine() + "\n");
			}
			fileToText.setText(fileReader.toString());
		}catch (IOException ex){
			fileToText.setText("Cannot read file.");
		}
	}

	//default application launch
	public static void main(String[] args) {
		Application.launch(args);
	}
	
}

