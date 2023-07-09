package esercizioSettimana2;

import elements.Catalogo;
import elements.Libro;
import elements.Periodicità;
import elements.Rivista;

public class App {

	public static void main(String[] args) {

		Catalogo rivista = new Catalogo("HarryPorker", 233, 323);
		Catalogo rivista2 = new Catalogo("HarryPorker", 233, 323);
		System.out.println(rivista.toString());
		System.out.println(rivista2.toString());
		Libro yes = new Libro("Yes man!", 2334, 3234, "Unknown", "Commedy");
		System.out.println(yes.toString());
		Rivista riv1 = new Rivista("vanityPirl", 425, 4554, Periodicità.SEMESTRALE);
		System.out.println(riv1.toString());
	}

}
