package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/*
Dato un array di N interi scrivere un programma Java per stampare i valori degli elementi in posizione pari.
*/

public class esercizio9 extends Application {
	
	Button bCalcola = new Button("Calcola");
	Button bAlloca = new Button("Alloca");
	
	TextField tNumero = new TextField("");
	TextField tK = new TextField("");
	
	Label lRis = new Label("Risultato");
	Label lStampa = new Label("Elenco");
	
	String elenco;
	
	int y;
	int vettore[];
	int somma;
	
	public void start(Stage finestra) {

		GridPane griglia = new GridPane();
		Scene scena = new Scene(griglia);

		griglia.add(tNumero, 0, 0);
		griglia.add(tK, 1, 0);
		griglia.add(bAlloca, 0, 2);
		griglia.add(bCalcola, 0, 3);
		griglia.add(lStampa, 0, 4);
		griglia.add(lRis, 0, 5);

		griglia.setHgap(10);
		griglia.setVgap(10);
		
		griglia.setPadding(new Insets(10));

		finestra.setScene(scena);
		finestra.setTitle("Leon");
		finestra.show();

		bCalcola.setOnAction(e -> calcola());
		bAlloca.setOnAction(e -> alloca());
	}
	
public void alloca() {
	int dimensione, max;
	dimensione = Integer.parseInt(tNumero.getText());
	max = Integer.parseInt(tK.getText());
	vettore = new int[dimensione];
	for (int i = 0; i < vettore.length; i++) {
		vettore[i] = (int) (Math.random() * max);
	}
	}

public void calcola() {

	for (int i = 0; i < vettore.length; i++) {

		if (i % 2 == 0) {
			somma = somma + vettore[i];
		}
		elenco = elenco + vettore[i] + "-";
	}
	lRis.setText(somma + "");
	lStampa.setText(elenco + "");
}


	
	public static void main(String []args) {
		launch(args);
	}

}
