package esercizioSettimana2;

import java.util.ArrayList;
import java.util.List;

import elements.Catalogo;
import elements.Libro;
import elements.Periodicità;
import elements.Rivista;

public class App {

	public static void main(String[] args) {
		// definizione attributi
		List<Catalogo> catalogo = new ArrayList<>();
		List<Catalogo> catalogoFiltratoPerISBN = new ArrayList<>();
		List<Catalogo> catalogoFiltratoPerAnnoPubblicazione = new ArrayList<>();
		List<Catalogo> listaLibri = new ArrayList<>();
		List<Libro> catalogoFiltratoPerAutore = new ArrayList<>();

		Libro harryPotter = new Libro("Harry Potter", 2002, 323,  "J K Rolling", "Fantasy","libro");
		Libro harryPotter2 = new Libro("Harry Potter2", 2004, 364, "J K Rolling", "Fantasy", "libro");
		Libro libroYes = new Libro("Yes man!", 1986, 234, "Ian Connor", "Commedy", "libro");
		Libro libroNo = new Libro("No man!", 1983, 276, "Ian Connor", "Commedy", "libro");
		Rivista vanityFair = new Rivista("Vanity Fair", 2023, 79, Periodicità.SEMESTRALE, "rivista");

		// Aggiunta di un elemento
		System.out.println("Aggiunta di un elemento\n");
		catalogo.add(harryPotter);
		System.out.println(catalogo);

		// Aggiunta di ulteriori elementi per poter svolgere e verificare agilmente i
		// punti seguenti richiesti dall'esercizio
		System.out.println(
				"\nAggiunta di ulteriori elementi per poter svolgere e verificare agilmente i punti seguenti richiesti dall'esercizio\n");
		catalogo.add(libroYes);
		catalogo.add(vanityFair);
		catalogo.add(harryPotter2);
		catalogo.add(libroNo);
		System.out.println(catalogo);
		// batsa che l'elemento inserito come paramentro sia del tipo Catalogo o un suo
		// Discentende, ovvero Libro o Rivista

		// Rimozione di un elemento del catalogo dato il ISBN
		System.out.println("\nRimozione di Harry Potter del catalogo dato il ISBN\n");
		catalogo = catalogo.stream().filter(c -> !(c.getISBN()).equals(harryPotter.getISBN())).toList();
		System.out.println(catalogo);

		// Ricerca di un elemento tramite ISBN
		System.out.println("\nRicerca di Harry Potter 2 del catalogo dato il ISBN\n");
		catalogoFiltratoPerISBN = catalogo.stream().filter(c -> (c.getISBN()).equals(harryPotter2.getISBN())).toList();
		System.out.println(catalogoFiltratoPerISBN);

		// Ricerca di un elemento tramite anno di publicazione
		System.out.println("Ricerca di un elemento tramite anno di publicazione 2002");
		catalogoFiltratoPerAnnoPubblicazione = catalogo.stream().filter(c -> (c.getAnnoPublicazione() == 2002))
				.toList();
		System.out.println(catalogoFiltratoPerAnnoPubblicazione);
		
		// Ricerca di un elemento tramite autore
		System.out.println("Ricerca di un elemento tramite autore");
		listaLibri = catalogo.stream().filter(c -> (c.getTipo()).equals("libro")).toList();
		// System.out.println(catalogoFiltratoPerAnnoPubblicazione);
	}
}
