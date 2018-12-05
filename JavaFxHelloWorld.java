//Imports for Java FX
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
/***************************************************************************************************************************************

	Matthew Wright
	Lab # 10
	
****************************************************************************************************************************************/
public class JavaFxHelloWorld extends Application implements EventHandler<ActionEvent>{
	//Add Components here
	final Button btn = new Button();
	final Button exit_btn = new Button();
	
	//Create GUI in start() method
	public void start(Stage primaryStage){
	
		btn.setText("Say 'Hello World'");
		btn.setOnAction(this);
		
		FlowPane root = new FlowPane();
		root.getChildren().add(btn);
		
		Scene scene = new Scene(root, 300, 250);
		primaryStage.setTitle("Hello World!");
		primaryStage.setScene(scene);
		primaryStage.show();
	} // end start() method
	
	//Add Event code in handle() method
	public void handle(ActionEvent event){
		System.out.println("Hello World!");
		String tx = btn.getText();
		if(tx.equals("Go Falcons"))
			btn.setText("Go Braves");
		else
			btn.setText("Go Falcons");
	}// end handle() method
	
	//Use main() to launch the GUI application
	public static void main(String[] args){
		launch(args);
	}//end main()
}// end class