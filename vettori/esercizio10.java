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
Dato un array di N interi scrivere un programma Java per trovare l’elemento 
di valore massimo e l’indice (nell’intervallo da 0 a N-1) della sua posizione.
*/

public class esercizio10 extends Application { 
	
	Button bCalcola = new Button("Calcola");
	
	TextField tNumero = new TextField("");					
	
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

	}


	public void calcola() {
		int massimo=0;
		int pos=0;
		
		String elenco= tNumero.getText();
		String numeri[]=elenco.split(",");

		int numeriN[]= new int [numeri.length];
		
		
		
		for(int i=0;i<vettore.length;i++) {
			numeriN[i]=Integer.parseInt(numeri[i]);
			
		}
		for (int i=0;i<=numeriN.length;i++) {
			if(numeriN[i]>massimo) {
				massimo=numeriN[i];
				pos=i;
				
			}
		}
		lStampa.setText(elenco);
		lRis.setText("Massimo"+massimo+"Posizione:"+ pos);

		}
			
	public static void main(String []args) {
		launch(args);
	}

}

