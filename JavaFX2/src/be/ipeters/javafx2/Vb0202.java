package be.ipeters.javafx2;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class Vb0202 {
	private final Button knop;
	private final TextField tekstvak;
	
	public Vb0202(FlowPane p) {
		knop = new Button("Klik");
		tekstvak = new TextField();
		p.getChildren().add(knop);
		p.getChildren().add(tekstvak);
	}

}
