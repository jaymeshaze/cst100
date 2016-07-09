
/**
 * (Create a simple calculator) Write a program to perform addition,
 * subtraction, multiplication, and division, as shown in Figure 15.25a.
 * 
 * Hint: This is an important exercise – you will need this skill to
 * complete your project next week!
 * 
 * @author Kris
 * @version 1.0
 * @since 07-04-2016
 *
 */
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application{
	//create text fields and buttons to be used
	private TextField number1 = new TextField();
	private TextField number2 = new TextField();
	private TextField result = new TextField();
	private Button btAdd = new Button("Add");
	private Button btSubtract = new Button("Subtract");
	private Button btMultiply = new Button("Multiply");
	private Button btDivide = new Button("Divide");
	
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		
		//create text labels, set result to not editable
		Text Num1Text = new Text("Number 1:");
		Text Num2Text = new Text("Number 2:");
		Text resultText = new Text("Result:");
		result.setEditable(false);
		
		//create HBox for top layer
		HBox hboxTop = new HBox();
		hboxTop.setSpacing(10);
		hboxTop.getChildren().add(Num1Text);
		hboxTop.getChildren().add(number1);
		hboxTop.getChildren().add(Num2Text);
		hboxTop.getChildren().add(number2);
		hboxTop.getChildren().add(resultText);
		hboxTop.getChildren().add(result);
		
		//create HBox for bottom layer
		HBox hboxBottom = new HBox();
		hboxBottom.setSpacing(10);
		hboxBottom.getChildren().add(btAdd);
		hboxBottom.getChildren().add(btSubtract);
		hboxBottom.getChildren().add(btMultiply);
		hboxBottom.getChildren().add(btDivide);


		// Center HBox
		hboxTop.setAlignment(Pos.CENTER);
		hboxBottom.setAlignment(Pos.CENTER);
		
		//create pane and set Hbox to appropriate location
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(hboxTop);
		borderPane.setBottom(hboxBottom);
		
		// Process methods per button (shortened version)
		btAdd.setOnAction(e -> addNumbers());
		btSubtract.setOnAction(e -> subtractNumbers());
		btMultiply.setOnAction(e -> multiplyNumbers());
		btDivide.setOnAction(e -> divideNumbers());
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(borderPane, 350, 100);
		primaryStage.setTitle("SimpleCalculator"); // Set title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
	//method to add numbers
	private void addNumbers() {
		// Get values from text fields
		double numOne = Double.parseDouble(number1.getText());
		double numTwo = Double.parseDouble(number2.getText());
		
		// Display result
		result.setText(String.format("%.1f", numOne + numTwo));
	}
	//method to subtract numnbers
	private void subtractNumbers() {
		// Get values from text fields
		double numOne = Double.parseDouble(number1.getText());
		double numTwo = Double.parseDouble(number2.getText());
		
		// Display result
		result.setText(String.format("%.1f", numOne - numTwo));
	}
	//method to multiply numbers
	private void multiplyNumbers() {
		// Get values from text fields
		double numOne = Double.parseDouble(number1.getText());
		double numTwo = Double.parseDouble(number2.getText());
		
		// Display result
		result.setText(String.format("%.1f", numOne * numTwo));
	}
	//method to divide numbers
	private void divideNumbers() {
		// Get values from text fields
		double numOne = Double.parseDouble(number1.getText());
		double numTwo = Double.parseDouble(number2.getText());
		
		// Display result
		result.setText(String.format("%.1f", numOne / numTwo));
	}
	//default application launch
	public static void main(String[] args) {
		Application.launch(args);
	}
	
}
