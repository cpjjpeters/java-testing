package fxvb0301;

import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Vb0301 {
	private final int a , b , antwoord;
	private final Text teksttitel, teksta, tekstb, tekstantwoord;
	
	public Vb0301(Pane p) {
		a=12;
		b=13;
		antwoord = a+b;
		
		teksttitel = new Text(40,20, "Overzicht van de berekening");
		teksta = new Text(50,45, "a= "+a);
		tekstb = new Text(50,70, "b= "+b);
		tekstantwoord = new Text(50,100, "De som is "+antwoord);
		tekstantwoord.setFont(new Font (20));
		p.getChildren().addAll(teksttitel, teksta, tekstb, tekstantwoord);
	}

}
