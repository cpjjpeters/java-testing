package fxvb0404;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FXVb0405 extends Application {

	@Override
	public void start(Stage primaryStage) {
//       FlowPane root = new FlowPane();
//       Scene scene = new Scene(root, 300,250);
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));
		Scene scene = new Scene(grid, 400, 375);
		// maakt GUI
		new Vb0405(grid);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Title: Kassa");
		primaryStage.show();
	}

	public static void main(String[] args) {
		//
		launch(args);
	}

}
