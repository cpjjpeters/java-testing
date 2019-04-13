package fxvb0308;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.*;

public class FXVb0308 extends Application{
	@Override
	public void start(Stage primaryStage) {
		
		FlowPane root = new FlowPane();
		Scene scene = new Scene(root, 300,250);
		new Vb0308(root);    // maakt GUI
		primaryStage.setScene(scene);
		primaryStage.setTitle("Vb0308");
		primaryStage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("FXVb0308");
		launch(args);
	}
}
