package be.ipeters.javafx2;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.*;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloFXApp extends Application{
	public static void main(String[] args) {
		// launch the JavaFX application
		Application.launch(args);
	}
	@Override
	public void start(Stage stage) {
		Label nameLbl = new Label("Enter your name:");
		TextField nameFld = new TextField();
		Label msg = new Label();
		//Text msg = new Text("Hello JavaFX");
		msg.setStyle("-fx-text-fill:blue;");
		
		// create buttons
		Button sayHelloBtn = new Button("Say Hello");
		Button exitBtn = new Button("Exit");
		
		// add the event handler for the S H btn
		sayHelloBtn.setOnAction(e -> {
			String name = nameFld.getText();
			if(name.trim().length()>0) {
				msg.setText("Hello "+name);
			}
			else {
				msg.setText("Hello there");
			}
		});
		//
		exitBtn.setOnAction(e-> Platform.exit());
		
		VBox root = new VBox();
		// set the vertical spacing between children
		root.setSpacing(5);
		
		root.getChildren().addAll(nameLbl,nameFld,msg,sayHelloBtn, exitBtn);
		
		Scene scene  = new Scene(root, 350,150);
		stage.setScene(scene);
		
		// set the title for the stage
		stage.setTitle("Impoved hello JavaFX application");
		// show the stage
		stage.show();
	}

}
