package fxvb0201;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.*;


public class FXVb0201 extends Application{
	@Override
	public void start(Stage primaryStage) {
		FlowPane root = new FlowPane();
		Scene scene = new Scene(root, 600,250);
//		primaryStage.setFullScreen(true);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Eerste applicatie");
		primaryStage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("FXVb0201");
		launch(args);
	}

}
