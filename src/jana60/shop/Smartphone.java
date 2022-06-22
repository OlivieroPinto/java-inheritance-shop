package jana60.shop;

import java.util.Random;

public class Smartphone extends Prodotti {
	String codiceImei;
	int memoria;

	public Smartphone(String marca, double prezzo, double iva, String codice, int memoria) {
		super(marca, prezzo, iva, codice);
		this.codiceImei = CalcoloImei();
		this.memoria = memoria;
	}

	public String CalcoloImei() {
		String codiceImei = "";
		Random rand = new Random();
		for (int i = 0; i < 14; i++) {
			codiceImei += rand.nextInt(10);
		}
		return codiceImei;
	}

	@Override
	public String toString() {
		return super.toString() + " " + "codice imei=" + CalcoloImei() + "  memoria =" + memoria;
	}
}