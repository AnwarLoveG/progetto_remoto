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
 Dato un array di N interi scrivere un programma Java per contare gli elementi pari.
 */

public class esercizio6 extends Application {
	
	Button bCalcola = new Button("Calcola");
	Button bAlloca = new Button("Alloca");
	
	TextField tNumero = new TextField("");
	TextField tMax = new TextField("");
	
	Label lRis = new Label("Risultato");
	Label lStampa = new Label("Elenco");
	
	String elenco;
	
	int y;
	int vettore[];
	int contaPari;
	
	public void start(Stage finestra) {

		GridPane griglia = new GridPane();
		Scene scena = new Scene(griglia);

		griglia.add(tNumero, 0, 0);
		griglia.add(tMax, 1, 0);
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
	max = Integer.parseInt(tMax.getText());
	vettore = new int[dimensione];
	for (int i = 0; i < vettore.length; i++) {
		vettore[i] = (int) (Math.random() * max);
	}
	}
public void calcola() {
	for(int i=0;i<vettore.length;i++) {
		if(vettore[i]%2==0) {
			contaPari=contaPari++;
			
		}
		elenco=elenco+vettore[i]+"-";
	}
	lRis.setText(contaPari+"");
	lStampa.setText(elenco+"");
}
	
	public static void main(String []args) {
		launch(args);
	}

}
