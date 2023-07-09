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
		Catalogo harryPotter = new Catalogo("Harry Potter", 2002, 323);
		Catalogo harryPotter2 = new Catalogo("Harry Potter2", 2004, 364);
		Libro libroYes = new Libro("Yes man!", 1986, 234, "Unknown", "Commedy");
		Rivista vanityFair = new Rivista("Vanity Fair", 2023, 79, Periodicità.SEMESTRALE);

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
		System.out.println(catalogo);
		// batsa che l'elemento inserito come paramentro sia del tipo Catalogo o un suo
		// Discentende, ovvero Libro o Rivista

		// Rimozione di un elemento del catalogo dato il ISBN
		System.out.println("\nRimozione di Harry Potter del catalogo dato il ISBN\n");
		catalogo = catalogo.stream().filter(c -> !(c.getISBN()).equals(harryPotter.getISBN())).toList();
		System.out.println(catalogo);

		// Ricerca di un elemento tramite ISBN
		System.out.println("\nRicerca di Harry Potter 2 del catalogo dato il ISBN\n");
		catalogo = catalogo.stream().filter(c -> (c.getISBN()).equals(harryPotter2.getISBN())).toList();
		System.out.println(catalogo);
//		Catalogo rivista = new Catalogo("HarryPorker", 233, 323);
//		Catalogo rivista2 = new Catalogo("HarryPorker", 233, 323);
//		System.out.println(rivista.toString());
//		System.out.println(rivista2.toString());
//		Libro yes = new Libro("Yes man!", 2334, 3234, "Unknown", "Commedy");
//		System.out.println(yes.toString());
//		Rivista riv1 = new Rivista("vanityPirl", 425, 4554, Periodicità.SEMESTRALE);
//		System.out.println(riv1.toString());
	}

	// definizione metodo

}
