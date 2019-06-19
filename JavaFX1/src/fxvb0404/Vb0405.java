package fxvb0404;

import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;

public class Vb0405 {
	private final KassaPane kassaPane1;
	private final KassaPane kassaPane2;
	
	public Vb0405(GridPane p) {
		kassaPane1 = new KassaPane();
		kassaPane2 = new KassaPane();
		
		p.add(kassaPane1, 0, 0);
		p.add(kassaPane2, 1, 0);
		p.setAlignment(Pos.CENTER);
	}

}
