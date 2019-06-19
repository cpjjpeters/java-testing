package consolevb0701;

public class Tijdstip {
	private final String dag;
	private final int uur;
	public Tijdstip(String dag, int uur) {
		super();
		this.dag = dag;
		this.uur = uur;
	}
	public String getDag() {
		return dag;
	}
	public int getUur() {
		return uur;
	}
	@Override
	public String toString() {
		return "Tijdstip [dag=" + dag + ", uur=" + uur + "]";
	}

}
