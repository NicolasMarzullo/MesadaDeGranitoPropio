package edu.unlam.mdg;

import java.util.ArrayList;

public class Apilamiento {
	private ArrayList<Mesada> mesadas;

	public Apilamiento(ArrayList<Mesada> mesas) {
		this.mesadas = mesas;
	}

	
	public void mostrar() {
		for(int i =0; i<this.mesadas.size();i++)
			System.out.println(this.mesadas.get(i));
	}
	
	

}
