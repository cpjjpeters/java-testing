package fxvb0404;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;

public final class KassaPane extends GridPane{
	private final Label bedragLabel, subtotaalLabel;
	private final TextField bedragVak, subtotaalVak;
	private final Kassa kassa;
	
	public KassaPane() {
		this.setPadding(new Insets(10,10,10,10));
		this.setVgap(5);
		this.setHgap(5);
		this.setAlignment(Pos.CENTER);
		
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
		this.add(bedragLabel, 0, 0);
		this.add(bedragVak,0,1);
		this.add(subtotaalLabel, 1, 0);
		this.add(subtotaalVak, 1, 1);
				
	}

}
