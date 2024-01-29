package it.edu.iisgubbio.vettori;
	
	import javafx.application.Application;
	import javafx.scene.Scene;
	import javafx.scene.control.Button;
	import javafx.scene.control.Label;
	import javafx.scene.control.TextField;
	import javafx.scene.layout.GridPane;
	import javafx.stage.Stage;

	public class magMinMed extends Application{
		
		TextField tNum=new TextField();
		TextField tInd=new TextField();
		
		Label lEle=new Label();
		Label lMedia=new Label();
		Label lNum=new Label();
		Label lMag=new Label("");
		Label lMin=new Label("");
		
		int vettore[];
		int pos;
		int i;
		int media;
		int numTempi;
		
		String d="";
		String a="";
		String c="";
		String risposta="";
		
		public void start(Stage finestra) {
			Button bAlloca=new Button("Alloca");
			Button bInserisci=new Button("Inserisci");
			Button bStampa=new Button("Stampa");
			Button bCalcola=new Button("calcola");
			GridPane griglia=new GridPane();
			
			griglia.add(tNum, 0, 0);
			griglia.add(tInd, 1, 0);
			griglia.add(bAlloca, 0, 1);
			griglia.add(lNum, 1, 1);
			griglia.add(bInserisci, 0, 2);
			griglia.add(bStampa, 0, 3);
			griglia.add(lEle, 0, 4);
			griglia.add(lMedia, 0, 5);
			griglia.add(lMag, 0, 6);
			griglia.add(lMin, 0, 7);
			griglia.add(bCalcola, 0, 8);
			
			griglia.setHgap(20);
			griglia.setVgap(20);
			
			bAlloca.setOnAction(e->alloca());
			bInserisci.setOnAction(e->inserisci());
			bStampa.setOnAction(e->stampa());
			bCalcola.setOnAction(e->calcola());
			
			Scene scena=new Scene(griglia);
			finestra.setScene(scena);
			finestra.setTitle("Tempi Piscina");
			finestra.show();
		}
		public void alloca() {
			vettore=new int[Integer.parseInt(tInd.getText())];
			pos=0;
		}
		public void inserisci() {
			if(pos<vettore.length) {
				vettore[pos++]=Integer.parseInt(tNum.getText());
				tNum.setText("");
			}
		}
		public void stampa() {
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
		public void calcola() {
			for (int i=0;i<numTempi;i++) {
				if (vettore[i]>media) {
					a=a+"-";
						
					}
				else {
					c=c+vettore[i]+"-";
					if (i<numTempi-1) {
						c=c+"-";
					}
				}
				
				}
			lMag.setText(c);
			lMin.setText(a);
			} 
		
		
				
			
		
		public static void main(String[]args) {
			launch(args);
		}

	}
