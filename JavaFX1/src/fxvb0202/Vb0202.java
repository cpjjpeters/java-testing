package fxvb0202;
// GUI-klasse met een knop en een tekstvak
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class Vb0202 {
	private final Button knop;
	private final Button knopw;
	private final TextField tekstvak;
	private final TextField tekstvak2;
	
	public Vb0202(FlowPane p) {
		knop = new Button("Klik");
		knopw = new Button("Wis");
		tekstvak = new TextField();
		tekstvak2 = new TextField();
		knop.setOnAction(event ->{
			tekstvak.setText("je hebt geklikt");
			tekstvak2.clear();
		});
		knopw.setOnAction(event ->{
			tekstvak.setText("");
			tekstvak2.setText("gewist");
		});
		
		
		p.getChildren().add(knop);
		p.getChildren().add(tekstvak);
		p.getChildren().add(knopw);
		p.getChildren().add(tekstvak2);
	}

}
