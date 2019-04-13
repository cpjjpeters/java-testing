package TraficLight;

import javafx.scene.paint.Color;
import javafx.scene.control.Button;
import javafx.scene.shape.*;
import javafx.scene.layout.Pane;

public class VisualTL {
	private final Button knop;
	private final Circle cirkelR,cirkelO,cirkelG;
	private final Rectangle vierkant, rechthoek;
	private int straal;

public VisualTL(Pane p) {
	knop = new Button("Change color");
	straal = 10;
	cirkelR = new Circle(100,125,straal,Color.RED);
	cirkelO = new Circle(150,150,30,Color.ORANGE);
	cirkelG = new Circle(500,500,straal,Color.GREEN); 
	vierkant=new Rectangle(90,35,130,130);
	rechthoek=new Rectangle(180,85,100,30);
	rechthoek.relocate(300, 300);
	cirkelO.relocate(800, 200);
	knop.setOnAction(event -> {
		straal++;
		cirkelR.setRadius(straal);
	});
	p.getChildren().addAll(cirkelR, cirkelO,cirkelG);
}

}
