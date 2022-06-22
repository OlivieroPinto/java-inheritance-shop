package jana60.shop;

import java.text.DecimalFormat;

public class Prodotti {
	private String marca;
	private double prezzo;
	private double iva;
	private String codice;

	public Prodotti(String marca, double prezzo, double iva, String codice) {
		this.marca = marca;
		this.iva = iva;
		this.prezzo = prezzo;
		this.codice = codice;
	}

	public String prezzoFinale() {
		DecimalFormat f = new DecimalFormat("#.##");
		String prezzoFinale = f.format(prezzo - (prezzo * iva));
		return prezzoFinale;
	}

	@Override
	public String toString() {
		return "Marca prodotto= " + marca + "  Prezzo=" + prezzoFinale() + " euro " + " codice=  " + codice;
	}

}
