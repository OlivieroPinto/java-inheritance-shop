package jana60.shop;

public class Televisione extends Prodotti {
	private int grandezzaPollici;
	private String risoluzione;
	private boolean smart;

	public Televisione(String marca, double prezzo, double iva, String codice, int grandezzaPollici, String risoluzione,
			boolean smart) {
		super(marca, prezzo, iva, codice);
		this.grandezzaPollici = grandezzaPollici;
		this.risoluzione = risoluzione;
		this.smart = smart;
	}

	@Override
	public String toString() {
		if (smart)
			return super.toString() + " La televisione é smart " + "" + " Risoluzione= " + risoluzione + " "
					+ "Grandezza= : " + grandezzaPollici + " pollici";
		else
			return super.toString() + " La televisione non é smart ," + "" + "Risoluzione= " + risoluzione + " "
					+ "Grandezza= : " + grandezzaPollici + " pollici";
	}

}
