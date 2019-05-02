package be.ipeters.javafx2;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.*;

public class FXVb0202 extends Application {

	@Override
	public void start(Stage primaryStage) {
		FlowPane root = new FlowPane();
		Scene scene = new Scene(root, 300,250);
		
		new Vb0202(root);  // maakt GUI
		primaryStage.setScene(scene);
		primaryStage.setTitle("Title: test");
		primaryStage.show();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

}
