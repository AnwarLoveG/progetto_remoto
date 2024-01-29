package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/*Dato un array di N interi scrivere un programma
 Java per verificare se contiene almeno un elemento di valore minore di k.
 */

public class esercizio17 extends Application {
	
	TextField tNumeri = new TextField();
	Label lRis = new Label("risultato");
	int vettore[];
	
	public void start(Stage finestra) {
		Button pCalcola = new Button("Soluzione facile");
		Label lVett = new Label("numeri separati da ',' ");
		GridPane griglia = new GridPane();
		griglia.add(tNumeri, 0, 0);
		griglia.add(lVett, 1, 0);
		griglia.add(pCalcola, 0, 1);
		griglia.add(lRis, 0, 2);
		griglia.setPadding(new Insets(20));
		griglia.setHgap(20);
		griglia.setVgap(20);
		Scene scena = new Scene(griglia, 700, 500);
		finestra.setScene(scena);
		finestra.setTitle("numeri maggiori di K");
		finestra.show();
		pCalcola.setOnAction(e -> calcola());


	}

		
	public void calcola() {
		Boolean crescente = true;
		int contatore = 0;
		String s[];
		s = tNumeri.getText().split(",");
		vettore = new int[s.length];
		for (int i = 0; i < s.length; i++) {
			vettore[i] = Integer.parseInt(s[i]);
		}
		
		for(int i=0; crescente && i<vettore.length-1; i++) {
			if (vettore[i]>=vettore[i+1]) {
				crescente = false; 
			}
		}
		lRis.setText("Se il risultato è True Il vettore è crescente, Se il risutato è  False  Il vettore non è crescente :  " + crescente);	
	}
	public static void main (String []args) {
		launch(args);	
		}
}

