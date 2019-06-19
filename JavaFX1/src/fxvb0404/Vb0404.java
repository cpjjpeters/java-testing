package fxvb0404;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;

public class Vb0404 {
	private final Label bedragLabel, subtotaalLabel;
	private final TextField bedragVak, subtotaalVak;
	private final Kassa kassa;
	
	public Vb0404(GridPane p) {
		p.setPadding(new Insets(10,10,10,10));
		p.setVgap(5);
		p.setHgap(5);
		p.setAlignment(Pos.CENTER);
		
		kassa = new Kassa();
		bedragLabel = new Label("Voer bedrag in ");
		subtotaalLabel = new Label("Subtotaal:");
		
		subtotaalVak=new TextField();
		bedragVak = new TextField();
		bedragVak.setAlignment(Pos.CENTER_RIGHT);
		
		subtotaalVak.setEditable(false);
		subtotaalVak.setAlignment(Pos.CENTER_RIGHT);
		// event handling
		bedragVak.setOnAction(event->{
			String invoer = bedragVak.getText();
			double invoerbedrag=0;
			try {
				invoerbedrag = Double.parseDouble(invoer);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			kassa.telOp(invoerbedrag);
			double st = kassa.getSubtotaal();
			subtotaalVak.setText(String.format("%.2f", st));
			// maak invoer leeg
			bedragVak.setText("");
		});
		
		// voeg toe
		p.add(bedragLabel, 0, 0);
		p.add(bedragVak,0,1);
		p.add(subtotaalLabel, 1, 0);
		p.add(subtotaalVak, 1, 1);
				
	}

}
