package jana60.shop;

public class Cuffie extends Prodotti {
	private String colore;
	private boolean wireless;

	public Cuffie(String marca, double prezzo, double iva, String codice, String colore, boolean wireless) {
		super(marca, prezzo, iva, codice);
		this.colore = colore;
		this.wireless = wireless;
	}

	@Override
	public String toString() {
		if (wireless)
			return super.toString() + " " + "la cuffia é wireless  colore= " + colore;
		else
			return super.toString() + " " + "la cuffia non é wireless  colore= " + colore;

	}

}
