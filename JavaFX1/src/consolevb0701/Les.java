package consolevb0701;

public class Les {
	private final String vak;
	private final Tijdstip tijdstip;
	private final String lokaal;
	public Les(String vak, Tijdstip tijdstip, String lokaal) {
		super();
		this.vak = vak;
		this.tijdstip = tijdstip;
		this.lokaal = lokaal;
	}
	public String getVak() {
		return vak;
	}
	public Tijdstip getTijdstip() {
		return tijdstip;
	}
	public String getLokaal() {
		return lokaal;
	}
	@Override
	public String toString() {
		return "Les [vak=" + vak + ", tijdstip=" + tijdstip + ", lokaal=" + lokaal + "]";
	}
	

}
