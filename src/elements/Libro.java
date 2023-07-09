package elements;

public class Libro extends Catalogo {

	// definizione attributi

	private String autore;
	private String genere;

	// definizione costruttore
	public Libro(String titolo, int annoPublicazione, int numeroPagine, String autore, String genere) {
		super(titolo, annoPublicazione, numeroPagine);
		this.autore = autore;
		this.genere = genere;
	}

	@Override
	public String toString() {
		return ("ISBN: " + this.ISBN + "\nTitolo: " + this.titolo + "\nAnno di publicazione: " + this.annoPublicazione
				+ "\nNumero pagine: " + this.numeroPagine + "\nAutore: " + this.autore + "\nGenere: " + this.genere
				+ "\n--------------------------------------------\n");
	}

	// getters e setters
	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}
}
