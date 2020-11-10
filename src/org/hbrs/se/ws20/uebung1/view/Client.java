package org.hbrs.se.ws20.uebung1.view;
import org.hbrs.se.ws20.uebung1.control.*;
import org.hbrs.se.ws20.uebung1.view.*;
import org.hbrs.se.ws20.uebung1.test.*;
public class Client {

	public void display( int aNumber ){
		// In dieser Methode soll die Methode translateNumber 
		// mit dem übergegebenen Wert der Variable aNumber 
		// aufgerufen werden.
		// Strenge Implementierung gegen das Interface Translator gewuenscht!
		Translator translator = Factory.createGermanTranslator();
		translator.translateNumber(aNumber);
	}
	//System.out.println("Das Ergebnis der Berechnung: " + "[das Ergebnis an dieser Stelle]" );
}




