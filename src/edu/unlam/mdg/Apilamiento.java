package edu.unlam.mdg;

import java.util.ArrayList;
import java.util.Collections;

public class Apilamiento {
	private ArrayList<Mesada> mesadas;

	public Apilamiento(ArrayList<Mesada> mesadas) {
		this.mesadas = mesadas;
	}
	
	public int apilar() {
		//Debo buscar la mesa no apilable
		ArrayList<Mesada> mesadasApiladas = new ArrayList<>();
		ArrayList<Integer> indexABorrar = new ArrayList<>();
		
		Collections.sort(this.mesadas);	//las ordeno
		
		int indexPila;
		while(!this.mesadas.isEmpty()) {
			
			mesadasApiladas.add(this.mesadas.get(0));	//Guardo la primer mesada ya que es la mas grande por lo tanto la menos apilable
			indexPila = mesadasApiladas.size()-1;	//guarda el index de la mesada sobre la cual estoy apilando
			this.mesadas.remove(0);
			
			for(int i=0;i<this.mesadas.size();i++) {//apilo
					if(this.mesadas.get(i).esApilable(mesadasApiladas.get(indexPila))) {
						mesadasApiladas.set(indexPila, this.mesadas.get(i));
						indexABorrar.add(i);	//guardo los index de las mesas ya apiladas para borrarlas
					}
			}
			
			for(int j=indexABorrar.size()-1; j > -1;j--)	//borro las mesadas que ya apile
				this.mesadas.remove((int)indexABorrar.get(j));
			
			indexABorrar.clear();	//lo limpio
		}
			
		return mesadasApiladas.size();
	}

}
