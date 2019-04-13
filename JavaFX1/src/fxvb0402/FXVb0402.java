package fxvb0402;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.layout.GridPane;

public class FXVb0402 extends Application{
	@Override
	public void start(Stage primaryStage) {
		GridPane root = new GridPane();
		Scene scene = new Scene(root);
		new Vb0402(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Vb0402");
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
