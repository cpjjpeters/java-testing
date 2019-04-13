package TraficLight;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.*;

public class FXTraficLight extends Application{
	@Override
	public void start(Stage primaryStage) {
		
		FlowPane root = new FlowPane();
		// HBox root = new HBox();
		Scene scene = new Scene(root, 900,850);
		new VisualTL(root);    // maakt GUI
		primaryStage.setScene(scene);
		primaryStage.setTitle("TraficLight");
		primaryStage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("TraficLight");
		launch(args);
	}
}
