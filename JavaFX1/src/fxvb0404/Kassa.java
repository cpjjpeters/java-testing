package fxvb0404;

public class Kassa {
	private double subtotaal;
	public void telOp(double bedrag) {
		subtotaal += bedrag;
	}
	public double getSubtotaal() {
		return subtotaal;
	}
	public void setSubtotaal(double subtotaal) {
		this.subtotaal = subtotaal;
	}
	

}
