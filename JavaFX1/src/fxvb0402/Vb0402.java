package fxvb0402;

import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;

public class Vb0402 {
	private TextField invoervak,uitvoervak;
	private final Button knopBTW;
	private final double percentageBTW;
	
	public Vb0402(GridPane p) {
		percentageBTW = 21.0;
		invoervak = new TextField();
		uitvoervak = new TextField();
		knopBTW=new Button("Inclusief "+ percentageBTW+"% btw");
		
		invoervak.setAlignment(Pos.CENTER_RIGHT);
		uitvoervak.setAlignment(Pos.CENTER_RIGHT);
		knopBTW.setOnAction(event ->{
			String invoer = invoervak.getText();
			double invoerGetal = Double.parseDouble(invoer);
			
			double uitvoerGetal =(1+percentageBTW/100)*invoerGetal;
			uitvoervak.setText(""+uitvoerGetal);
		});
		p.add(invoervak, 0, 0);
		p.add(knopBTW, 1, 0);
		p.add(uitvoervak, 0, 1);
	}

}
