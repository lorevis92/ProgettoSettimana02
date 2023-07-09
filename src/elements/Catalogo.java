package elements;

import java.util.UUID;

public class Catalogo {
	// definizione attributi
	protected UUID ISBN;
	protected String titolo;
	protected int annoPublicazione;
	protected int numeroPagine;
	protected String tipo;

	// costruttore
	public Catalogo(String titolo, int annoPublicazione, int numeroPagine, String tipo) {
		this.setISBN(UUID.randomUUID());
		this.setTitolo(titolo);
		this.setAnnoPublicazione(annoPublicazione);
		this.setNumeroPagine(numeroPagine);
		this.setTipo(tipo);
	}

	@Override
	public String toString() {
		return ("ISBN: " + this.ISBN + "\nTitolo: " + this.titolo + "\nAnno di publicazione: " + this.annoPublicazione
				+ "\nNumero pagine: " + this.numeroPagine + "\n--------------------------------------------\n");
	}

	// Getters e Setters
	public UUID getISBN() {
		return ISBN;
	}

	public void setISBN(UUID uuid) {
		ISBN = uuid;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public int getAnnoPublicazione() {
		return annoPublicazione;
	}

	public void setAnnoPublicazione(int annoPublicazione) {
		this.annoPublicazione = annoPublicazione;
	}

	public int getNumeroPagine() {
		return numeroPagine;
	}

	public void setNumeroPagine(int numeroPagine) {
		this.numeroPagine = numeroPagine;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
