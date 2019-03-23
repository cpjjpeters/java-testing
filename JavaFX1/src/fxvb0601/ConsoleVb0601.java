package fxvb0601;

public class ConsoleVb0601 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Datum datum;
		datum = new Datum();
		datum.setDag(31);
		datum.setMaand(2);
		datum.setJaar(2020);
		
		System.out.println("" +datum.getDag()
		+ "-" + datum.getMaand()
		+ "-" + datum.getJaar()); 

	}

}
