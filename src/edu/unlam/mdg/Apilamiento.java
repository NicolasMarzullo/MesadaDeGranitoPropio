package edu.unlam.mdg;

import java.util.ArrayList;

public class Apilamiento {
	private ArrayList<Mesada> mesadas;

	public Apilamiento(ArrayList<Mesada> mesas) {
		this.mesadas = mesas;
	}


	public int apilar() {
		//primero busco la mesa mas grande, la que mayor largo Y ancho tenga.

		ArrayList <Mesada> pilas = new ArrayList<>();
		
		
		while(!this.mesadas.isEmpty()) {//mientras haya mesadas
			Mesada mesadaMasGrande = this.mesadas.get(0);	//guardo la primera como mayor
			int indexDeLaMesadaMasGrande = 0;
			
			for(int i = 1; i<this.mesadas.size() ;i++) {
				if(this.mesadas.get(i).esMasGrandeQue(mesadaMasGrande)) {
					mesadaMasGrande = this.mesadas.get(i);
					indexDeLaMesadaMasGrande = i;
				}		
			}
			
			System.out.println(mesadaMasGrande);
			System.out.println(indexDeLaMesadaMasGrande);
			int i = 0;
			
			//busco en que lugar las pilas
			while(i<pilas.size() && !mesadaMasGrande.esApilableCon(pilas.get(i)))
				i++;
				
			if(i == pilas.size()) 
				pilas.add(mesadas.get(indexDeLaMesadaMasGrande));
			else
				pilas.set(i, mesadaMasGrande);
			
			//elimino la que ya apile
			this.mesadas.remove(indexDeLaMesadaMasGrande);
			
		}
						
		return pilas.size();
				
	}
	
	public void mostrar() {
		for(int i =0; i<this.mesadas.size();i++)
			System.out.println(this.mesadas.get(i));
	}
	
	

}
