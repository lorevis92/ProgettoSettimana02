package elements;

public class Rivista extends Catalogo {
	// dichiarazione attributi
	Periodicità periodicità;

	public Rivista(String titolo, int annoPublicazione, int numeroPagine, Periodicità periodicità, String tipo) {
		super(titolo, annoPublicazione, numeroPagine, tipo);
		this.periodicità = periodicità;
	}

	@Override
	public String toString() {
		return ("ISBN: " + this.ISBN + "\nTitolo: " + this.titolo + "\nAnno di publicazione: " + this.annoPublicazione
				+ "\nNumero pagine: " + this.numeroPagine + "\nPeriodicità: " + this.periodicità
				+ "\n--------------------------------------------\n");
	}

}
