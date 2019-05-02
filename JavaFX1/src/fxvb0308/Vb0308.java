package fxvb0308;

import javafx.scene.paint.Color;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;
import javafx.scene.layout.Pane;

public class Vb0308 {
	private final Button knop;
	private final Circle cirkel;
	private int straal, kl;
	
	public Vb0308(Pane p) {
		knop = new Button("Groter");
		straal = 10;
		kl =100;
		Color rood = Color.rgb(kl+150, kl, kl);
		cirkel = new Circle(250,250,straal,rood);
		
		knop.setOnAction(event -> {
			straal++;
			kl+=10;
			cirkel.setRadius(straal);
		});
		p.getChildren().addAll(knop,cirkel);
	}

}
