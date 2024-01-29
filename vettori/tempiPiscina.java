package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class tempiPiscina extends Application {
	
	TextField tNum=new TextField();
	TextField tInd=new TextField();
	
	Label lEle=new Label();
	Label lMedia=new Label();
	Label lNum=new Label();
	
	int vettore[];
	int pos;
	int i;
	
	public void start(Stage finestra) {
		
		Button bAlloca=new Button("Alloca");
		Button bInserisci=new Button("Inserisci");
		Button bStampa=new Button("Stampa");
		Button bCalcola=new Button("Calcola");
		GridPane griglia=new GridPane();
		
		griglia.add(tNum, 0, 0);
		griglia.add(tInd, 1, 0);
		griglia.add(bAlloca, 0, 1);
		griglia.add(lNum, 1, 1);
		griglia.add(bInserisci, 0, 2);
		griglia.add(bStampa, 0, 3);
		griglia.add(lEle, 0, 4);
		griglia.add(lMedia, 0, 5);
		
		griglia.setHgap(10);
		griglia.setVgap(10);
		
		bAlloca.setOnAction(e->alloca());
		bInserisci.setOnAction(e->inserisci());
		bStampa.setOnAction(e->stampa());
		bCalcola.setOnAction(e->calcola());
		
		Scene scena=new Scene(griglia);
		finestra.setScene(scena);
		finestra.setTitle("Tempi Piscina");
		finestra.show();
	}
	private void alloca() {
		vettore=new int[Integer.parseInt(tInd.getText())];
		pos=0;
	}
	private void inserisci() {
		if(pos<vettore.length) {
			vettore[pos++]=Integer.parseInt(tNum.getText());
			tNum.setText("");
		}
	}
	private void stampa() {
		int somma=0;
		double media=0;
		String s="";
		for(i=0;i<vettore.length;i++) {
			s=s+vettore[i]+"-";
			somma+=vettore[i];
		}
		media=somma/vettore.length;
		lEle.setText(s);
		lMedia.setText(""+media);
	}
	private void calcola(){
		
	}
	public static void main(String[]args) {
		launch(args);
	}

}


