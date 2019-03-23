package fxvb0602;

public class Bankrekening {
	// Attricbuten
	private final String rekeningnummer;
	private double saldo;
	
	// Methoden
	public double getSaldo() {
		return saldo;
	}
	public void stort(double bedrag) {
		saldo += bedrag;
	}
	public double neemOp(double bedrag) {
		saldo -= bedrag;
		return bedrag;
	}
	//
	public Bankrekening(String reknr, double bedrag) {
		this.rekeningnummer = reknr;
		this.saldo = bedrag;
	}
}
