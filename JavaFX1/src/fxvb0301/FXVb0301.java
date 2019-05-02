package fxvb0301;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.*;

public class FXVb0301 extends Application {

	@Override

	public void start(Stage primaryStage) {
		Pane root = new Pane();

		Scene scene = new Scene(root, 400, 275);
		// maakt GUI
		new Vb0301(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Title: Vb0301");
		primaryStage.show();
	}

	public static void main(String[] args) {
		//
		launch(args);
	}

}