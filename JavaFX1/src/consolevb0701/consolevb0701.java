package consolevb0701;
import java.util.ArrayList;
public class consolevb0701 {
	
	public static void main(String[] args) {
		System.out.println("0701");
		
		Lesrooster rooster = new Lesrooster();
		
		Les les = new Les("Java", new Tijdstip("maandag", 3), "D021");
		rooster.voegtoe(les);
		 les = new Les("Java", new Tijdstip("maandag", 4), "D021");
		rooster.voegtoe(les);
		les = new Les("Wiskunde", new Tijdstip("dinsdag", 6), "A505");
		rooster.voegtoe(les);
		
		rooster.print();
		System.out.println("-------------------------");
		System.out.println(rooster.toString());
		System.out.println("-------------------------");
	}

}
